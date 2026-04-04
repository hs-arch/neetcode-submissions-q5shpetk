class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // {
        //     "aht"  -> "hat",
        //     "act"  -> "act","cat",
        //     "opst" -> "stop","pots","tops"
        // }

        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> answerList = new ArrayList<>();

        // System.out.println(strs.length);

        for(int i=0; i<strs.length; i++){
            String s1 = strs[i];
            
            // s1 has my current string
            // System.out.println("s1 : " + s1);
            char[] charstr = s1.toCharArray();
            Arrays.sort(charstr);
            String sortedString = new String(charstr);

            // System.out.println("Sorted char array : " + Arrays.toString(charstr));
            // System.out.println("Sorted string : " + sortedString);

            // Now ill check in my Hashmap is this sorted string is a key or not in my hashmap.
            // for(String key : map.keySet()){
            //     if(key.equals(sortedString)){
            //         // if key is present i dont need to do anything
            //     }else{
            //         // if key is not present i need to add key
            //         map.put(sortedString, new ArrayList<>());
            //     }
            // }

            if(map.containsKey(sortedString)){
                // if it contains , do nothing
                map.get(sortedString).add(s1);
            }else{
                map.put(sortedString, new ArrayList<>());
                map.get(sortedString).add(s1);
            }

        }

            map.keySet().forEach(key->System.out.println("key:"+key + " value : " + map.get(key)));
            map.keySet().forEach(key->answerList.add(map.get(key)));
            // map.keySet.forEach(key->)

        return answerList;

    }
}
