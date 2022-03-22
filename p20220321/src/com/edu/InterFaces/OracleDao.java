package com.edu.InterFaces;

public class OracleDao implements Dao {

	@Override
	public void select() {
		System.out.println("OracleDB에서 조회합니다");
		
	}

	@Override
	public void insert() {
		System.out.println("OracleDB에서 삽입합니다");
		
	}

	@Override
	public void update() {
		System.out.println("OracleDB에서 수정합니다");
		
	}

	@Override
	public void delete() {
		System.out.println("OracleDB에서 선상제합니다");
		
	}
	

}
