package com.biying.services.passport;

import java.util.Hashtable;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class GetCodeResponse extends BaseObject {

    public String GetCodeResult;


    public Object getProperty(int index)
    {

    	return GetCodeResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "GetCodeResult";
        info.type = new String().getClass();

    }

    public void setProperty(int index, Object value)
    {

    	GetCodeResult = (String) value;

    }

    public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(NAMESPACE, "GetCodeResponse", this.getClass());
        
    }

}
