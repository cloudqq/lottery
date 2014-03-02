package com.biying.services.inisession;

import java.util.Hashtable;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class TestKeyResponse extends BaseObject {

    public String TestKeyResult;


    public Object getProperty(int index)
    {

    	return TestKeyResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "TestKeyResult";
        info.type = new String().getClass();

    }

    public void setProperty(int index, Object value)
    {

    	TestKeyResult = (String) value;

    }

    public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(NAMESPACE, "TestKeyResponse", this.getClass());
        
    }

}
