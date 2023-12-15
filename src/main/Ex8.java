package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//예외처리 미루기

public class Ex8 {
	
	public static void OpenTextFile() throws FileNotFoundException { //메소드를 사용하는 시점에 예외처리를 해주어야함
		
		FileInputStream fis = new FileInputStream("src/main/a.txt");
	}
	
	
	public static void main(String[] args) {
		
		
		try {
			OpenTextFile();//메소드를 이용할 때 예외처리를 해주면됨.
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
	}
}
