package com.workspace.common.vo;

import java.util.Set;

public class UsageType extends BaseCode {

	public static final String FULL = "UT001";		// 연차 사용
	public static final String HALF = "UT002";		// 반차 사용
	public static final String QUARTER = "UT003";	// 반반차 사용
	
	private static final Set<String> VALID_CODES = Set.of(FULL, HALF);
	
	public UsageType(String code) {
		super(code, VALID_CODES, "사용 유형 코드");
	}
	
	public boolean isFull() {
		return getCode().equals(FULL);
	}
	
	public boolean isHalf() {
		return getCode().equals(HALF);
	}
	
	public boolean isQuarter() {
		return getCode().equals(QUARTER);
	}
}