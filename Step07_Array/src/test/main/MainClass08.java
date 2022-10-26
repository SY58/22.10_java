package test.main;

import test.mypac.Bike;

public class MainClass08 {
	public static void main(String[] args) {
		//1.String타입 배열
		String[] names={"바나나","딸기","복숭아","사과","오렌지"};
		
		for(String tmp:names) {
			System.out.println(tmp);
		}
		
		Bike[] bikes=new Bike[3]; 
		//2.Bike타입 배열
		bikes[0]=new Bike();
		bikes[1]=new Bike();
		bikes[2]=new Bike();
		
		for(Bike tmp:bikes) {
			tmp.ride();
		}
	}
}
