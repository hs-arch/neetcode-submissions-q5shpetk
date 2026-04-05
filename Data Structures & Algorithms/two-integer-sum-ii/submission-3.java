class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] resultArr = new int[2];

        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[i] + numbers[j] == target){

                    System.out.println("i is :" + numbers[i]);
                    System.out.println("j is :" + numbers[j]);
                    resultArr[0] = i+1;
                    resultArr[1] = j+1;
                    return resultArr;
                }
            }
        }
        return resultArr;
    }
}
