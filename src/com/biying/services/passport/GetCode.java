package com.biying.services.passport;

import org.ksoap2.serialization.SoapObject;

public class GetCode
{
    private static final String METHOD_NAME = "GetCode";
    private static final String NAMESPACE = "http://services.xyz.com/";

     public String ant;
     public String sessionid;


	public SoapObject GetSoapParams()
	{
         SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
     request.addProperty("ant", ant);
     request.addProperty("sessionid", sessionid);


         return request;
	}

	public String GetSoapAction()
	{
		return NAMESPACE + METHOD_NAME;
	}

}
