import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextInt();
		long m = sc.nextInt();
		long a = sc.nextInt();
		
		n = (n % a == 0) ? n/a : n/a + 1;
		m = (m % a == 0) ? m/a : m/a + 1;
		
		System.out.println(m*n);
		
		sc.close();
	}

}
