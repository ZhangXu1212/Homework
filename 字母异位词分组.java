class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for(String str : strs) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key,list);
            
        }
        return new ArrayList<List<String>>(map.values());
    }
}