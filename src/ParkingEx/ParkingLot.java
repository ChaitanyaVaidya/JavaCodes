package ParkingEx;

import java.util.Scanner;

public class ParkingLot {
	
	Scanner sc=new Scanner(System.in);
	
	int totalSlots=15;
	int n=5;
	int m=10;

	public void bikeBookSlot(){
		System.out.println("Can I park my bike?");
		int bikeSlots=sc.nextInt();
		if(bikeSlots>0 && bikeSlots<n) {
			System.out.println("U can park bike ");
			n=n-bikeSlots;
		//	totalSlots=totalSlots-bikeSlots;
			System.out.println("No of bike slots are free:"+ n);
		}else {
			System.out.println("paring is full");
		}
	}
	
	public void carBookSlot() {
		System.out.println("Can I park my car");
		int carSlots=sc.nextInt();
		if(carSlots>0 && carSlots<6) {
			System.out.println("U can park car ");
			m=m-carSlots;
			totalSlots=totalSlots-carSlots;
			System.out.println("No of slots are free:"+ m);
		}else {
			System.out.println("paring is full");
		}
		
	}
	public static void main(String[] args) {
		ParkingLot pl=new ParkingLot();
		pl.bikeBookSlot();
		pl.carBookSlot();
	}
	

}
