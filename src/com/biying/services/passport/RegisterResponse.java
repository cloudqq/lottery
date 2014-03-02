package com.biying.services.passport;

import java.util.Hashtable;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class RegisterResponse extends BaseObject {

    public String RegisterResult;


    public Object getProperty(int index)
    {

    	return RegisterResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "RegisterResult";
        info.type = new String().getClass();

    }

    public void setProperty(int index, Object value)
    {

    	RegisterResult = (String) value;

    }

    public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(NAMESPACE, "RegisterResponse", this.getClass());
        
    }

}
