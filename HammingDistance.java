/*
 * @author Lee
 * 2017.9.29
 * 海明距離：比較兩個（相同长度）字对应位不同的数量
 * 思路：先轉化2進制（或不用），將兩數組的每位進行亦或操作，對得到的數/數組檢測為1位的數量
 */
public class HammingDistance {
		static int count = 0;
	public int hammingDistance(int x, int y) {
		int result = x ^ y;
	
		
		printBinary(result);
			
			
			
			
        return count;
    }
	
	public static void printBinary(int x){
		if(x > 1){
			printBinary(x/2);
		}
		//System.out.print(x%2);
		if(x%2 == 1){
			count++;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * unit test
	 */
	public static void main(String[] args) {
		//printBinary(8);
		HammingDistance hd = new HammingDistance();
		hd.hammingDistance(1,4);
		System.out.println(hd.count);
	}

}
