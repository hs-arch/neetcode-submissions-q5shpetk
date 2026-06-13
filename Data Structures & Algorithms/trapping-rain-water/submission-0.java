class Solution {
    public int trap(int[] height) {
        
        int left = 0;
        int right = height.length-1;
        int water = 0;

        int maxWallonLeft = 0;
        int maxWallonRight = 0;

        while(left <= right){    

            if(height[left] < height[right]){
                maxWallonLeft = Math.max(maxWallonLeft, height[left]);
                water = water + (maxWallonLeft - height[left]);
                left++;
            }else{
                maxWallonRight = Math.max(maxWallonRight, height[right]);
                water = water + (maxWallonRight - height[right]);
                right--;
            }
        }
        return water;
    }
}
