package com.biying.services.passport;

import org.ksoap2.serialization.SoapObject;

public class RegActive
{
    private static final String METHOD_NAME = "RegActive";
    private static final String NAMESPACE = "http://services.xyz.com/";

     public String code;
     public String sessionid;


	public SoapObject GetSoapParams()
	{
         SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
     request.addProperty("code", code);
     request.addProperty("sessionid", sessionid);


         return request;
	}

	public String GetSoapAction()
	{
		return NAMESPACE + METHOD_NAME;
	}

}
