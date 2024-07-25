import java.util.Scanner;

public class KdvHesaplama {

    public static void main(String[] args) {
        double kdvTutarı1 = 0.18;
        double kdvTutarı2 = 0.08;
        int tutar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("lütfen tutarı giriniz : ");
        tutar = scanner.nextInt();
        if (tutar < 1000) {
            System.out.print("\nKDV tutarı : " + kdvTutarı1);
            System.out.println();
            System.out.print("\nKDV'li tutar : " + tutar * kdvTutarı1);
        } else {
            System.out.print("KDV tutarı" + kdvTutarı2);
            System.out.print("KDV'li tutar : " + tutar * kdvTutarı2);
        }
    }
}