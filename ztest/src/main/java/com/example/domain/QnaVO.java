package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QnaVO {
	private Integer no;
	private String question;
	private String writer;
	private String answer;
	private String manager;
	


}
