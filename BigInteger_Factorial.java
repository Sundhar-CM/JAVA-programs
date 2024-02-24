
import java.math.BigInteger;
import java.util.*;

class BigInteger_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        BigInteger fact=BigInteger.valueOf(num);
        fact=fact.multiply(factorial(fact.subtract(BigInteger.valueOf(1))));
        System.out.println(fact);
        int count=0;
        while (fact.remainder(BigInteger.TEN).equals(BigInteger.ZERO)) {
            count++;
            fact=fact.divide(BigInteger.TEN);
        }
        System.out.println(count);
        sc.close();
    }
    static BigInteger factorial(BigInteger fact){
        if(fact.equals(BigInteger.valueOf(1))){
            return BigInteger.valueOf(1);
        }
        return fact.multiply(factorial(fact.subtract(BigInteger.valueOf(1))));
    }
}
