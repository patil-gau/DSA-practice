import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.standard.Sides;

import java.util.List;

public class ReduceArrayToHalf {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,5,5,5,2,2,7};
       System.out.println(minSetSize(arr)); 
    }


    public static int minSetSize(int[] arr) {
        int min = arr.length/2;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
            else{
                 hmap.put(arr[i],1);
            }     
        }

        ArrayList<Integer> list = new ArrayList<>(hmap.values());
        Collections.sort(list);
        int sum = 0;
        int count = 0;
        for(int i=list.size()-1;i>=0;i--){
            sum += list.get(i);
            count++;
            if(sum>=min){
                return count;
            }
            
        }
     return arr.length;   
    }
}
