package Patterns.Factory.abstracts;

/**
 * Item Factory
 * @author Lain
 *
 * ItemCreator는 타 Item Factory의 원형이다.
 * 아이템을 생성하기위해서는 일련의 알고리즘이 동작하는데,
 * TemplateMethod Pattern에 따라 실제 구현은 create,
 * 세부 알고리즘은 abstract로 실제 아이템 생성을 위한 자식 클래스에게 맡긴다.
 */
public abstract class ItemCreator {
	protected abstract void getDatabaseInfo();
	protected abstract void logItemCreateInfo();
	protected abstract Item createItem();
	
	public Item create(){
		getDatabaseInfo();
		Item item = createItem();
		logItemCreateInfo();
		return item;
	}
}
