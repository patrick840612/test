package com.example.domain;

import lombok.Data;

@Data
public class QnaVO {
	private Integer no;
	private String question;
	private String writer;
	private String answer;
	private String manager;
	// 수정작업 확인
}
