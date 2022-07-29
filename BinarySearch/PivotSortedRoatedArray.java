public class PivotSortedRoatedArray {
    public static void main(String[] args) {
       int[] arr = {2,3,4,5,7,0,1};
       System.out.println(findPivot(arr));
        
    }

    static int findPivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(mid<e && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[s]<=arr[mid]){
                s = mid+1; 
            }
            else{
                
                e = mid-1;
            }
            
        }
        return -1;

    }
}
