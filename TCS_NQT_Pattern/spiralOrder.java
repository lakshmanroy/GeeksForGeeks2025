import java.util.*;
public class spiralOrder{
    public static List<Integer>spiral(int matrix[][]){
        List<Integer>result=new ArrayList<>();
        int n=matrix.length,m=matrix[0].length;
        int top=0,bottom=n-1,left=0,right=m-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3},
                       {4,5,6},
                       {7,8,9}};
                       
                       List<Integer>result=spiral(matrix);
                       System.out.print(result);
    }
}