package com.workspace.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workspace.board.model.dao.BoardDao;
import com.workspace.board.model.vo.TcommBltBasModel;

@Service
public class BoardService {

	@Autowired
	private BoardDao boardDao;
	
	
	public List<TcommBltBasModel> list(TcommBltBasModel vo) {
		
		System.out.println(vo.toString());
		
		List<TcommBltBasModel> list = boardDao.list(vo);
		
		System.out.println("list :: " + list);
		
		return list;
	}
	
}