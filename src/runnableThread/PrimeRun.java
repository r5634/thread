package runnableThread;


class PrimeRun implements Runnable {
    long minPrime;
    PrimeRun(long minPrime) {
        this.minPrime = minPrime;
    }

    public void run() {
        // compute primes larger than minPrime
        
    }
    public static void main(){
    	PrimeRun p = new PrimeRun(143);
        new Thread(p).start();
    }
}
