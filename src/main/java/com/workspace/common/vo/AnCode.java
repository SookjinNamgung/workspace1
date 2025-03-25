package com.workspace.common.vo;

import java.util.Set;

public class AnCode extends BaseCode {

	public static final String ANNUAL = "AN001";	// 연차
	public static final String SICK = "AN002";		// 병가
	public static final String REWORD = "AN003";	// 포상
	public static final String HAPPY = "AN004";		// 경사
	public static final String SAD = "AN005";		// 조사
	public static final String ETC = "AN006";		// 기타
	
	
	private static final Set<String> VALID_CODES = Set.of(
		ANNUAL, SICK, REWORD, HAPPY, SAD, ETC
	);
	
	public AnCode(String code) {
		super(code, VALID_CODES, "연차 코드");
	}
	
	public boolean isAnnual() {
		return getCode().equals(ANNUAL);
	}
	
	public boolean isSick() {
		return getCode().equals(SICK);
	}
	
	public boolean isReword() {
		return getCode().equals(REWORD);
	}
	
	public boolean isHappy() {
		return getCode().equals(HAPPY);
	}
	
	public boolean isSad() {
		return getCode().equals(SAD);
	}
	
	public boolean isEtc() {
		return getCode().equals(ETC);
	}
}