class Solution {
    public boolean isPalindrome(String s) {

        String cleaneds = s.replaceAll("[^0-9a-zA-Z]","");
        System.out.println("cleaned s  : "  + cleaneds);

        String reversed = new StringBuilder(cleaneds).reverse().toString();
        System.out.println("reversed cleaned string  : "  + reversed);

        if(reversed.equalsIgnoreCase(cleaneds)) return true;

        return false;
    }
}
