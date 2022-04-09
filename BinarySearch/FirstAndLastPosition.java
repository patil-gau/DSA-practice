class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res =  {-1,-1};
        
        res[0] = searchIndex(nums,target,true);
        if(res[0]!=-1){
            res[1] = searchIndex(nums,target,false);
        }
        
        
     return res;
        
    }
    
    public static int searchIndex(int[] nums,int target,boolean isSearchStart){
        int start = 0;
        int end = nums.length -1;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                ans = mid;
                if(isSearchStart){
                    end = mid-1;
                }
                else{
                   start = mid+1; 
                }
                
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

    }
        return ans;
        
    }
}