public class RevPrint {

    public static void main(String[] args){

        revPrint(5);
    }

    static void revPrint(int n){

        if(n==0){
            return;
        }

        System.out.println(n);

        revPrint(n-1);

        System.out.println(n);
    }
    
}
