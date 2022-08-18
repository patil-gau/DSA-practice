import java.util.*;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.


public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {-3,4,3,90};
        int target = 0;
        int[] ans = twoSum(arr,target);
        for(int x : ans){
            System.out.println(x);
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();


        for(int i=0;i<arr.length;i++){
                int rem = target - arr[i];
                if(hmap.containsKey(rem)){
                   return new int[] {i,hmap.get(rem)};
                }
                else{
                    hmap.put(arr[i],i); 
                }
           
        }
       return new int[] {-1,-1}; 
     }
}
