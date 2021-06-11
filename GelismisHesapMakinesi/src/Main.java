import java.util.Scanner;
public class Main {

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam :" + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Fark :" + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Carpimlari :" + result);
        return result;
    }

    static int divide(int a, int b) {
        if (b == 0)
            return 0;
        int result = a / b;
        System.out.println("Bolumleri:" + result);
        return result;
    }

    static int power(int a , int b ){
        int result=1;
        for(int i=0;i<b;i++){
            result*=a;

        }
        return result;
    }
    static int mod(int a, int b){

        return a%b;
    }
    static void Calc(int a , int b){
        System.out.println("Cevresi : "+ (2*(a+b)));
        System.out.println("Alani : "+ (a*b));
    }





    public static void main(String[] args) {


        int select;
        Scanner scan = new Scanner(System.in);


        String menu = "1-Toplama\n"
                + "2-Cikarma\n"
                + "3-Carpma\n"
                + "4-Bolme\n"
                + "5-Uslu Sayi\n"
                + "6-Mod Alma\n"
                + "7-Dikdörtgen Alan ve Cevre Hesabi\n"
                + "0-Programdan cikis\n";


           System.out.println(menu);

        while (true) {

            System.out.print("Bir islem seciniz.");
            select = scan.nextInt();
            if (select == 0)
                break;
            System.out.println("Lutfen birinci sayiyi giriniz");
            int a = scan.nextInt();
            System.out.println("Lutfen ikinci sayiyi giriniz");
            int b = scan.nextInt();
            switch (select) {

                case 1:
                    sum(a, b);
                    break;

                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    if (divide(a, b) == 0) {
                        System.out.println("Ikinci sayi sifir olamaz");
                        divide(a, b);
                        break;
                    }

                case 5:
                    System.out.println("Us hesabi :"+power(a,b));
                    break;
                case 6:
                    System.out.println("Mod hesabi :"+mod(a,b));
                    break;
                case 7:
                    Calc(a,b);
                    break;
                default:
                    System.out.println("Gecersiz bir islem girdiniz.");
                    break;

            }


        }

    }
}