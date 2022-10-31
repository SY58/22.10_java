package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class TestMain {
	public static void main(String[] args) {
		//Weapon type의 참조값을 담을수있는 w라는 지역변수 만들기(w는 아직 빈 상태)
		Weapon w=new MyWeapon();
		w.prepare();
		w.attack();
	}
}
