package com.workspace.common.vo;

import java.util.Set;

public class NotiType extends BaseCode {

	public static final String REQUEST = "NT001";   // 연차 신청 알림
	public static final String APPROVED = "NT002";  // 연차 승인 알림
	public static final String REJECTED = "NT003";  // 연차 반려 알림
	public static final String UNUSED = "NT004";    // 미사용 연차 알림
	
	private static final Set<String> VALID_CODES = Set.of(
			REQUEST, APPROVED, REJECTED, UNUSED
	);
	
	public NotiType(String code) {
		super(code, VALID_CODES, "알림 유형");
	}
	
	public boolean isRequest() {
		return getCode().equals(REQUEST);
	}
	
	public boolean isApproved() {
		return getCode().equals(APPROVED);
	}
	
	public boolean isRejected() {
		return getCode().equals(REJECTED);
	}
	
	public boolean isUnused() {
		return getCode().equals(UNUSED);
	}
}