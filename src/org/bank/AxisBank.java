package org.bank;

public class AxisBank extends BankInfo{
	
	 @Override
	public void DEPOSIT() {
		// TODO Auto-generated method stub
		super.DEPOSIT();
	}
	@Override
	public void FIXED(int b) {
		// TODO Auto-generated method stub
		super.FIXED(b);
	}
	@Override
	public void SAVING() {
		// TODO Auto-generated method stub
		super.SAVING();
	}
	
		public static void main(String[] args){
			AxisBank b= new AxisBank();
			b.FIXED(30);
			b.SAVING();
			
			
			
		}
}
