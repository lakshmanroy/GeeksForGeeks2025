public class StockAndBuy {
    public static int stockAndBuy(int arr[]){
        int maxProfit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                maxProfit+=arr[i]-arr[i-1];

            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={100, 180, 260, 310, 40, 535, 695};
        System.out.println(stockAndBuy(arr));
    }
}
