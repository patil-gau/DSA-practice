//Question : given an array of integers return number
// of even digits in the array
class Problem1 {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8};
        int ans = noOfEvenDigits(arr);
        System.out.println(ans);

        
    }

    static int noOfEvenDigits(int[] arr){
        int counter = 0;
        for(int num : arr){
            if(num%2==0){
                counter++;
            }
        }

        return counter;
    }
}