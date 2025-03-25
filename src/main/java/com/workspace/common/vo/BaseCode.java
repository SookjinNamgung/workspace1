package com.workspace.common.vo;

import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
public abstract class BaseCode {

	private final String code;
	
	public BaseCode(String code, Set<String> validCodes, String codeNameForMessage) {
		if (!validCodes.contains(code)) {
			throw new IllegalArgumentException("유효하지 않은 " + codeNameForMessage + ": " + code);
		}
		this.code = code;
	}
	
}
