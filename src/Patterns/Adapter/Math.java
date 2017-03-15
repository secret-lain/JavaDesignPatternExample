package Patterns.Adapter;

/**
 * 라이브러리 형태로 제공된 Math 함수라고 가정한다.
 * Math는 int형 데이터를 두배로 반환하거나 절반으로 반환하는 함수가 존재한다.
 */
public class Math {
	public int doubleValue(int value){ return value * 2; }
	public int halfValue(int value){ return value / 2; }
	//divide by 0 exception 처리는 하지 않았음
}
