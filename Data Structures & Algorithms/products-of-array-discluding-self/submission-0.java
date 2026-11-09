class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prod = 1;
        int z = 0;

        for(int i : nums){
            if(i != 0){
                prod *= i;
            }else{
                z++;
            }
        }

        if(z > 1){
            return new int[nums.length];
        }
        
        int [] res = new int[nums.length];
        for(int i=0; i< nums.length; i++) {
            if(z > 0){
                res[i] = (nums[i] == 0) ? prod : 0;
            }else {
                res[i] = prod / nums[i];
            }
        }
        return res;
    }
}  
