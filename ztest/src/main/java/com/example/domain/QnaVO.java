package com.example.domain;

import lombok.Data;

@Data
public class QnaVO {
	private Integer no;
	private String question;
	private String writer;
	private String answer;
	private String manager;
	// 당겨받기
	// 컨플릭트 해결
	// history 펼치기
	// 다시한번
}
