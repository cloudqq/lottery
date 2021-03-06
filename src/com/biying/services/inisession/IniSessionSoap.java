package com.biying.services.inisession;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.util.Log;


public final class IniSessionSoap
{

    public String Address = "http://services.xyz.com/inisession.asmx";
    public boolean IsDotNet = true;

    public IniClientAppResponse IniClientApp(IniClientApp params) throws Exception
    {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        new IniClientAppResponse().register(envelope);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address);
        androidHttpTransport.debug = true;

        IniClientAppResponse resp = null;
        try {
        	androidHttpTransport.call(params.GetSoapAction(), envelope);
            resp = (IniClientAppResponse)envelope.bodyIn;
		} catch (Exception e) {
			Log.d("ERR", androidHttpTransport.requestDump);
			Log.d("ERR", androidHttpTransport.responseDump);
			e.printStackTrace();
		}
        return resp;
    }

    public SoapHeaderTestResponse SoapHeaderTest(SoapHeaderTest params) throws Exception
    {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        new SoapHeaderTestResponse().register(envelope);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address);
        androidHttpTransport.call(params.GetSoapAction(), envelope);

        SoapHeaderTestResponse resp = (SoapHeaderTestResponse)envelope.bodyIn;

        return resp;
       
    }

    public TestKeyResponse TestKey(TestKey params) throws Exception
    {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        new TestKeyResponse().register(envelope);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address);
        androidHttpTransport.call(params.GetSoapAction(), envelope);

        TestKeyResponse resp = (TestKeyResponse)envelope.bodyIn;

        return resp;
       
    }

    public GetCountResponse GetCount(GetCount params) throws Exception
    {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        new GetCountResponse().register(envelope);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address);
        androidHttpTransport.call(params.GetSoapAction(), envelope);

        GetCountResponse resp = (GetCountResponse)envelope.bodyIn;

        return resp;
       
    }

    public AliveResponse Alive(Alive params) throws Exception
    {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        new AliveResponse().register(envelope);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address);
        androidHttpTransport.call(params.GetSoapAction(), envelope);

        AliveResponse resp = (AliveResponse)envelope.bodyIn;

        return resp;
       
    }

    public GetTimeResponse GetTime(GetTime params) throws Exception
    {
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.dotNet = IsDotNet;
        envelope.setOutputSoapObject(params.GetSoapParams());

        new GetTimeResponse().register(envelope);

        HttpTransportSE androidHttpTransport = new HttpTransportSE(Address);
        androidHttpTransport.call(params.GetSoapAction(), envelope);

        GetTimeResponse resp = (GetTimeResponse)envelope.bodyIn;

        return resp;
       
    }



}
