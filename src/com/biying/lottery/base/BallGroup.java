package com.biying.lottery.base;

import java.util.ArrayList;

import android.util.Log;

import com.biying.lottery.components.Ball;
import com.biying.lottery.components.Signal;
import com.biying.lottery.interfaces.IDispatcher;

public abstract class BallGroup 
{
	

	private int ballLength;
	private int minBalls;
	private int maxBalls;
	private String groupName;
	private ArrayList<Ball> balls;
	private ArrayList<Ball> selectedBalls;
	private Signal onBallClick;
	private LotteryMode mode;
	
	public BallGroup()
	{
		balls = new ArrayList<Ball>();
		selectedBalls = new ArrayList<Ball>();
		onBallClick = new Signal();
		onBallClick.add(onBallClickCallBack);
	}
	
	public LotteryMode getMode() {
		return mode;
	}

	public void setMode(LotteryMode mode) {
		this.mode = mode;
	}
	
	public ArrayList<Ball> getBalls() {
		return balls;
	}
	
	public Signal getOnBallClick() {
		return onBallClick;
	}
	
	public void setOnBallClick(Signal onBallClick) {
		this.onBallClick = onBallClick;
	}
	
	private IDispatcher onBallClickCallBack = new IDispatcher() {
		
		@Override
		public <T> void dispatch(T result) {
			
			Ball ball = (Ball)result;
			Log.d("ballcallback", new Integer(ball.getNumber()).toString());
			if(ball.getChecked())
				selectedBalls.remove(ball);
			else
				selectedBalls.add(ball);
		}
	};
	
	public String toString()
	{
		String str = ""; 
		for(Ball ball : selectedBalls)
		{
			str += String.format("%d ", ball.getNumber());			
		}
		return str;
	}
	
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public void setBallLength(int value)
	{
		this.ballLength = value;
		this.balls = new ArrayList<Ball>();
		for(int i = 1; i <= value; i++)
		{
			balls.add(new Ball(this, i));
		}
	}
	
	public int getBallLength()
	{
		return this.ballLength;
	}

	public int getMaxBalls() {
		return maxBalls;
	}

	public void setMaxBalls(int maxBalls) {
		this.maxBalls = maxBalls;
	}

	public int getMinBalls() {
		return minBalls;
	}

	public void setMinBalls(int minBalls) {
		this.minBalls = minBalls;
	}
}