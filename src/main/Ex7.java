package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex7 {
	public static void main(String[] args) {

		// 스트림 변수 선언
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("src/main/a.txt");
			System.out.println("a.txt 파일을 엽니다.");
			//int i = 0 / 0;
	

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			

		}finally {
			try {
				fis.close();
			} catch (IOException s) {
				s.printStackTrace();
			}

			System.out.println("사용한 리소스를 닫았습니다.");
		}

	}
}
