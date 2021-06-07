import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        int km;
        double perKm=2.20;
        double Total;
        double startPrice=10;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz:");
        km= input.nextInt();

        Total= perKm*km+startPrice;

        Total =(Total<20) ? 20 :Total;

        System.out.println("Total Price :"+Total);



    }
}
