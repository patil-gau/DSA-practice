import java.util.*;;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,1,6};

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                arr[i] = 0;
            }
            else{
                hm.put(arr[i],1);
            }
        }
        System.out.println(Arrays.toString(arr));
        ArrayListHashSetMethod();
    }

    public static void ArrayListHashSetMethod(){
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,2,3,1,5,6));
    
        HashSet<Integer> hs = new HashSet<>(al);
    
        System.out.println(hs);
    }
    
}
