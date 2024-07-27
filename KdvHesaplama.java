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
            System.out.println("KDV tutarı : " + kdvTutarı1);
            System.out.println("KDV'li tutar : " + (((int)tutar * kdvTutarı1)+tutar));
        } else {
            System.out.println("KDV tutarı : " + kdvTutarı2);
            System.out.print("KDV'li tutar : " + ( (int)(tutar * kdvTutarı2)+tutar));
        }
    }
}
