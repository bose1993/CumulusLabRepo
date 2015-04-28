package com.cumulus.repo.lab.xml.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;


public class JaxbUnmarshal {   
    String XML;
    String context;
    JAXBContext jaxbContext;
    InputStream InpStr; 
    /*
    public static void main(String[] args)  throws FileNotFoundException, IOException, JAXBException{
    	 String xml="";
    	try(BufferedReader br = new BufferedReader(new FileReader("/home/ebosetti/Documents/workspace-sts-3.6.3.SR1/Cumulus/instance1.xml"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine(); 

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
          xml = sb.toString();
        }
     	JaxbUnmarshal jx=new JaxbUnmarshal(xml,"com.cumulus.repo.xml.template");
     	
		Object result = jx.getUnmarshalledObject();
		if(result instanceof JAXBElement){
			@SuppressWarnings("unchecked")
			JAXBElement<TestCertificationModel> obj = (JAXBElement<TestCertificationModel>) result;
			TestCertificationModel t = obj.getValue();
			System.out.println(t.getCertificationModelTemplateID());
		}else{
			throw new JAXBException("Error during Marshaling");
		}
     	
		
     	
    }
    */
    public JaxbUnmarshal(String XML, String context){
        this.XML=XML;
        this.context=context;
        try {
            jaxbContext = JAXBContext.newInstance (context);
        } catch (JAXBException e) {        
            e.printStackTrace();
        }
    }
    public Object getUnmarshalledObject(){
            Unmarshaller unmarshaller=null;
	    Object objectJAXB=null;
	    try {          
	        unmarshaller = jaxbContext.createUnmarshaller (); 
	        StringBuffer xmlStr = new StringBuffer(XML);
	        objectJAXB = unmarshaller.unmarshal( new StreamSource( new StringReader( xmlStr.toString() ) ) );
	        } catch (JAXBException e) {        
	            e.printStackTrace();
	        }         
	     return objectJAXB;         
    }
}