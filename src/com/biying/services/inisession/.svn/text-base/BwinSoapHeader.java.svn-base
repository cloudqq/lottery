package com.biying.services.inisession;

import java.util.Hashtable;

import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;

public class BwinSoapHeader extends BaseObject {

     public String UserName;
     public String Password;


    public Object getProperty(int index)
    {
    	switch (index)
    	{
           case 0: 
                return UserName; 
           case 1: 
                return Password; 

    	}

    	return null;
    }

    public int getPropertyCount()
    {
        return 2;
    }

    @SuppressWarnings("unchecked")
    public void getPropertyInfo(int index, Hashtable properties, PropertyInfo info) {
    	//info.type = PropertyInfo.STRING_CLASS;
    	switch (index) {

           case 0: 
                info.name = "UserName"; 
                info.type = UserName.getClass(); 
                             break; 
           case 1: 
                info.name = "Password"; 
                info.type = Password.getClass(); 
                             break; 

        default:
            break;
        }
    }

    public void setProperty(int index, Object value)
    {
    	switch (index)
    	{
           case 0: 
                UserName = (String)value; 
                  break; 
           case 1: 
                Password = (String)value; 
                  break; 

    	}

    }

    public void register(SoapSerializationEnvelope envelope)
    {
        envelope.addMapping(NAMESPACE, "BwinSoapHeader", this.getClass());
        
    }

}
