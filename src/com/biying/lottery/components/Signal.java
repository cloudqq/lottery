package com.biying.lottery.components;

import java.util.ArrayList;

import com.biying.lottery.interfaces.IDispatcher;
import com.biying.lottery.interfaces.ISignal;

public class Signal implements ISignal, IDispatcher 
{
	private ArrayList<IDispatcher> listeners;
	private ArrayList<IDispatcher> onceListeners;

	public Signal()
	{
		listeners = new ArrayList<IDispatcher>();
		onceListeners = new ArrayList<IDispatcher>();
	}
	
	@Override
	public void add(IDispatcher listener) {
		registerListener(listener);
	}

	@Override
	public void addonce(IDispatcher listener) {
		if(registerListener(listener))
			onceListeners.add(listener);
	}

	@Override
	public void remove(IDispatcher listener) {
		listeners.remove(listener);
		onceListeners.remove(listener);
	}

	@Override
	public <T> void dispatch(T result) {
		for (IDispatcher dispatcher : listeners) {
			dispatcher.dispatch(result);
		}
		
		for (IDispatcher dispatcher : onceListeners)
		{
			listeners.remove(dispatcher);			
		}
		onceListeners.removeAll(onceListeners);
	}

	protected boolean registerListener(IDispatcher listener) {
		if(listeners.indexOf(listener) >= 0)
			return false;
		listeners.add(listener);
		return true;
	}
	
}
