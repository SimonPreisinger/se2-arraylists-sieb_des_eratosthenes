import java.util.ArrayList;

public class PrimeFinderDummy implements PrimeFinder {

    @Override
    public ArrayList<Integer> findPrimes(Integer upto) {
        ArrayList<Integer> n = new ArrayList<>(); // Erzeuge die Liste n für alle Zahlen
        ArrayList<Integer> p = new ArrayList<>(); // Erzeuge die Liste p für Primzahlen

        for (int i = 2; i <= upto; i++) // Fülle n mit den Zahlen 2 bis upto
        {
            n.add(i);
        }

        while (!n.isEmpty()) { // Wiederhole bis n leer ist ...
            Integer z = n.get(0); // Lies das erste Element z aus n. (z ist eine Primzahl.)
            p.add(z); // Füge z an p an
            int factor = 1;
            int value = factor * z;
            while (value <= upto) {
                if (n.remove((Integer)value)) {
                    n.remove((Integer)value); // Lösche z und alle Vielfachen aus n
                }
                value = z * factor++;
            }

        }
        return p;
    }
}
