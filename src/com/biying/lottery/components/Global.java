package com.biying.lottery.components;

import java.util.ArrayList;

import com.biying.lottery.base.Lottery;

public class Global 
{
	private static Global instance;
	
	private Global()
	{
		lotterys = new ArrayList<Lottery>();
	}
	
	private ArrayList<Lottery> lotterys;
	
	public ArrayList<Lottery> getLotterys() {
		return lotterys;
	}

	public static Global getInstance()
	{
		if(instance == null)
		{
			instance = new Global();
		}
		return instance;
	}
}
