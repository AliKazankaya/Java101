import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double armutPrice=2.14,elmaPrice =3.67, domatesPrice=1.11, muzPrice=0.95, patlicanPrice=5.00;
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg,toplam;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kac kg armut almak istediginizi giriniz.");
        armutKg=input.nextDouble();
        System.out.println("Lutfen kac kg elma almak istediginizi giriniz.");
        elmaKg=input.nextDouble();
        System.out.println("Lutfen kac kg domates almak istediginizi giriniz.");
        domatesKg=input.nextDouble();
        System.out.println("Lutfen kac kg muz almak istediginizi giriniz.");
        muzKg=input.nextDouble();
        System.out.println("Lutfen kac kg patlican almak istediginizi giriniz.");
        patlicanKg=input.nextDouble();

        toplam=(armutPrice*armutKg+elmaPrice*elmaKg+domatesPrice*domatesKg+muzPrice*muzKg+patlicanPrice*patlicanKg);
        System.out.println("Toplam Tutar : "+toplam);
    }
}

