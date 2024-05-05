import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		int x1, x2, x3, sum=0;
		while(i < n) {
			x1 = sc.nextInt();
			x2 = sc.nextInt();
			x3 = sc.nextInt();
			if((x1 + x2 + x3) > 1) {
				sum++;
			}
			i++;
		}
		System.out.println(sum);

		sc.close();
	}

}
