package com.biying.services.inisession;

import org.ksoap2.serialization.SoapObject;

public class SoapHeaderTest
{
    private static final String METHOD_NAME = "/SoapHeaderTest";
    private static final String NAMESPACE = "http://services.xyz.com";

     public String sessionid;


	public SoapObject GetSoapParams()
	{
         SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
     request.addProperty("sessionid", sessionid);


         return request;
	}

	public String GetSoapAction()
	{
		return NAMESPACE + METHOD_NAME;
	}

}
