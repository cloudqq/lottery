package com.biying.lottery.activities;
import java.net.ResponseCache;
import java.net.URI;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;

import com.biying.lottery.R;
import com.biying.services.inisession.BwinSoapHeader;
import com.biying.services.inisession.IniClientApp;
import com.biying.services.inisession.IniClientAppResponse;
import com.biying.services.inisession.IniSessionSoap;
import com.biying.services.passport.PassportSoap;
import com.biying.services.passport.Register;
import com.biying.services.passport.RegisterResponse;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.net.http.*;


public class NetworkActivity extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.network_activity);
		
		Button btn_test_register = (Button)findViewById(R.id.btn_test_register);
		btn_test_register.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				PassportSoap passport = new PassportSoap();
				Register registerParams = new Register();
				registerParams.ant = "cloudqq";
				registerParams.pwd = "123456";
				registerParams.nickname = "���͵�";
				registerParams.sessionid = "";
				registerParams.type = 2;
				try {
					RegisterResponse response = passport.Register(registerParams);
					Log.d("WEBSERVICE", response.RegisterResult);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Button btn_test_session = (Button)findViewById(R.id.btn_get_session);
		btn_test_session.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				DefaultHttpClient client = new DefaultHttpClient();
				HttpGet request = new HttpGet("http://www.baidu.com");
				request.addHeader("User-Agent", "android");
				
				try {
					HttpResponse resp = client.execute(request);

					StatusLine status = resp.getStatusLine();
					Log.d("STATUS",new Integer(status.getStatusCode()).toString());
					
				} catch (Exception e) {
						e.printStackTrace();
				}
			}
		});
	}
}
