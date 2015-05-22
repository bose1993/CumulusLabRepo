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
        	    var sig = new KJUR.crypto.Signature({"alg": "SHA1withRSA", "prov": "cryptojs/jsrsa"});
        	    var p = new RSAKey();
        	    p.readPrivateKeyFromPEMString($scope.pem);
        	    sig.initSign(p);
        	    sig.updateString(data);
        	    console.log(sig.sign());
        	  }).
        	  error(function(data, status, headers, config) {
        	   console.log(status);
        	  });
        };


        $scope.clear = function () {
            $scope.cminstance = {modelid: null, templateid: null, xml: null, version: null, master: null, templateversion: null, id: null};
        };
    });
