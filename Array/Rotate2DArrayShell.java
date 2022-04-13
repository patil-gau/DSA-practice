import java.io.*;
import java.util.*;

public class Rotate2DArrayShell {

    public static void main(String[] args) throws Exception {
        // write your code here
    Scanner sc = new Scanner(System.in); 
    int n = sc.nextInt();
    int m = sc.nextInt();   
    int[][] arr = new int[n][m];
    for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
    }


    int s = sc.nextInt();
    int r = sc.nextInt();

    int maxrow = n-s;
    int maxcol = m-s;
    int minrow = s-1;
    int mincol = s-1;

    int newn = (maxcol-mincol) * (maxrow-minrow);
    
    //new number of rotations to make 
    r = r % newn;
    if(r<0){
        r = r + newn;
    }
    int[] d = new int[newn];
    int k = 0;
    for(int i=minrow,j=mincol;i<=maxrow;i++){
         d[k] = arr[i][j];
         k++;
    }
    for(int i=maxrow,j=mincol+1;j<=maxcol;j++){
        d[k] = arr[i][j];
        k++;
    }
    for(int i=maxrow-1,j=maxcol;i>=minrow;i--){
        d[k] = arr[i][j];
        k++;
    }
    for(int i=minrow,j=maxcol-1;j>mincol;j--){
        d[k] = arr[i][j];
        k++;
    }

    
   int[] na =  reverse(d);
   int z =0;
   for(int i=minrow,j=mincol;i<=maxrow;i++){
        arr[i][j] = na[z];
        z++;
   }
   for(int i=maxrow,j=mincol+1;j<=maxcol;j++){
    arr[i][j] = na[z];
    z++;
   }
   for(int i=maxrow-1,j=maxcol;i>=minrow;i--){
    arr[i][j] = na[z];
    z++;
   }
   for(int i=minrow,j=maxcol-1;j>mincol;j--){
        arr[i][j] = na[z];
        z++;
   }

    


    
    

    }

    static int[] reverse(int a[]){

     for(int i=0,j=a.length-1;i==j;i++,j--){
         int temp = a[i];
         a[i] = a[j];
         a[j] =  temp;

     } 
     
     return a;
  
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}