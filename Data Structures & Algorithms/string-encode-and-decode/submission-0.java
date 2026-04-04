class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i=0;

        while(i<str.length()){
            int delimiterPos = str.indexOf("#",i);
            int length = Integer.parseInt(str.substring(i, delimiterPos));
            // Move pointer to the character after '#'
            i = delimiterPos + 1;
            // Extract the actual string using the length
            decoded.add(str.substring(i, i + length));
            // Move pointer to the start of the next length prefix
            i += length;
        }

        return decoded;
    }
}
