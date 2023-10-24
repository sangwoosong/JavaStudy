package com.sist.lib;
import java.text.*;
import java.util.*;
// 날짜 변환
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현재 시스템의 시간을 읽어옴
		// Date
		Date date=new Date();
		System.out.println(date); // 데이터베이스 호환 (오라클과 연동)
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		/*
				년도 : y => yyy => yy => yyyy
				월 : M(1~12) => MM (01) 
				일 : d => dd
				시간 : h => hh
				분 : m => mm
				초 : s => ss
		 */
	}

}
