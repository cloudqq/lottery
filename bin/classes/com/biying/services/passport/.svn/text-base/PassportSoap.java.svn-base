package com.biying.services.passport;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.util.Log;


public final class PassportSoap
{

    public String Address = "http://services.xyz.com/User/Passport.asmx?WSDL";
    public boolean IsDotNet = true;

    public LoginResponse Login(Login params) throws Exception
    {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        new LoginResponse().register(envelope);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address);
        androidHttpTransport.call(params.GetSoapAction(), envelope);

        LoginResponse resp = (LoginResponse)envelope.bodyIn;

        return resp;
       
    }

    public RegisterResponse Register(Register params) throws Exception
    {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        new RegisterResponse().register(envelope);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address);
        
        androidHttpTransport.debug = true;
        
        RegisterResponse resp = null ;
        try {
        	androidHttpTransport.call(params.GetSoapAction(), envelope);
            resp = (RegisterResponse)envelope.bodyIn;
		} catch (Exception e) {
			Log.d("ERR", androidHttpTransport.requestDump);
			Log.d("ERR", androidHttpTransport.responseDump);
			e.printStackTrace();
		}
        
        return resp;
       
    }

    public RegActiveResponse RegActive(RegActive params) throws Exception
    {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        new RegActiveResponse().register(envelope);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address);
        androidHttpTransport.call(params.GetSoapAction(), envelope);

        RegActiveResponse resp = (RegActiveResponse)envelope.bodyIn;

        return resp;
       
    }

    public GetCodeResponse GetCode(GetCode params) throws Exception
    {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        new GetCodeResponse().register(envelope);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address);
        androidHttpTransport.call(params.GetSoapAction(), envelope);

        GetCodeResponse resp = (GetCodeResponse)envelope.bodyIn;

        return resp;
       
    }



}
