package tr.edu.maltepeproject.oop;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	 // Değişkenleri oluştur
     int mat, fizik, kimya, turkce, tarih, muzik;

     // Scanner sınıfını tanımladık
     Scanner inp = new Scanner(System.in);

     // kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);

        // Karşılaştırma ifadelerini kullandık
        String sinifDurum = (sonuc >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sinifDurum);
    }
}
