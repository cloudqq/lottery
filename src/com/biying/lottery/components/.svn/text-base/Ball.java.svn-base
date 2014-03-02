package com.biying.lottery.components;

import com.biying.lottery.base.BallGroup;

public class Ball {
	private BallGroup group;
	private boolean checked;
	private int number;
	
	public Ball(){}
	
	public Ball(BallGroup group, int number)
	{
		this.group = group;
		this.number = number;
	}
	
	public void setChecked(boolean c)
	{
		this.checked = c;
		this.group.getOnBallClick().dispatch(this);
	}
	
	public boolean getChecked()
	{
		return this.checked;
	}
	
	public void setNumber(int n)
	{
		this.number = n;
	}
	
	public int getNumber()
	{
		return this.number;
	}
}
