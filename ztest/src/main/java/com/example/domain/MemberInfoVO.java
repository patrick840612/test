package com.example.domain;

import lombok.Data;

@Data
// 회원 정보 테이블
public class MemberInfoVO {
	
	private 	String 		id;					// 회원 아이디 ( 회원 테이블 PK )
	private 	String 		userPassword;		// 회원 비밀번호
	private 	String 		userEmail;			// 회원 이메일
	private 	String 		userName;			// 회원 이름 ( 실명 )
	private 	String 		userTel;			// 회원 전화번호
	private 	String 		userAddr;			// 회원 주소
	private 	String 		character;			// 회원 캐릭터 ( dog.jpg )
	private 	String 		whichPet;			// 반려동물 종류
	private 	String 		blood;				// 반려동물 혈액형
	private 	boolean 	bloodGive;			// 반려동물 혈액 
	private 	String 		bloodMessage;		// 혈액 제공 메세지
	private 	String 		gps;				// gps
	private 	boolean 	marketingOk;		// 마케팅 수신동의
	
	// 소셜회원
	private 	String 		socialKey;			// 간편 로그인 키
	private 	String 		social;				// 간편 로그인 종류
	
	
	
}
