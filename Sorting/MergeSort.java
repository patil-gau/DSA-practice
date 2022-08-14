import java.util.Arrays;

class MergeSort{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] res = mergeSort(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        int[] res = merge(left,right);
        return res;
    }

    public static int[] merge(int[] left,int[] right){
        int[] mix = new int[left.length+right.length];
        int l = 0;
        int r = 0;
        int m = 0;

        while(l<left.length && r<right.length){
             if(left[l]<right[r]){
                mix[m] = left[l];
                l++;
             }
             else{
                mix[m] = right[r];
                r++;
             }
            m++;
        }
        //copy left remaining elements
        while(l<left.length){
            mix[m] = left[l];
            l++;
            m++;
         } 
          //copy right remaining elements
          while(r<right.length){
              mix[m] = right[r];
              r++;
              m++;
           } 
      return mix;  
    }
}