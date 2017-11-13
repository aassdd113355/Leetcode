import java.util.Arrays;

public class ArrayPartitionOne {

	public static void main(String[] args) {
		int[] testarray = {1,2,3,4,5,6};
		ArrayPartitionOne apo = new ArrayPartitionOne();
		System.out.println(apo.arrayPairSum(testarray));
	}
	
	
	public int arrayPairSum(int[] nums) {
		int groupNum = nums.length/2;
		int[][] ArrayPartGroup = new int[groupNum][2];
		int sum = 0;
		Arrays.sort(nums);
		for(int i=0; i<groupNum; i++){
			for(int j=0; j<2; j++){
				ArrayPartGroup[i][j] = nums[2*i+j];
			}
			sum += ArrayPartGroup[i][0];
		}
		return sum;
        
    }

}
