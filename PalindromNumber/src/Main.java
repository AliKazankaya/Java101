public class Main {

    static boolean isPalindrom(int number) {
        int temp, reverseNumber=0, lastNumber;
        temp = number;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
            temp /= 10;
        }

        if (number == reverseNumber)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(4004));
    }
}