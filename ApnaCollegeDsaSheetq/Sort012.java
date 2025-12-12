package ApnaCollegeDsaSheetq;

public class Sort012{
    public static void sortColors(int[] nums) {
        int zeroCount=0;
        int oneCount=0;
        int twoCount=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            }
            else if(nums[i]==1){
                oneCount++;
            }
            else{
                twoCount++;
            }
        }

        int i=0;
        while(i<zeroCount){
            nums[i]=0;
            i++;
        }
        while(i<(zeroCount+oneCount)){
            nums[i]=1;
            i++;
        }
        while(i<nums.length){
            nums[i]=2;
            i++;
        }
       
        
    }

    public static void main(String args[]){
        int arr[]={2,2,0,0,1,1};
        sortColors(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}