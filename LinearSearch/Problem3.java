// given a 2d array find richest person
// where i denotes person number and j denotes bank
// and [i][j] is the money ith person has in jth bank

public class Problem3 {
    public static void main(String[] args){
        int[][] accounts = {
         {1, 5},
         {7, 3},
         {3,5}
        };

        int weath = richestPerson(accounts);
        System.out.println(weath);

        
    }
    static int richestPerson(int[][] arr){
        
        if(arr.length<1){
            return -1;
        }

        int richest = Integer.MIN_VALUE;   
        for(int i=0; i<arr.length; i++){
               int tempRichest=0;
               for(int j=0; j<arr[i].length; j++){
                    tempRichest+=arr[i][j];
               }
               if(tempRichest>richest){
                   richest=tempRichest;
               }
           }
        return richest;    
    }
}
