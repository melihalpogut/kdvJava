import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.20,kdvTutar,kdvliTutar ;
        Scanner input = new Scanner(System.in);

        System.out.println("Ücret tutarını giriniz : ");

        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutar : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
    }
}