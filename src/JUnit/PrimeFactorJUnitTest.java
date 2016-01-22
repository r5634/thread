package JUnit;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;


public class PrimeFactorJUnitTest {

    private List<Integer> list(int... factors){
        List&lt;Integer&gt; listOfFactors = new ArrayList<>();
        
        for(int i : factors){
            listOfFactors.add(i);
        }       
        return listOfFactors;
    }
    
    @Test
    public void testOne() {
        assertEquals(list(), PrimeFactors.primeFactors(1));
    }
    
    @Test
    public void testTwo() {
        assertEquals(list(2), PrimeFactors.primeFactors(2));
    }

    @Test
    public void testThree() {
        assertEquals(list(3), PrimeFactors.primeFactors(3));
    }
    
    @Test
    public void testFour() {
        assertEquals(list(2,2), PrimeFactors.primeFactors(4));
    }
    
    @Test
    public void testSeventyTwo() {
        assertEquals(list(2,2,2,3,3), PrimeFactors.primeFactors(72));
    }
}


