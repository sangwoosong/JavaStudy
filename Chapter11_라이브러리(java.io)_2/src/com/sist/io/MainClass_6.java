package com.sist.io;
import java.io.*;
import java.util.*;
// 객체 단위로 저장 => 객체 단위로 읽기 
// ObjectInputStream, ObjectOutputStream
/*
		Sawon s=new Sawon(...);
		s ==> -----------
			
			  ---sabun---
		
			  ---name----
		
			  ---dept----
		
			  ----job----
		
			  ----------- => 병렬
			  
		= 객체단위로 저장 => 직렬화 => 직렬화저장 인터페이스 구현해야함!! (Serializable)
		-------------------------
		sabun name dapet job ...
		------------------------- 
 */
class Sawon implements Serializable{ // 직렬화 인터페이스
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String job, int pay) {
		super(); // 초기화용
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	public Sawon() {
		// default 생성자 => 읽기용
	}
}
public class MainClass_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 메모리에 저장 => ArrayList
			ArrayList<Sawon> list=new ArrayList<Sawon>();
			list.add(new Sawon(1,"홍길동","개발부","대리",4000));
			list.add(new Sawon(2,"박문수","영업부","사원",3200));
			list.add(new Sawon(3,"이순신","총무부","과장",5800));
			list.add(new Sawon(4,"강감찬","감사부","과장",5200));
			list.add(new Sawon(5,"을지문덕","기획부","대리",3800));
			// 파일에 저장
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\emp.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(list); // 통으로 저장 => for문 안써도딤
			oos.close();
			fos.close();
			System.out.println("객체단위 저장 완료!"); // 한글은 깨짐
		}catch(Exception ex) {}
	}

}