class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums) set.add(x);
        if(set.size()==n) return false;
        else return true;
    }
}