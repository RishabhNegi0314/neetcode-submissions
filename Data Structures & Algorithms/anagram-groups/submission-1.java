class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;

        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<n; i++){
            String s = strs[i];
            char [] word = s.toCharArray();
            Arrays.sort(word);
            String sortedWord = new String(word);

            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
