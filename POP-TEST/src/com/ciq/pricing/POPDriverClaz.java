package com.ciq.pricing;

public class POPDriverClaz {

	public static void main(String[] args) {
		
		System.out.println("*******************************");
		
		POPProjectClaz pop = new POPProjectClaz();
		
		System.out.println(pop.getProjectInfo());
		
		UPSTClass upst = new UPSTClass();
		System.out.println(upst.getProjectName());
		
		System.out.println("*******************************");
	}
}
