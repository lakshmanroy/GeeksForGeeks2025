import java.util.*;
public class PascalTraingle {
    public static List<List<Integer>>pascal(int numRow){
        List<List<Integer>>traingle=new ArrayList<>();

        traingle.add(new ArrayList<>());
        traingle.get(0).add(1);

        for(int i=1;i<numRow;i++){
            List<Integer>row=new ArrayList<>();
            List<Integer>prevRow=traingle.get(i-1);

            row.add(1);

            for(int j=1;j<i;j++){
                row.add(prevRow.get(j)+prevRow.get(j-1));

            }
            row.add(1);
            traingle.add(row);
        }
         return traingle;
    }
    public static void main(String args[]){
        int numRow=4;

        List<List<Integer>>result=pascal(numRow);
        for(List<Integer>element:result){
            System.out.println(element+ " ");
        }
    }
}
