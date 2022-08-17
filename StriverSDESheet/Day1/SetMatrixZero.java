public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
        int m = matrix.length;
        int n = matrix[0].length;

        //markers to check if 1st col or 1st has any zero
        int col = 1;  // if 1st col has zero then mark col = 0
        int row = 1; 

        //check if first row any zero is there
        for(int i=0,j=0;j<n;j++){
            if(matrix[i][j]==0){
              row = 0;
            }
        }

        //check if first col any zero is there
        for(int i=0,j=0;i<m;i++){
            if(matrix[i][j]==0){
              col = 0;
            }
        }

        //iterate over the remaining matrix(leaving 1st and 1st col) and check if 
        // any val is zero if it is then mark it as zero at the corresponding 
        //1st row and 1st row which are used to keep a track of which row or col is zero

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][i] = 0;
                }
            }
        }

     //check in the first row and mark corresponding col as 0
     for(int j=1;j<n;j++){
         if(matrix[0][j]==0){
            for(int i=1;i<m;i++){
                matrix[i][j] = 0;
            }
         }
     }  
     
     for(int i=1;i<m;i++){
        if(matrix[i][0]==0){
           for(int j=0;j<n;j++){
               matrix[i][j] = 0;
           }
        }
    }  

     //check if row or col is zero acc to that make the make 1st row and col as zero
     if(row==0){
        for(int i=0,j=0;j<n;j++){
             matrix[i][j] = 0; 
        }
     }  
     
    //check if row or col is zero acc to that make the make 1st row and col as zero
    if(col==0){
        for(int i=0,j=0;i<m;i++){
             matrix[i][j] = 0; 
        }
     }   
    }
}
