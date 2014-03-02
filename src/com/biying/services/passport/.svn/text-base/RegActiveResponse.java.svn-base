package com.biying.services.passport;

import java.util.Hashtable;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class RegActiveResponse extends BaseObject {

    public String RegActiveResult;


    public Object getProperty(int index)
    {

    	return RegActiveResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "RegActiveResult";
        info.type = new String().getClass();

    }

    public void setProperty(int index, Object value)
    {

    	RegActiveResult = (String) value;

    }

    public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(NAMESPACE, "RegActiveResponse", this.getClass());
        
    }

}
