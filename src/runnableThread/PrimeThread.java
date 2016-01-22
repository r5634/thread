package runnableThread;

class PrimeThread extends Thread {
    long minPrime;
    PrimeThread(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        // compute primes larger than minPrime
         
    }
    
    public static void main(){
    	PrimeThread p = new PrimeThread(143);
        p.start();
    }
}
