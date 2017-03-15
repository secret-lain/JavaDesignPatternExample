package Patterns.TemplateMethod;

import Common.Pattern;
import Patterns.TemplateMethod.GameConnection.AbsGameConnectHelper;
import Patterns.TemplateMethod.GameConnection.DefaultGameConnectHelper;


/**
 * Template Method Pattern
 * @author admin
 * 설명 : 알고리즘의 구조를 메소드에 정의하고, 하위 클래스에서 알고리즘 구조의 변경없이
 * 		알고리즘을 재정의 하는 패턴..?
 * 		- 구현알고리즘의 프로세스가 정해져있을 경우 (단계별로 생각 가능)
 * 		- 구현 알고리즘이 변경 가능성이 클 경우
 * 
 * 		알고리즘의 단계를 나누고, 단계를 메소드로 선언한다.
 * 		ex) android의 AsyncTask 를 보면,
 * 		preExecute -> doInBackground -> poastExecute 순으로 진행되는데,
 * 		사용자는 이 순서에 따라 세부 코드를 작성한다.
 * 
 * 장점 : 같은 알고리즘을 사용할때, 사용자의 요구사항이 변경되었을때 해당 부분만 깔끔하게 변경해도 다른 부분에 영향을 주지 않는다.
 * 
 */
public class TemplateMethodPattern implements Pattern{

	@Override
	public void run() {
		AbsGameConnectHelper helper = new DefaultGameConnectHelper();
		helper.requestConnection("암호화된접속정보");
	}

}
