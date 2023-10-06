public class CountSteps {

    public static void main(String[] args){

        System.out.println(countS(41));

    }

    static int countS(int n){
        return helpFunc(n,0);
    }

    static int helpFunc(int n, int count){
        if(n==0){
            return count;
        }
        if(n%2==0){
            return helpFunc(n/2,count+1);
        }
        return helpFunc(n-1,count+1);
    }
    
}
