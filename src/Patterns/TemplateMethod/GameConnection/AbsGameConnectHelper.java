package Patterns.TemplateMethod.GameConnection;

/**
 * 
 * @author admin
 * 가상의 게임 사용자 접속 순서 클래스이다.
 * 접속은
 * 보안단계 -> 인증단계 -> 유저의권한 체크단계 -> 접속단계 순으로 진행된다.
 * 알고리즘은 외부노출을 막기 위해 protected로 구현되어야 한다.
 * (abstract 이기 때문에 재정의가 꼭 필요한데, private면 하위클래스도 상속받지 못한다)
 *
 */
public abstract class AbsGameConnectHelper {
	protected abstract String[] doSecurity(String string);
	protected abstract boolean authentication(String id, String password);
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);

	public String requestConnection(String encodedInfo){
		String[] decodedInfo = doSecurity(encodedInfo); // 문자열 복호화수행
		
		//존재하는 사용자 정보인지 확인
		String id = decodedInfo[0];
		String password = decodedInfo[1];
		if(authentication(id, password)){
			//사용자가 존재할 경우, 권한을 확인
			int userClass = authorization(id); 
			
			//접속
			if(userClass == 1){
				return connection("connected");
			}			
		}
		return "not connected";
	}
}
