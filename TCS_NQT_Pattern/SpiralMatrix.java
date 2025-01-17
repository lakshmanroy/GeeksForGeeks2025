public class SpiralMatrix {
    public static void setMatrix(int matrix[][]){
        int n=matrix.length,m=matrix[0].length;
        int top=0,botton=n-1,left=0,right=m-1;
        while (left<=right && top<=botton) {
             for(int i=left;i<=right;i++){
                System.out.print(matrix[top][i]+ " ");
             }
             top++;
             for(int i=top;i<=botton;i++){
                System.out.print(matrix[i][right]+ " ");
             }
             right--;
             if(top<=botton){
                for(int i=right;i>=left;i--){
                    System.out.print(matrix[botton][i]+ " ");
                }
                botton--;
             }
             if(left<=right){
                for(int i=botton;i>=top;i--){
                    System.out.print(matrix[i][left]+ " ");
                }
                left++;
             }
        }
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},
                       {4,5,6},
                       {7,8,9}};

                       setMatrix(matrix);
    }
}