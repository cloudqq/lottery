package com.biying.lottery.activities;


import java.io.IOException;

import org.xmlpull.v1.XmlPullParserException;

import android.app.ActivityGroup;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.biying.lottery.R;
import com.biying.lottery.base.BallGroup;
import com.biying.lottery.base.Lottery;
import com.biying.lottery.base.LotteryMode;
import com.biying.lottery.components.Global;

public class MainActivity extends ActivityGroup {
	
	private FrameLayout container = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
//		try {
//			loadSettings();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		}
//		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.main_activity);
		
		container = (FrameLayout)findViewById(R.id.containerBody);
		
		ImageView btn_hall = (ImageView)findViewById(R.id.btn_hall);
		btn_hall.setOnClickListener(new OnClickListener() {
			
			@SuppressWarnings("null")
			@Override
			public void onClick(View v) {
				Log.d("CLICK:", "btn_hall_click");
				container.removeAllViews();
				container.addView(
						getLocalActivityManager().startActivity("module_hall"
										,new Intent(MainActivity.this, HallActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
										.getDecorView());
				
				  
			}
		});
		
		ImageView btn_mine = (ImageView)findViewById(R.id.btn_mine);
		btn_mine.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d("CLICK:", "btn_mine_click");
				container.removeAllViews();
				container.addView(
						getLocalActivityManager().startActivity("module_mine",
								new Intent(MainActivity.this, MineActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
						.getDecorView());
			}
		});
		
		ImageView btn_more = (ImageView)findViewById(R.id.btn_more);
		btn_more.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d("CLICK:", "btn_more_click");
				container.removeAllViews();
				container.addView(
						getLocalActivityManager().startActivity("module_more",
								new Intent(MainActivity.this, MoreActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
								.getDecorView()
				);
			}
		});
		
		ImageView btn_test = (ImageView)findViewById(R.id.btn_test_network);
		btn_test.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Log.d("CLICK:", "btn_test_click");
				container.removeAllViews();
				container.addView(
						getLocalActivityManager().startActivity("module_network",
								new Intent(MainActivity.this, NetworkActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
								.getDecorView()
						);
			}
		});
	}
	
	private void loadSettings() throws ClassNotFoundException, IllegalAccessException, InstantiationException
	{
		Resources res = getResources();
		XmlResourceParser xrp = res.getXml(R.xml.lottery);
		try 
		{  
            //濡傛灉娌℃湁鍒版枃浠跺熬缁х画鎵ц 
			Lottery lottery = null;
        	LotteryMode mode = null;
        	String nameSpace = "";
            while (xrp.getEventType() != XmlResourceParser.END_DOCUMENT) 
            {
            	//濡傛灉鏄紑濮嬫爣绛�                if (xrp.getEventType() == XmlResourceParser.START_TAG) 
                {  
                	String name = xrp.getName();
                	if(name.equals("lottery"))
                	{
                		String type = xrp.getAttributeValue(null, "type");
                		nameSpace = xrp.getAttributeValue(null, "space");
                		Class<?> cls = Class.forName(nameSpace + "." + xrp.getAttributeValue(null, "cls"));
            			lottery = (Lottery) cls.newInstance();
            			lottery.setName(xrp.getAttributeValue(null, "name"));
            			Global.getInstance().getLotterys().add(lottery);
                	}
                	else if(name.equals("lotteryMode"))
                	{
                		Class<?> cls = Class.forName(nameSpace + "." + xrp.getAttributeValue(null, "cls"));
                		mode = (LotteryMode) cls.newInstance();
                		mode.setLottery(lottery);
                		mode.setModeName(xrp.getAttributeValue(null, "name"));
                		lottery.getModes().add(mode);
                	}
                	else if(name.equals("ballGroup"))
                	{
                		Class<?> cls = Class.forName(nameSpace + "." + xrp.getAttributeValue(null, "cls"));
                		BallGroup group = (BallGroup) cls.newInstance();// new BallGroup(mode, xrp.getAttributeValue(null, "name"));
                		group.setMode(mode);
                		group.setGroupName(xrp.getAttributeValue(null, "name"));
                		group.setBallLength(Integer.parseInt(xrp.getAttributeValue(null, "ballLength")));
                		group.setMinBalls(Integer.parseInt(xrp.getAttributeValue(null, "minBalls")));
                		group.setMaxBalls(Integer.parseInt(xrp.getAttributeValue(null, "maxBalls")));
                		mode.getGroups().add(group);
                	}
                }
                xrp.next();   
            }
		}
		catch (XmlPullParserException e) 
		{  
            e.printStackTrace();  
        }
		catch (IOException e) 
		{  
            e.printStackTrace();  
        } 
		finally 
		{
		}
		Log.d("settings", "loaded");
	}
}
