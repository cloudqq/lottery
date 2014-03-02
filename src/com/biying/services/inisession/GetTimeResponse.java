package com.biying.services.inisession;

import java.util.Hashtable;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetTimeResponse extends BaseObject {

    public String GetTimeResult;


    public Object getProperty(int index)
    {

    	return GetTimeResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetTimeResult";
        info.type = new String().getClass();

    }

    public void setProperty(int index, Object value)
    {

    	GetTimeResult = (String) value;

    }

    public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(NAMESPACE, "GetTimeResponse", this.getClass());
        
    }

}
