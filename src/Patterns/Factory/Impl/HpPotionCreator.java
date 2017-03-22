package Patterns.Factory.Impl;

import java.sql.Date;

import Patterns.Factory.abstracts.Item;
import Patterns.Factory.abstracts.ItemCreator;

public class HpPotionCreator extends  ItemCreator{

	@Override
	protected void getDatabaseInfo() {
		System.out.println("HP포션 정보를 데이터베이스에서 가져옵니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void logItemCreateInfo() {
		System.out.println("HP포션 생성기록을 데이터베이스에 기록합니다. " + new Date(System.currentTimeMillis()));
		// TODO Auto-generated method stub
	}

	@Override
	protected Item createItem() {
		// TODO Auto-generated method stub
		return new HpPotion();
	}

}
