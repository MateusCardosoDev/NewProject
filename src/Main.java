import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Double[] vector = new Double[n];
     
        for (int i=0; i<n; i++) {
            System.out.println("Digiite um valor: ");
            vector[i] = sc.nextDouble();
        }
    }
}
