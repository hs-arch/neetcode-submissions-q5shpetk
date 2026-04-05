class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // int[] resultArr = new int[2];

        // for(int i=0;i<numbers.length;i++){
        //     for(int j=0;j<numbers.length;j++){
        //         if(numbers[i] + numbers[j] == target){

        //             System.out.println("i is :" + numbers[i]);
        //             System.out.println("j is :" + numbers[j]);
        //             resultArr[0] = i+1;
        //             resultArr[1] = j+1;
        //             return resultArr;
        //         }
        //     }
        // }
        // return resultArr;


        // Now solve it using the 2 pointer technique.

        int pointerHead = 0;
        int pointerTail = numbers.length-1;

        int[] resultArr = new int[2];

        System.out.println("pointerhead : "  + pointerHead);
        System.out.println("pointerTail : "  + pointerTail);

        // for(int i=0;i<numbers.length;i++){}
        do{
            if(numbers[pointerHead] + numbers[pointerTail] == target)
            {
                resultArr[0] = pointerHead+1;
                resultArr[1] = pointerTail+1;
                return resultArr;
            }
            else
            if(numbers[pointerHead] + numbers[pointerTail] > target)
                {
                    pointerTail--;
                }
                else
                {
                    pointerHead++;
                }
            }
            while(pointerHead<pointerTail);
        return resultArr;
    }
}





