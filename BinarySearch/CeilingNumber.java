class Problem1{
    public static void main(String[] args) throws Exception{
        int res = ceilingNum();
        System.out.println(res);
    }
    public static int ceilingNum(){
        int[] arr = {1,2,3,4,5,6,7,10,14};
        int start = 0;
        int target = 12;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end){
            mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }

    }
    return arr[start];
    }
}