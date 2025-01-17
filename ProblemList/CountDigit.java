public class CountDigit {
public static int countDigit(int n){
  int count=0;
  int original=n;
  while(n>0){
    int digit=n%10;
    n=n/10;

    if(digit!=0 && original % digit==0){
        count++;
    }
  }
  return count;
}
    public static void main(String[] args) {
        int n=12;

        System.out.println(countDigit(n));
    }
}