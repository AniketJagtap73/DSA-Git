import java.util.ArrayList;

public class ArrLis {
    public static void main(String[] args){

        int[] arr = {2,3,1,45,45,78};
        ArrayList<Integer> ans =(findIndex(arr,45,0,list));
        System.out.println(ans);
        System.out.println(findIndex2(arr,45,0));

    }
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findIndex(int[] arr,int target,int index,ArrayList<Integer> list){

        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

        return findIndex(arr,target,index+1,list);

    }

    static ArrayList<Integer> findIndex2(int[] arr,int target,int index){
    
    ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findIndex2(arr,target,index+1);

       list.addAll(ansFromBelowCalls);

       return list;

    }


    
}
