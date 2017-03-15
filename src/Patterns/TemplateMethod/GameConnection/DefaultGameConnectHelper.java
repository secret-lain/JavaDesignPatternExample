package Patterns.TemplateMethod.GameConnection;

/**
 * AbsGameConnectHelper 
 * @author admin
 *
 * AbsGameConnectHelper 를 상위클래스로 받아 직접적으로 사용되는 코드.
 * 아래의 override 된 코드는 전부 requestConnection을 위해 사용되는 세부 순서이다.
 */
public class DefaultGameConnectHelper extends AbsGameConnectHelper {

	@Override
	protected String[] doSecurity(String string) {
		// 복호화 과정을 거친다고 가정한다.
		String[] result = new String[2];
		result[0] = "123";
		result[1] = "password";
		System.out.println("복호화 과정");
		return result;
	}

	@Override
	protected boolean authentication(String id, String password) {
		// id와 password가 실제로 존재하는지 확인한다고 가정한다.
		// 예를들어 데이터베이스 접속.
		System.out.println("확인과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		// 유저의 권한을 확인한다고 가정한다. 운영자, 유저 등이 있을 것이다.
		System.out.println("권한 확인 과정");
		return 1;
	}

	@Override
	protected String connection(String info) {
		// 실제 접속을 담당한다. 결과반환이나 특정 처리가 진행될 것이다.
		System.out.println("접속확인");
		return info;
	}

}
