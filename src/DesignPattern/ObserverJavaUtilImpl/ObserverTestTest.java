package DesignPattern.ObserverJavaUtilImpl;

import static org.junit.Assert.*;

import org.junit.Test;

public class ObserverTestTest {

	@Test
	public void testMain() throws Exception {
		Newspaper printMedia = new Newspaper();
        Internet onlineMedia = new Internet();

        Loan personalLoan = new Loan("Personal Loan", 12.5f,
                     "Standard Charterd");
        personalLoan.addObserver(printMedia);
        personalLoan.addObserver(onlineMedia);
        
        personalLoan.setInterest(3.5f);
	}

}
