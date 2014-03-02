package com.biying.services.inisession;

import org.ksoap2.serialization.SoapObject;

public class IniClientApp
{
    private static final String METHOD_NAME = "/IniClientApp";
    private static final String NAMESPACE = "http://services.xyz.com";

	public SoapObject GetSoapParams()
	{
         SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);

         return request;
	}

	public String GetSoapAction()
	{
		return NAMESPACE + METHOD_NAME;
	}

}
