package Patterns.Adapter;

import Common.Pattern;

/**
 * Adapter Pattern
 * @author admin
 *
 * 설명 : 특정 객체의 Method을 다른 형태로 변환하여 사용하고자 할때.
 * 		예를들어 A기능의 반환은 원래 Double일 때, Adapter를 거쳐 어떤 행위나 String 등으로
 * 		반환시킬 수 있게 만든다.
 * 		기능명시는 같으나 다양한 객체들에서 다른 결과를 요구하는 경우 사용 가능하다.
 * 		A -> Adapter -> A' 결과를 낼 수 있다
 * 		굳이 필요한 이유는, A가 라이브러리형태로 제공되는 경우,
 * 		결과 사이에 Log를 출력하거나 요구사항에 맞춘 결과로 바꿔 주기위해
 * 		(알고리즘을 원하는 요구사항에 맞게 변경할 수 있다) 
 * 		간단히 보자면 110V 콘센트에 220V 어댑터를 끼우면 220V로 출력되는것.
 * 
 * 장점 : 사용하는 객체측의 코드를 변경할 필요 없이 요구사항에 맞춰 변경할 수 있다.
 * (Android RecyclerView 의 Adapter를 생각해보면,
 * RecyclerView는 같으나 Adapter에 구현한 코드에 의해 다양한 형태로 출력되는 것이다.)
 *   
 */
public class AdapterPattern implements Pattern {

	/**
	 * Math는 int 지만 adapter를 통해 String이 반환되는 결과를 볼 수 있다.
	 * 코드상에서는 사실 별 차이 없다...
	 */
	@Override
	public void run() {
		AdapterImpl adapter = new AdapterImpl();
		
		System.out.println(adapter.doubleValue(100));
		System.out.println(adapter.halfValue(50));
	}

}
