package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex6 {
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("src/main/a.txt");//프로젝트 밑부터 상대경로 시작
		} catch (FileNotFoundException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");
	}
}
