class FizzBuzz {
    private int n;
    private Semaphore fizzSemaphore = new Semaphore(0);
    private Semaphore buzzSemaphore = new Semaphore(0);
    private Semaphore fizzBuzzSemaphore = new Semaphore(0);
    private Semaphore numberSemaphore = new Semaphore(1);

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        for(int i=3;i<=n;i+=3){
            if(i%5!=0){
                fizzSemaphore.acquire();
                printFizz.run();
                releaseNext();
            }
        }  
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
        for (int i = 5; i <= n; i += 5) {
            if (i % 3 != 0) {
                buzzSemaphore.acquire();
                printBuzz.run();
                releaseNext();
            }
        }
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
        for (int i = 15; i <= n; i += 15) {
            fizzBuzzSemaphore.acquire();
            printFizzBuzz.run();
            releaseNext();
        }
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {
        for(int i=1;i<=n;i++){
            numberSemaphore.acquire();
            if(i%3 != 0 && i%5 != 0) {
                printNumber.accept(i);
                releaseNext();
            } else {
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzBuzzSemaphore.release();
                } else if (i % 3 == 0) {
                    fizzSemaphore.release();
                } else if (i % 5 == 0) {
                    buzzSemaphore.release();
                }
            }
        }
    }
    
    private void releaseNext() {
        numberSemaphore.release();
    }
}