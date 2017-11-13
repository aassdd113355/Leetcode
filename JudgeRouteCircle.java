import java.util.Scanner;
/*
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place. 
The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle. 
 */
//下次做时用枚举类型
public class JudgeRouteCircle {

	public boolean judgeCircle(String moves) {
		int v = 0;
		int x = 0;
		for(char c : moves.toCharArray())
		switch(c){
		case 'U' : v++;break;
		case 'D' : v--;break;
		case 'R' : x++;break;
		case 'L' : x--;break;
		}
		return v == 0 && x == 0;       
    }
	
	
	
	public static void main(String[] args) {
	JudgeRouteCircle j = new JudgeRouteCircle();
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	System.out.println(s);
	System.out.println(j.judgeCircle(s));
	}
	

}

