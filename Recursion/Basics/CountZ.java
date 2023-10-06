class CountZ{
    public static void main(String[] args){

        System.out.println(countZ(100040));

    }

    static int countZ(int n){
       return helpFunc(n,0);
    }

    static int helpFunc(int n , int c){

        if(n==0){
            return c;
        }

        int rem = n%10;

        if(rem==0){
            return helpFunc(n/10,c+1);
        }

        return helpFunc(n/10,c);

    }
}