package com.biying.services.passport;

import java.util.Hashtable;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class LoginResponse extends BaseObject {

    public String LoginResult;


    public Object getProperty(int index)
    {

    	return LoginResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "LoginResult";
        info.type = new String().getClass();

    }

    public void setProperty(int index, Object value)
    {

    	LoginResult = (String) value;

    }

    public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(NAMESPACE, "LoginResponse", this.getClass());
        
    }

}
