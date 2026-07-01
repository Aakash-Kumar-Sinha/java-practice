package org.phone;

public class InternalStorage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InternalStorage intStr = new InternalStorage();
		ExternalStorage extStr = new ExternalStorage();
		
		intStr.processorName();
		intStr.ramSize();
		
		extStr.size();
	}
	
	public void processorName() {
		System.out.println("Processor Name");
	}
	
	public void ramSize() {
		System.out.println("Ram Size");
	}

}
