// Question : given an array of digits return 
// how many of them contain even number of digits

public class Problem2 {
   public static void main(String[] args){
    int[] arr  = {10,2,30222,4022,502};
    int ans = evenNoOfDigits(arr);
    System.out.println(ans);



   }  

   static int evenNoOfDigits(int[] arr){
    int count = 0;
    if(arr.length == 0){
        return -1;
    }
    
    for(int ele: arr){
        if(isEven(ele)){
            count++;
        }
    }

    return count;

   }

   static boolean isEven(int number){
       if(digits(number)% 2 == 0){
           return true;
       }
       else{
           return false;
       }
       
   }

   static int digits(int number){
    // int count = 0; 
    // if (number == 0){
    //     return 1;

    // }
    // if(number<0){
    //     number = number * -1;
    // } 
    // while(number > 0){
    //       count++;
    //       number = number/10;
    //   }
    //shortcut to find number of digits without while
    int totalDigits = (int)Math.log10(number)+1;
    return totalDigits;  
   }

   

}
