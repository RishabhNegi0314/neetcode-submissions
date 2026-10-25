class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        int n = strs.length;
        for(int i=0; i<n; i++){
            String s = strs[i];
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String sortedWord = new String(arr);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
