package week07d01;

public class MathAlgorithms {
    private boolean prime;

    private MathAlgorithms(boolean prime) {
        this.prime = prime;
    }
    public static MathAlgorithms isPrime(int number){
        if(number<2){
            throw new IllegalArgumentException("Invalid number");
        }
        double n=Math.sqrt(number);
        for(int i=2;i<n;i++){
          if(n%i==0){
              return new MathAlgorithms(false);
          }
        }
        return new MathAlgorithms(true);

    }

    public boolean isPrime() {
        return prime;
    }
}
