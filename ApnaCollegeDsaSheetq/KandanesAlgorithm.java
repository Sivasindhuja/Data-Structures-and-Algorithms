package ApnaCollegeDsaSheetq;

public class KandanesAlgorithm {

     int maxSubarraySumbruteforce(int[] arr) {
        int maxSum=Integer.MIN_VALUE;
       
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }

    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }

        }
        return maxSum;
    }
}
