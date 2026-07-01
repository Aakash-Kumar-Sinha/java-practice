package org.phone;

public class PhoneInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInfo ph = new PhoneInfo();
		ph.phoneName();
		ph.phoneMieiNum();
		ph.camera();
		ph.storage();
		ph.osName();
	}
	
	public void phoneName() {
		System.out.println("Phone Name");
	}
	
	public void phoneMieiNum() {
		System.out.println("Phone Miei Num");
	}
	
	public void camera() {
		System.out.println("Camera");
	}
	
	public void storage() {
		System.out.println("Storage");
	}
	
	public void osName() {
		System.out.println("Operating System Name");
	}

}
