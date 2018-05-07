import java.util.ArrayList;

public class PrimeFinderMain {

    public static void main(String... args) {
        PrimeFinderDummy primeFinderDummy = new PrimeFinderDummy();
        ArrayList<Integer> primes = primeFinderDummy.findPrimes(1000);
        for (Integer prime : primes
             ) {
            System.out.println(prime + ", ");
        }

    }


}
