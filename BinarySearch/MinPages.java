public class MinPages {
    public static void splitArray(int[] nums, int m) {
        
        int low = nums[0];
        int high = 0;
        int ans = 0;
        for(int num: nums){
            high+=num;
            if(num>low){
                low = num;
            }
        }
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(isPossible(nums,mid,m)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        System.out.println(ans);
        
    }
    
    public static boolean isPossible(int[] nums,int mid,int m){
        int sum = 0;
        int st = 1;
        for(int i=0;i<=nums.length-1.;i++){
            sum+=nums[i];
            if(sum>mid){
                st++;
                sum = nums[i];
            }
        }
        if(st>m){
            return false;
        }
        return true;
    }
}
