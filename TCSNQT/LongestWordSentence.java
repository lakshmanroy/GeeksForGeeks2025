import java.util.Scanner;

public class LongestWordSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        String input=sc.nextLine();
        
        String words[]=input.split(" ");
        String longestWord="";
        
        for(String word:words){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        System.out.println(longestWord);
     }
    }