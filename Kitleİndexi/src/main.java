import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double boy,kilo;
        double index;

        Scanner inp=new Scanner(System.in);

        System.out.println("Lutfen boyunuzu metre cinsinden giriniz");
        boy=inp.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz");
        kilo= inp.nextDouble();

        index=kilo/(boy*boy);
        System.out.println("indexiniz:"+index);

    }

}
