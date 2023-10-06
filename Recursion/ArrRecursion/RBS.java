public class RBS {

    public static void main(String[] args){

        int[] arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(binSearch(arr,9,0,arr.length-1));

    }

    static int binSearch(int[] arr,int target,int s,int e){

        if(s>e){
            return -1;
        }

        int m = s + (e-s) / 2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[e]){
        if(target >= arr[s] && target <= arr[e]){
            return binSearch(arr,target,s,m-1);
        }
        else{
            return binSearch(arr,target,m+1,e);
        }
    }

        if(target >= arr[m] && target <= arr[e]){

            return binSearch(arr,target,m+1,e);

        }
        else{
            return binSearch(arr,target,s,m-1);
        }
    }

    
    
}
