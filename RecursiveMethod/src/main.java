import java.util.Scanner;
public class main {

  static   Scanner scan= new Scanner(System.in);

    static int Recursive(int a ,int b){

        if(b!=0){
            return a*(Recursive(a,b-1));
        }
        else
            return 1;

    }

    public static void main(String[] args) {
        System.out.println("Taban degerini giriniz.");
       int a=scan.nextInt();
        System.out.println("Us degerini giriniz");
        int b=scan.nextInt();
        System.out.println("Sonuc :"+ Recursive(a,b));

    }
}
