package com.workspace.annual.board.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.workspace.annual.board.model.vo.TcommBltBasModel;

@Repository
@Mapper
public interface BoardDao {

	public List<TcommBltBasModel> list(TcommBltBasModel vo);
	
	//public TcommBltBasModel boardDetail();
}
