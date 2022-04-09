public class PeakElement {


    public static void main(String[] args) {  
        int[] nums = {1,2,3,1};    
        int target = nums[1];
        int index = searchIndex(nums,target);
        System.out.println(index);
        
    }
    

    public static int searchIndex(int[] nums,int target){
        int start = 0;
        int end = 1;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                //push start and end if next ele is greater
                if(nums[end+1]>nums[end]){
                    start++;
                    end=end+1;
                    target=nums[end];
                }
                else{
                    ans = mid;
                    start++;
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
