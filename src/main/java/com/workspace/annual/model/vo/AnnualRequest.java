package com.workspace.annual.model.vo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AnnualRequest {

	private Long annualNo;
	private String cmpyNo;
	private Long userNo;
	private String anCode;
	private String usageType;
	private String reason;
	private String status;
	private String enrollDate;
	private String approveDate;
	private String rejectDate;
	private String cancelDate;

}
