class Solution {
    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        if(nums.length<1) return 0;

        int counter=1;
        int highest=1;

        for(int i=0;i<nums.length;i++){

            if(i==0){continue;}

            if(nums[i] == nums[i-1]+1){
                counter = counter+1;
                if(counter>highest){
                    highest = counter;
                }
            }else
            if(nums[i] == nums[i-1]){
                continue;
            }else{
                counter = 1;
            }
        }
        return highest;
    }
}
