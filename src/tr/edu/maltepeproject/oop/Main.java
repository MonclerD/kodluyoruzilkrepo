package tr.edu.maltepeproject.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	double tutar, kdvOrani = 0.18;
    double kdvTutar, kdvliTutar;

    Scanner input = new Scanner(System.in);
    System.out.print("Tutarı giriniz: ");
    tutar = input.nextDouble();

    // Burada tutarı 0 ile 1000 arasındaysa KDV oranını %18 olarak, aksi takdirde %8 olarak hesaplıyoruz.
    kdvOrani =  (tutar >= 0 && tutar <= 1000) ? 0.18 : 0.08;

     kdvTutar = tutar * kdvOrani;
     kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar:" + tutar);
        System.out.println("KDV Oranı:" + (kdvOrani * 100) + "%");
        System.out.println("KDV Tutarı:" + kdvTutar);
        System.out.println("KDV'li Tutar:" + kdvliTutar);

    }
}
