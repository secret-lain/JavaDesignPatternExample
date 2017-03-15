package Patterns.Strategy;

import Common.Pattern;
import Patterns.Strategy.Weapons.Spear;
import Patterns.Strategy.Weapons.Sword;

/**
 * Strategy(전략) Pattern
 * @author admin
 *
 * 설명 : Interface에 함수를 정의하고, 해당 함수를 통해 다른 객체의 함수를 호출하는 방식.
 * 		단순히 보면 Interface의 method 로서 set 된 객체의 함수를 불러온다고 생각하면 됨.
 * 장점 : 같은 기능을 수행하는 객체의 새로운 추가시, 별다른 코드의 추가 없이 객체를 추가할 수 있다.
 * (객체간 Dependency를 줄일 수 있음)
 *   
 */
public class StrategyPattern implements Pattern{
	@Override
	public void run() {
		/**
		 * 예제 시나리오
		 * class Character는 weapon을 가진다.
		 * weapon은 interface로, weapon이 할 수 있는 것은 공격이라는 기능이 있다.
		 * 
		 * 무기들은 각자 객체로 구현되고, 공격을 꼭 가지게 된다.
		 * Character는 무기를 장착할 수 있고(setWeapon)
		 * 장착한 무기를 사용할 수 있다.
		 */
		
		System.out.println("게임 캐릭터 생성");
		GameCharacter gCharacter = new GameCharacter();
		
		//무기 생성
		Sword sword = new Sword();
		Spear spear = new Spear();
		
		//무기 선택
		gCharacter.setWeapon(sword);
		
		System.out.println("무기 공격");
		gCharacter.attack();
		System.out.println("무기 교체 후 재 공격");
		
		gCharacter.setWeapon(spear);
		gCharacter.attack();
	}

}
