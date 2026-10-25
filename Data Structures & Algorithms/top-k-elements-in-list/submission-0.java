class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>(map.keySet());
        ans.sort((a,b)-> map.get(b) - map.get(a));
        
        int[] res = new int[k];
        int ind = 0;
        for(int i=0; i<k; i++){
            res[ind++] = ans.get(i);
        }
        return res;
    }
}