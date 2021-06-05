import java.util.Scanner;

public class Tutar {
    public static void main(String[] args) {

        double tutar,kdvOran=0.18,kdvTutar,kdvliTutar;

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen ucreti giriniz.");
        tutar= input.nextDouble();

        kdvTutar=tutar * 0.18;
        kdvliTutar=tutar + kdvTutar;

        System.out.println("Kdv'siz tutar:"+tutar);
        System.out.println("Kdv Oran:"+kdvOran);
        System.out.println("Kdv Tutar:"+kdvTutar);
        System.out.println("Kdv'li tutar:"+kdvliTutar);


    }
}
