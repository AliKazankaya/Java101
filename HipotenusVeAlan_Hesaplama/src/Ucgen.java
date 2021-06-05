import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {

        int kenar1,kenar2;
        double hipotenus,cevresi,alani,u;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini giriniz.");
        kenar1= input.nextInt();
        kenar2= input.nextInt();
        hipotenus=Math.sqrt(kenar1*kenar1+kenar2*kenar2);
        System.out.println("Ucgenin hipotenusu:"+hipotenus);

        cevresi=kenar1+kenar2+hipotenus;
        u=(kenar1+kenar2+hipotenus)/2;
        alani=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-hipotenus));

        System.out.println("Cevresi:"+cevresi);
        System.out.println("Alani:"+alani);
    }
}
