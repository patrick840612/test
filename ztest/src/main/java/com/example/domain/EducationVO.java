package com.example.domain;

import lombok.Data;

@Data
// 정보게시판 > 교육정보 테이블
public class EducationVO {
	
	private 	Integer 	eduId;			// 교육 번호 ( 교육정보 테이블 PK / Auto-Increase )
	private 	String 		eduAnimal;		// 교육 동물 ( 강아지 or 고양이 )
	private 	String 		eduTitle;		// 교육 제목 
	private 	String 		eduStep;		// 교육 단계
	private 	String 		eduContent;		// 교육 내용
	private 	Integer 	eduLevel;		// 교육 난이도 ( 0 ~ 3 )
			// 교육 사진
			// 교육 영상
	
	private 	String 		id;
	
}
