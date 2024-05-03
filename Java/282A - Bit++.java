import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, cont;
        String input;
        cont = 0;

        n = sc.nextInt();
        sc.nextLine();

        for (int i=0 ; i<n ; i++) {
            input = sc.nextLine();
            if (input.equals("X++") || input.equals("++X")) {
                cont += 1;
            }
            if (input.equals("X--") || input.equals("--X")) {
                cont -= 1;
            }
        }
        System.out.println(cont);

        sc.close();
    }
}
