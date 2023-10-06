import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args){

        int[] arr = {2,3,1,45,45,78};
        System.out.println(lS(arr,78,0));
        allIndex(arr,45,0);
        System.out.println(list);

    }
    static boolean linearSearch(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }

        return arr[index]==target || linearSearch(arr,target,index+1);
    }

    static int lS(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return lS(arr,target,index+1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void allIndex(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        
            allIndex(arr,target,index+1);
       
    } 
      
    
}
