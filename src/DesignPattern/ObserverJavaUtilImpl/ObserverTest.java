package DesignPattern.ObserverJavaUtilImpl;

public class ObserverTest {

    public static void main(String args[]) {
           // this will maintain all loans information
           Newspaper printMedia = new Newspaper();
           Internet onlineMedia = new Internet();

           Loan personalLoan = new Loan("Personal Loan", 12.5f,
                        "Standard Charterd");
           personalLoan.addObserver(printMedia);
           personalLoan.addObserver(onlineMedia);
           personalLoan.setInterest(3.5f);

    }

}
