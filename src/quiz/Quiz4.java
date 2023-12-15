package quiz;

public class Quiz4 {
	public static void main(String[] args) {
		
		String str = "1.23";
		
		try {
			int num = Integer.parseInt(str);
			
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("정상 종료");
	}
}
