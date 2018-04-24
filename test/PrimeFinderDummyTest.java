import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PrimeFinderDummyTest {

    @Test(timeout = 1000)
    public void findPrimes() {
        //arrange
        ArrayList<Integer> sut = new ArrayList<>();
        ArrayList<Integer> want = new ArrayList<>(0);
        //act
        ArrayList<Integer> have = sut;


        //assert
        Assert.assertEquals(want,have);
    }

    @Test(timeout = 1000)
    public void findPrimesUpTo0() {
        //arrange
        ArrayList<Integer> sut = new ArrayList<>();
        ArrayList<Integer> want = new ArrayList<>(0);
        //act
        ArrayList<Integer> have = sut;


        //assert
        Assert.assertEquals(want,have);
    }

    @Test(timeout = 1000)
    public void findPrimesUpTo1() {
        //arrange
        //act
        //assert
    }

    @Test(timeout = 1000)
    public void findPrimesUpTo2() {
        //arrange
        //act
        //assert
    }

    @Test(timeout = 1000)
    public void findPrimesUpTo3() {
        //arrange
        //act
        //assert
    }

    @Test(timeout = 1000)
    public void findPrimesUpTo6() {
        //arrange
        //act
        //assert
    }

    @Test(timeout = 1000)
    public void findPrimesUpTo15() {
        //arrange
        //act
        //assert
    }
}