class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        
        for (String str : strs) {
            String key = sort(str);

            if (!map.containsKey(key))
                map.put(key, new ArrayList<String>());

            map.get(key).add(str);
        }
        
        return new ArrayList(map.values());
    }
    
    private String sort(String str) {
        char[] a = str.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

}
