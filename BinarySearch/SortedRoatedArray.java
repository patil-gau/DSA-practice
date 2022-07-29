class SortedRoatedArray{
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr,6));
    }

    public static int pivot(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(m<e && arr[m]>arr[m+1]){
                return m;
            }
            if(m>s && arr[m]<arr[m-1]){
                return m-1;
            }
            if(arr[s]>=arr[m]){
                e = m-1;
            }
            if(arr[s]<arr[m]){
                s = m+1;
            }


        }

        return -1;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int search(int[] nums, int target) {
        int pivot = pivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
}