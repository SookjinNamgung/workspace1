package com.workspace.annual.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.workspace.annual.model.vo.AnnualRequest;

@Mapper
public interface AnnualRequestDao {
	
	// 개인 연차 조회 (회사 + 사용자 기준)
	List<AnnualRequest> findByCmpyAndUser(@Param("cmpyNo") String cmpyNo, @Param("userNo") Long userNo);
	
	// 전체 연차 조회 (회사 기준)
	List<AnnualRequest> findByCmpy(@Param("cmpyNo") String cmpyNo);
}
