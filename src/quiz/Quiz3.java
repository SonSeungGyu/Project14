package quiz;

public class Quiz3 {
	public static void main(String[] args) {
		
		Object obj = new Integer(0);
		try {
			String str = (String)obj;
			
		} catch (ClassCastException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");
	}
}
