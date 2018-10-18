package nguyento1.pkg100;

public class NguyenTo1100 {
    
        static boolean isPrime(int x){
        if(x ==1) return false;
        if(x==2 || x==3) return true;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if(isPrime(i)) System.out.print(i+" ");
        }
    }
    
}
