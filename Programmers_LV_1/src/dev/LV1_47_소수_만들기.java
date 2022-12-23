package dev;

public class LV1_47_소수_만들기 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        int count=0;
        for(int i = 0;i< nums.length;i++){
            for(int j = i+1;j< nums.length;j++){
                for(int k = j+1;k< nums.length;k++){
                    if(isPrime(nums[i]+nums[j]+nums[k]))count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n){
        for(int i = 2; i<n;i++) if(n%i==0)return false;
        return true;
    }
}
