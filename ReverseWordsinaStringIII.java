/*
 * Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
 */

//对于StringBuilder 构造器，reverse(),toString 的使用
public class ReverseWordsinaStringIII {
	class Solution {
	    public String reverseWords(String s) {
	        String[] str = s.split(" ");
	        for(int i=0; i<str.length; i++){
	            str[i] = new StringBuilder(str[i]).reverse().toString();
	        }
	        StringBuilder result = new StringBuilder();
	        for(String st : str){
	            result.append(st + " ");
	        }
	        return result.toString().trim();
	    }
	}
}
