import java.util.Scanner;

public class CountVowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String input=sc.nextLine().toLowerCase();
        int v=0,c=0;

        for(char ch:input.toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1){
                    v++;
                }
                else{
                    c++;
                }
            }
        }
        System.out.println(v+ " "+ c);
    }
}