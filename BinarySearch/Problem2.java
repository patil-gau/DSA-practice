public class Problem2 {
  public static void main(String[] args) throws Exception {
    char res = ceilingChar();
    System.out.println(res);
  }

  public static char ceilingChar(){
    char[] arr = {'c','e','f','j','r'};
    int start = 0;
    int target = 'e';
    int end = arr.length - 1;
    int mid = 0;
    // if not using % logic uncomment all commented section 
    // if(target > arr[arr.length-1]){
    //     return arr[0];
    // }
    while(start <= end){
        mid = start + (end - start) / 2;
        // if(arr[mid] == target){
        //     return arr[mid];
        // }
        if(target<arr[mid]){
            end = mid-1;
        }
        else{
            start = mid+1;
        }

}
//return arr[start];
//or use this logic
return arr[start%arr.length];
}
}
