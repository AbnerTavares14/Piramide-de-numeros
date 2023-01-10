import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite o número inicial da contagem");
        int numInicial = x.nextInt();
        System.out.println("Digite o número final da contagem");
        int numFinal = x.nextInt();
        for (int i = numInicial; i <= numFinal; i++) {
            String numString = "";
            for (int j = 0; j < i; j++) {
                numString += i;
                // System.out.println("a");
            }
            System.out.println(numString);
        }
    }
}
