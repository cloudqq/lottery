package com.biying.services.inisession;

import org.ksoap2.serialization.SoapObject;

public class GetCount
{
    private static final String METHOD_NAME = "/GetCount";
    private static final String NAMESPACE = "http://services.xyz.com";

     public String sessionid;
     public String info;


	public SoapObject GetSoapParams()
	{
         SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
     request.addProperty("sessionid", sessionid);
     request.addProperty("info", info);


         return request;
	}

	public String GetSoapAction()
	{
		return NAMESPACE + METHOD_NAME;
	}

}
