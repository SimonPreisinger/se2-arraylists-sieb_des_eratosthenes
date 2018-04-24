import java.util.ArrayList;

public class PrimeFinderMain implements PrimeFinder {

    public static void main(String... args) {

    }

    @Override
    public ArrayList<Integer> findPrimes(Integer upto) {
        ArrayList<Integer> n = new ArrayList<>(); // Erzeuge die Liste n für alle Zahlen
        ArrayList<Integer> p = new ArrayList<>(); // Erzeuge die Liste p für Primzahlen


        for (int i = 2; i < upto; i++) // Fülle n mit den Zahlen 2 bis upto
        {
            n.add(i);
        }

        while (n.size() > 0) { // Wiederhole bis n leer ist ...

            Integer z = n.get(0); // Lies das erste Element z aus n. (z ist eine Primzahl.)
            p.add(z); // Füge z an p an
            n.remove(z); // Lösche z und alle Vielfachen aus n
            n.remove(z * z);


        }

        return p;
    }
}
