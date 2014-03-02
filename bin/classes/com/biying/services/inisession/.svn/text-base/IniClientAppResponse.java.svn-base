package com.biying.services.inisession;

import java.util.Hashtable;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;


public class IniClientAppResponse extends BaseObject {

    public String IniClientAppResult;


    public Object getProperty(int index)
    {

    	return IniClientAppResult;

    }

    public int getPropertyCount()
    {
        return 1;
    }

    @SuppressWarnings("unchecked")
	public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info)
    {

    	info.name = "IniClientAppResult";
        info.type = new String().getClass();

    }

    public void setProperty(int index, Object value)
    {

    	IniClientAppResult = (String) value;

    }

    public void register(SoapSerializationEnvelope envelope) {
        envelope.addMapping(NAMESPACE, "IniClientAppResponse", this.getClass());
        
    }

}
