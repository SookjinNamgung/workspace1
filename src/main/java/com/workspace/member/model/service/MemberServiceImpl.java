package com.workspace.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.workspace.member.model.dao.MemberDao;
import com.workspace.member.model.vo.Member;

public class MemberServiceImpl implements MemberService {
	
	
	@Autowired
    private MemberDao memberDao;
	
	
	@Override
	public Member login(String empNo, String password) {
		return memberDao.findByEmpNoAndPassword(empNo, password);
	}

}
