import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, k;
		
		n = sc.nextInt();
		k = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			vect[i] = sc.nextInt();
		}
		
		sc.close();
		
		int minScore = vect[k-1];
		int cont = 0;
		
		for(int i=0 ; i<n ; i++) {
			if(vect[i] > 0 && vect[i] >= minScore) {
				cont++;
			} 
			else {
				break;
			}
		}
		
		System.out.println(cont);
	}
}
