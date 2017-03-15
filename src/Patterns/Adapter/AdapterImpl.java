package Patterns.Adapter;


/**
 * Adapter Interface를 함수로 구현하는 객체로,
 * 기존에 있던 Math Library가 int 형 반환을 하는데 반해,
 * 요구사항이었던 float형 변환을 돕기 위해 만들어졌다.
 */
public class AdapterImpl implements Adapter {
	private Math math = new Math();

	@Override
	public String doubleValue(int f) {
		String result = String.valueOf(math.doubleValue(f));
		return result;
	}

	@Override
	public String halfValue(int f) {
		String result = String.valueOf(math.halfValue(f));
		return result;
	}
}
