package Patterns.Factory;

import Common.Pattern;
import Patterns.Factory.Impl.HpPotion;
import Patterns.Factory.Impl.HpPotionCreator;
import Patterns.Factory.Impl.MpPotion;
import Patterns.Factory.Impl.MpPotionCreator;

/**
 * FactoryPattern
 * @author Lain
 * ! FactoryPattern은 TemplateMethod 패턴을 포함한다.
 * ! TemplateMethod = 특정 알고리즘의 동작을 여러개의 캡슐화 시키는것
 *
 * 설명 : 반복적인 객체를 생성할때 필요한 알고리즘을 기본정의하고, Factory Class에서 계속하여 같은 인스턴스를 생성
 * 		   할 수 있게 구현한다. 게임의 소모아이템이나 DB Data를 반복적으로 가져와야 하는 경우,
 * 		   다른 소스의 변경 없이 creator 함수만 변경하는 것으로 모든 인스턴스에 영향을 줄 수 있다.
 * 		   모든 패턴은 코드의 구조와 실제 구현의 분리를 최종목표로 한다.
 * 		   (나의 수정한번으로 같은 동작을 하는 모든 필요한 부분에 영향을 줄 수 있다.)
 * 
 * 장점 : 기본 디자인 패턴의 장점을 따름.
 *   
 */
public class FactoryPattern implements Pattern{
	/**
	 * Factory 패턴은 게임을 예제로 한다.
	 * 시나리오는 아래와 같다.
	 * 물약을 생성하는 Creator를 구현한다.
	 * 물약은 생성시 데이터베이스에서 정보를 불러오고, 복사를 방지하기 위한 로그를 남긴다.
	 * 물약은 Item 이라는 Interface를 따르며, Item Interface는 use() 를 가진다.
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub
		HpPotionCreator hpPotionCreator = new HpPotionCreator();
		MpPotionCreator mpPotionCreator = new MpPotionCreator();
		
		HpPotion hpPotion = (HpPotion) hpPotionCreator.create();
		MpPotion mpPotion = (MpPotion) mpPotionCreator.create();
		
		hpPotion.use();
		mpPotion.use();
		
	}

}
