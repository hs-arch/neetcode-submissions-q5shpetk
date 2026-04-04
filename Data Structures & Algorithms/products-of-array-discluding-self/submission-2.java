class Solution {
    public int[] productExceptSelf(int[] nums) {

        // creating prefix array.
        int[] pre = new int[nums.length];
        int product = 1;
        
        for(int i=0;i<nums.length;i++){
            pre[i] = product;
            product = product*nums[i];
        }

        // creating suffix array
        int[] suf = new int[nums.length];
        int product2 = 1;

        for(int i=nums.length-1;i>=0;i--){
            suf[i] = product2;
            product2 = product2 * nums[i];
        }

        int[] finalArr = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            finalArr[i] = pre[i]*suf[i];
        }

        return finalArr;
    }
}  

// Now solve it using prefix and suffix to make it O(n) time complexity.



