import java.util.*;
 
class Diff {
 
    static int reverse(int n)
    {
        int rev = 0;
        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
    }
 
    static void getSum(int n)
    {
        n = reverse(n);
        int sumOdd = 0, sumEven = 0, c = 1;
 
        while (n != 0) {

            if (c % 2 == 0)
                sumOdd += n % 10;
            else
                sumEven += n % 10;
            n /= 10;
            c++;
        }
		int diff = sumEven-sumOdd;
 
        System.out.println("5+2 = " + sumEven);
        System.out.println("4+7 = " + sumOdd);
		System.out.println(sumEven+"-"+sumOdd+"="+diff);
    }
 
    public static void main(String args[])
    {
        int n = 5427;
        getSum(n);
    }
}