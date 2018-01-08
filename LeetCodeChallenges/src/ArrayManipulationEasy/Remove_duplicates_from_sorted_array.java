package ArrayManipulationEasy;

public class Remove_duplicates_from_sorted_array {

    public int removeDuplicates(int[] nums) {
        if (nums.length > 1){
            int a = nums[0];
            int b = nums[0];
            int point = 0;
            int distinctVals = 1;
            for (int i = 1; i < nums.length; i++){
                a = nums[i];
                if(a != b){
                    distinctVals++;
                    b = nums[i];
                    point++;
                    nums[point] = a;
                }
            }
            return distinctVals; //  returns the following
//            Given nums = [1,1,2],
//
//            		Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
//            		It doesn't matter what you leave beyond the new length.
        }
        else if (nums.length == 1)
        {
            return 1;
        }
        else if (nums.length == 0){
            return 0;
        }
        return 1;
    }
}

