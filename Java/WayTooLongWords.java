import java.util.Scanner;

public class Main {

		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			for(int i=0 ; i<n ; i++) {
				String word = sc.next();
				if(word.length() <= 10) {
					System.out.println(word);
				}
				else {
					System.out.printf("%s%d%s%n", word.charAt(0), (word.length()-2), word.charAt(word.length()-1));
				}
			}
			
			sc.close();
		}
}
