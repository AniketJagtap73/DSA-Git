public class SumOfDigi {

    public static void main(String[] args){

        System.out.println(prod(1234));
        
    }

    static int sumDigi(int n){

        if(n==0){
            return 0;
        }
         return (n%10) + sumDigi(n/10);
    }

    static int prod(int n){
         if(n%10 == n){
            return n;
         }

         return (n%10) * prod(n/10);
    }
    
}
 
