package com.biying.lottery.activities;

public class Ball {
		private boolean checked;
		int number;
		
		public void setChecked(boolean c)
		{
			this.checked = c;
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
