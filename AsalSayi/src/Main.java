import java.util.Scanner;

public class Main {

  static int isAsal(int num,int i){
        if(i==1){
            return 1;
        }
        else if (num%i==0){
            return 0;
        }
        else
            return isAsal(num,i-1);
    }




    public static void main(String[] args) {
        int num,prime;
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        num=input.nextInt();
        prime=isAsal(num,num/2);
        if(prime==1)
            System.out.println("Asaldir");
        else
            System.out.println("Asal degildir");



    }
}

