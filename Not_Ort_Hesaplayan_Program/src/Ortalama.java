
import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen matematik notunuzu giriniz:");
        mat= inp.nextInt();
        System.out.println("Lutfen fizik notunuzu giriniz:");
        fizik= inp.nextInt();
        System.out.println("Lutfen kimya notunuzu giriniz:");
        kimya= inp.nextInt();
        System.out.println("Lutfen turkce notunuzu giriniz:");
        turkce= inp.nextInt();
        System.out.println("Lutfen tarih notunuzu giriniz:");
        tarih= inp.nextInt();
        System.out.println("Lutfen muzik notunuzu giriniz:");
        muzik= inp.nextInt();

        int toplam=mat+fizik+kimya+turkce+tarih+muzik;
        double ort=toplam/6.0;
        System.out.println("Ortalamaniz: "+ort);

        boolean check=ort>=60;
        String str = (check) ? "Tebrikler sinifi gectiniz":"Malesef sinifta kaldiniz.";
        System.out.println(str);

    }
}
