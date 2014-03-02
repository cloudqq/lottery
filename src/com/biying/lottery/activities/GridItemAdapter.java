package com.biying.lottery.activities;

import java.util.ArrayList;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;
import com.biying.lottery.R;
import com.biying.lottery.components.Ball;

public class GridItemAdapter extends BaseAdapter {
	private Context context;
	 
	private ArrayList<Ball> balllist;
	
	public GridItemAdapter(Context c, ArrayList<Ball> balls) {
		
		Log.d("GRID:","NEW GRID");
		context = c;
		
		this.balllist = balls;
		
		Log.d("GRID_COUNT:", new Integer(balllist.size()).toString());
	}
	
	public int getCount() {
		Log.d("GRID:", new Integer( balllist.size()).toString());
		return balllist.size();
	}

	public Object getItem(int position) {
		return balllist.get(position);
	}

	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		TextView tv;
		Ball ball = balllist.get(position);
		if(convertView == null)
		{
			Log.d("BALL:", "POS:"+ new Integer(position).toString() + " " + "NUM:"+ new Integer(ball.getNumber()).toString());
			
			tv = new TextView(context);
			tv.setLayoutParams(new GridView.LayoutParams(30,33));
			tv.setGravity(17);
			
			//tv.setClickable(false);
			Log.d("getView:pos", new Integer(position).toString() );
			tv.setBackgroundResource(R.drawable.ball_gray);
		}
		else 
		{
			tv = (TextView)convertView;
			ball = balllist.get(position);
			if (ball.getChecked())
			{
				Log.d("CHECKED:", new Integer(position).toString() + " TRUE");
				tv.setBackgroundResource(R.drawable.ball_red);
			}
			else
			{
				Log.d("CHECKED:", new Integer(position).toString() + " FALSE");
				tv.setBackgroundResource(R.drawable.ball_gray);
			}
		}
		tv.setText(new Integer(ball.getNumber()).toString());
		
		return tv;
	}

}
