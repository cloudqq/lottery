package com.biying.services.inisession;

import java.util.Hashtable;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class AliveResponse extends BaseObject {

    public String AliveResult;


    public Object getProperty(int index)
    {

    	return AliveResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "AliveResult";
        info.type = new String().getClass();

    }

    public void setProperty(int index, Object value)
    {

    	AliveResult = (String) value;

    }

    public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(NAMESPACE, "AliveResponse", this.getClass());
        
    }

}
