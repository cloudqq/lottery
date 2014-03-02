package com.biying.services.inisession;

import java.util.Hashtable;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetCountResponse extends BaseObject {

    public String GetCountResult;


    public Object getProperty(int index)
    {

    	return GetCountResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetCountResult";
        info.type = new String().getClass();

    }

    public void setProperty(int index, Object value)
    {

    	GetCountResult = (String) value;

    }

    public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(NAMESPACE, "GetCountResponse", this.getClass());
        
    }

}
