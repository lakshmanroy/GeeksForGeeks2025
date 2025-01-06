public class SumOfFirstNth_terms {
    public static int sumOfSeries(int n){
      int sum=n*(n+1)/2;
      return sum*sum;
    }
    public static void main(String[] args) {
        int n=5;

        System.out.print(sumOfSeries(n)+ " ");
    }
}
