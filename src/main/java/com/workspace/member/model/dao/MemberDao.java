package com.workspace.member.model.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.workspace.member.model.vo.Member;
@Mapper
public interface MemberDao {

	Member findByEmpNoAndPassword(@Param("empNo") String empNo, @Param("userPwd") String userPwd);
}
