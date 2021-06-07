import java.util.Scanner;

public class Daire {

    public static void main(String[] args) {

        int r;
        int aci;
        double alan;
        double pi =3.14;

        Scanner inp= new Scanner(System.in);
        System.out.println("Lutfen dairenin yaricapini giriniz.");
        r= inp.nextInt();
        System.out.println("Lutfen dairenin merkez acisinin olcusunu giriniz.");
        aci= inp.nextInt();
        alan=(pi*(r*r)*aci)/360;
        System.out.println("Alan :"+alan);

    }
}
