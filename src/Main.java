import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, r;
        double total1 =1 ,total2 = 1, total3=1 ,sonuc;

        System.out.print("n'nin r'li kombinasyonu için n sayısını giriniz :");
        n = scan.nextInt();

        System.out.print("n'nin r'li kombinasyonu için r sayısını giriniz :");
        r = scan.nextInt();

        for(int i=1; i<=n; i++){

            total1 = total1 * i;
        }
        for (int k=1; k<=r; k++ ){

            total2 = total2 * k;
        }
        for (int t=1; t<=(n-r); t++){
            total3 = total3 * t;
        }

        sonuc = total1 / (total2*total3);
        
        System.out.println("Sonuc :" + sonuc);
    }
}