public class MaxProfit {
    public static int solution(int[] A){
        if(A.length <= 1){
            return 0;
        }

        int maxSoFar = 0;
        int maxEndHere = 0;
        int minPrice = A[0];

        for(int i = 1; i < A.length; i++){
            maxEndHere = Math.max(0,A[i]-minPrice);
            minPrice = Math.min(minPrice,A[i]);
            maxSoFar = Math.max(maxSoFar,maxEndHere);
        }

        return maxSoFar;
    }
}
