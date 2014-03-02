package com.biying.services.inisession;

import java.util.Hashtable;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class SoapHeaderTestResponse extends BaseObject {

    public String SoapHeaderTestResult;


    public Object getProperty(int index)
    {

    	return SoapHeaderTestResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "SoapHeaderTestResult";
        info.type = new String().getClass();

    }

    public void setProperty(int index, Object value)
    {

    	SoapHeaderTestResult = (String) value;

    }

    public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(NAMESPACE, "SoapHeaderTestResponse", this.getClass());
        
    }

}
