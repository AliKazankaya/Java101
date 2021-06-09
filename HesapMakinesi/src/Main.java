import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1,n2,result,choosen;

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz.");
        n1= input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz.");
        n2=input.nextInt();
        System.out.println("Yapmak istediginiz islemi seciniz.");
        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        choosen= input.nextInt();

        switch (choosen){

            case 1:
               result= n1+n2;
                System.out.println("Sonuc :"+result);
                break;
            case 2:
                result=n1-n2;
                System.out.println("Sonuc :"+result);
                break;
            case 3:
                result=n1*n2;
                System.out.println("Sonuc :"+result);
                break;
            case 4:
                if(n2 != 0) {
                    result = n1 / n2;
                    System.out.println("Sonuc :" + result);
                } else
                System.out.println("0'a bolemezsiniz");
                break;

            default:
                System.out.println("Yanlis secim yaptiniz.");
                break;



        }


    }
}
