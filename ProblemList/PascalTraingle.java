
import java.util.ArrayList;

public class PascalTraingle {
    ArrayList<Integer>pascalTraingle(int n){
        ArrayList<Integer>row=new ArrayList<>();

        if(n<=0){
            return row;
        }
        row.add(1);
        for(int i=1;i<n;i++){
            ArrayList<Integer>prev=new ArrayList<>();
            prev.add(1);

            for(int j=1;j<row.size();j++){
               prev.add(row.get(j-1)+row.get(j));
            }
            prev.add(1);
            row=prev;
        }
        return row;
    }
    public static void main(String[] args) {
        PascalTraingle p=new PascalTraingle();
        int n=4;

        System.out.println(p.pascalTraingle(n));
    }
}
