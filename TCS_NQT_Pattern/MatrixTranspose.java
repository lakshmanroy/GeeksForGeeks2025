public class MatrixTranspose {
    public static void rotate(int matrix[][]){
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                       {4,5,6},
                       {7,8,9}};
                       
                       rotate(matrix);
                       
                       for(int row[]:matrix){
                           for(int element:row){
                               System.out.print(element+ " ");
                           }
                           System.out.println();
                       }
    }
}
