package Common;

import Patterns.Adapter.AdapterPattern;
import Patterns.Factory.FactoryPattern;
import Patterns.Strategy.StrategyPattern;
import Patterns.TemplateMethod.TemplateMethodPattern;

public class Main {	
	public static void main(String args[]){
		/**
		 * Pattern 목록
		 * - Strategy 패턴 ) Inteface로 Delegation한다.
		 * - Adapter 패턴 ) Adapter를 통해 기존 객체의 반환값을 요구사항에 맞춰 반환값을 변경시킬 수 있다.
		 * - TemplateMethod 패턴 ) 특정 알고리즘의 순서를 전부 method로 쪼개, 변경시 해당 부분만 바꿀 수 있도록 만들 수 있다.
		 * 						 (유지보수상 좋아짐, 보안요구사항같이 자주 바뀔 수 있는 경우)
		 * - Factory 패턴 ) 특정객체를 생성하기까지의 알고리즘을 템플릿메소드패턴으로 기정의하고, 동일한 객체를 계속 생성함
		 */
		
		//new StrategyPattern().run();
		//new AdapterPattern().run();
		//new TemplateMethodPattern().run();
		new FactoryPattern().run();
	}
}
