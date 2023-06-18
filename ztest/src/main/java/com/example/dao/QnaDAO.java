package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.QnaVO;

@Mapper
public interface QnaDAO {
	void saveQna(QnaVO vo);
	List<QnaVO> listQna();
	QnaVO getQna(QnaVO vo);
	void answerQna(QnaVO  vo);
}
