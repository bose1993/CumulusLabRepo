'use strict';

angular.module('cumuluslabrepoApp')
    .controller('CminstanceControllerService', function ($scope, CminstanceService,$http, Ca, Toc, Property, User, ParseLinks,Principal) {
        $scope.cminstances = [];
        
        $scope.propertys = Property.query();
        $scope.isInRole = Principal.isInRole;
        $scope.XML = "";

        $scope.send = function () {
        	$http.post('/service/cminstances/canonicalize',$scope.XML).
        	  success(function(data, status, headers, config) {
        	    console.log(data);
        	    
        		
        	    // DOM parsing object
        	    var parser = new DOMParser(),
        	 	
        	    // XML DOM object
        	    xmlObject1 = parser.parseFromString(data ,"text/xml");
        	    //var tbm=xmlObject1.getElementsByTagName("testBasedCertifcationModel")[0];
        	    var tbm=xmlObject1.documentElement;
        	    var y=xmlObject1.createElement("Signature");
        	    y.setAttribute("xmlns","http://www.w3.org/2000/09/xmldsig#");
        	    tbm.appendChild(y);

        	    var SignedInfo=xmlObject1.createElement("SignedInfo");
        	    var CanonicalizationMethod = xmlObject1.createElement("CanonicalizationMethod");
        	    CanonicalizationMethod.setAttribute("Algorithm","http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
        	    SignedInfo.appendChild(CanonicalizationMethod);
        	    var SignatureMethod = xmlObject1.createElement("SignatureMethod");
        	    SignatureMethod.setAttribute("Algorithm","http://www.w3.org/2000/09/xmldsig#rsa-sha1");
        	    SignedInfo.appendChild(SignatureMethod);
        	    
        	    var Reference = xmlObject1.createElement("Reference");
        	    Reference.setAttribute("URI","");
        	    
        	    var Transforms = xmlObject1.createElement("Transforms");
        	    var Trasform = xmlObject1.createElement("Transform");
        	    Trasform.setAttribute("Algorithm","http://www.w3.org/2000/09/xmldsig#enveloped-signature");
        	    Transforms.appendChild(Trasform);
        	    Reference.appendChild(Transforms);

        	    
        	    var DigestMethod = xmlObject1.createElement("DigestMethod");
        	    DigestMethod.setAttribute("Algorithm","http://www.w3.org/2000/09/xmldsig#sha1");
        	    Reference.appendChild(DigestMethod);
        	    var hash = CryptoJS.SHA1(data);
        	    var base64Hash = hash.toString(CryptoJS.enc.Base64);
        	    var DigestValue = xmlObject1.createElement("DigestValue");
        	    var digestnode = document.createTextNode(base64Hash);
        	    DigestValue.appendChild(digestnode);
        	    Reference.appendChild(DigestValue)
        	    SignedInfo.appendChild(Reference);
        	    y.appendChild(SignedInfo);
        	    var newXML = new XMLSerializer().serializeToString(xmlObject1);
        	    
        	    console.log(newXML);

        	    $http.post('/service/cminstances/canonicalize/signatureinfo',newXML).
          	  		success(function(data, status, headers, config) {
	          	  		var sig = new KJUR.crypto.Signature({"alg": "SHA1withRSA", "prov": "cryptojs/jsrsa"});
	            	    var p = new RSAKey();
          	  			console.log("Nuovo XML con SignedInfo canonicalizzato raw: "+data);


	            	    p.readPrivateKeyFromPEMString($scope.pem);
	            	    sig.initSign(p);
	            	    sig.updateString(data);
	            	    var signedHash = sig.sign();
	            	    console.log(signedHash);
	            	    console.log(SignedInfo);
	            	  
	            	    var hashSignedInfo = CryptoJS.SHA1(data);
	            	    var hashSignedInfoB64 = hashSignedInfo.toString(CryptoJS.enc.Base64);
	            	    console.log("Hash signed Info:"+hashSignedInfoB64)
	            	    //var signedHash=p.signString(SignedInfo,"sha1");
	            	    
	            	    var SignatureValue = xmlObject1.createElement("SignatureValue");
	            	    console.log(signedHash);
	            	    var base64Sign = btoa(String.fromCharCode.apply(null,
	            	    		signedHash.replace(/\r|\n/g, "").replace(/([\da-fA-F]{2}) ?/g, "0x$1 ").replace(/ +$/, "").split(" "))
	            	    	  );
	            	    
	            	    var SignatureValueString = document.createTextNode(base64Sign);
	            	    //var SignatureValueString = document.createTextNode("irtaUt/9Sw+Joo6z7nIwwiZeNvo8al6eFr9v/9hTcnlG8GgnOYMPBWUqKAXTEyLa8Lbuuq2e0CY5GU7XesPDieP7d4RG7O0an9H7QTkG8bsIvX41fOlJ3DsMLrFteJoiii7iANKWD00GX5YuSISPFxPZ9xAilYyy33Ai3Q8kbXo1j8tEH52bGWXzjArX+zrB07ygWCPvVm92ihdzlycpDFX6c/pC1F6B+L87gWjESzbjprQdQD13mDlvQiOWA+TCBsf0PIqloWqhBrgZXn/zsc9OuY4tMLIPjv4D1dgI8NpFArFKVWvLtxT6inYU0afTkK/+SCTlzPmqwKZgj7MXIQ==");
	            	    SignatureValue.appendChild(SignatureValueString);
	            	    console.log(base64Sign);
	            	    //console.log(hextob64nl(signedHash));
	            	    y.appendChild(SignatureValue);
	            	    
	            	    //console.log(y.toString());
	            	   
	            	    var newXML1 = new XMLSerializer().serializeToString(xmlObject1);
	            	    console.log(newXML1);
	            	    $http.post('/service/cminstances/',newXML1).
	    		         success(function(data, status, headers, config) {
	    		        	 
	    		        	 alert("success!!!");
	    		          	 }).
	    		       	 error(function(data, status, headers, config) {
	    		       		alert(header);
	    		       	  });
          	  			
	          	  	}).
		          	error(function(data, status, headers, config) {
		          	});
        	    
          	  
        	    
        	    //console.log(sig.getDigestInfoHex());

        	  }).
        	  error(function(data, status, headers, config) {
        	   console.log(sha1(data));
        	  });
        };


        $scope.clear = function () {
            $scope.cminstance = {modelid: null, templateid: null, xml: null, version: null, master: null, templateversion: null, id: null};
        };
    });

function hexToBase64(str) {
	  return 
}
