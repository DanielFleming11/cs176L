import java.util.Scanner;

public class TestMagicEightBall {

	public static void main(String[] args) {

		Scanner scan = new Scanner(SYstem.in)
				
				MagicEightBall n8 = new MagicEightBall;
		
		System.out.println("Enter any yes/no quedtion (or \"exit\" to exit)");
		
		while(scan.hasNextLine()) {
			String question = scan.nextLine();
			
			if(question.equals("exit")||question.equals("Exit")) {
			break;
		}
			
		System.out.println();
		
		System.out.print("The Answer is: " + n8.getAnswer());
		
		System.out.println();
		
		System.out.print("Enter any yes/no quedtion (or \\\"exit\\\" to exit)");
	}

}
