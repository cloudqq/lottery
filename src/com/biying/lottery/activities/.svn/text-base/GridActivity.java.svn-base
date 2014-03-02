package com.biying.lottery.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import com.biying.lottery.R;
import com.biying.lottery.components.Ball;

import android.widget.AdapterView.OnItemClickListener;

public class GridActivity extends Activity {
	
	private ArrayList<Ball> balls = null;
	private GridView gv = null;
	
	public ArrayList<Ball> getBalls()
	{
		return this.balls;
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.grid);
		
		gv = (GridView)findViewById(R.id.gridView1);
		
		balls = new ArrayList<Ball>();
		for(int i=0;i<32;i++)
		{
			Ball b = new Ball();
			b.setChecked(false);
			b.setNumber(i);
			
			balls.add(b);
		}
		
		
		gv.setAdapter(new GridItemAdapter(this, balls));
		
		gv.setOnItemClickListener( new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view, int postion,
					long id) {
					
					Ball b = balls.get(postion);
					b.setChecked(!b.getChecked());
					
					StringBuilder sb = new StringBuilder();
					for(int i=0;i<balls.size();i++)
					{
						Ball b1 = balls.get(i);
						if (b1.getChecked())
							sb.append("T["+new Integer(i).toString()+"]");
						else
							sb.append("F["+new Integer(i).toString()+"]");
					}
					
					Log.d("CHECKED+++", sb.toString());
					
					GridItemAdapter adapter = (GridItemAdapter)gv.getAdapter();
					adapter.notifyDataSetChanged();
				
					Log.d("onItemClick:", new Integer(postion).toString());
				 	Toast.makeText(GridActivity.this, "" + postion, Toast.LENGTH_SHORT).show();	
				 	//GridView gv = (GridView)findViewById(R.id.gridView1);
				 	//GridItemAdapter adapter = (GridItemAdapter)gv.getAdapter();
				 	//adapter.notifyDataSetChanged();
				 	//Log.d("ItemClick", "clicked");
			}
			
		});
	}
	
	
}
