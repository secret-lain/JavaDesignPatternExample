package Patterns.Strategy;

import Patterns.Strategy.Weapons.Weapon;

public class GameCharacter {
	private Weapon equippedWeapon;
	
	public void setWeapon(Weapon weapon){
		equippedWeapon = weapon;
	}
	
	//Interface인 Weapon의 attack() 을 호출한다. (Delegate)
	//이때, Weapon이 Sword인지, Spear인지는 상관없이 사용가능하다 
	public void attack(){
		System.out.println(equippedWeapon.attack() + "(으)로 공격했다!");
	}
}
