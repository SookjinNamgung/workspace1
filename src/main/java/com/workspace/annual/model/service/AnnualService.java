package com.workspace.annual.model.service;

import java.util.List;

import com.workspace.annual.model.vo.AnnualRequest;

public interface AnnualService {
	
	// 회사 전체 연차 조회
	List<AnnualRequest> getAllAnnualsByCompany(String cmpyNo);

	// 개인 연차 조회
	List<AnnualRequest> getUserAnnuals(String cmpyNo, Long userNo);
	
}
