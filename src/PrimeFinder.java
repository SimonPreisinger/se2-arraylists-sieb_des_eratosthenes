/* (C) 2018, R. Schiedermeier, rs@cs.hm.edu
 * Oracle Corporation Java 1.8.0_121, Linux i386 4.15.4
 * emma: Intel Core i7-4790/3600 MHz, 8 Core(s), 32068 MByte RAM
 **/

import java.util.ArrayList;

/** Primzahlensuche.
 * @author R. Schiedermeier.
 * @version 2018-04-05
 *
 */
public interface PrimeFinder {
    /** Berechnet eine Liste von Primzahlen.
     * @param upto Obergrenze.
     * Die Liste enthaelt keine groesseren Primzahlen.
     * @return Liste mit aufsteigenden Primzahlen bis upto.
     * Eventuell leer, aber nicht null.
     */
    ArrayList<Integer> findPrimes(Integer upto);

}
