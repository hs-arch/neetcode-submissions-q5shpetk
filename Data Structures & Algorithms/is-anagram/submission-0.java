class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String sorteds1 = new String(s1);


        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        String sortedt1 = new String(t1);

        System.out.println("String sorteds1: " + sorteds1);
        System.out.println("String sortedt1: " + sortedt1);

        if(sorteds1.equals(sortedt1)){
            return true;
        }

        return false;
    }
}
