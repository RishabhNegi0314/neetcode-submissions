class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prod = 1;
        int z = 0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                prod *= nums[i];
            }
            else {
                z ++;
            }
        }
        if(z > 1) return new int[n];
        int [] res = new int[n];
        for(int i=0; i<n; i++){
            if(z > 0){
                res[i] = (nums[i] == 0) ? prod : 0;
            }
            else {
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}  
