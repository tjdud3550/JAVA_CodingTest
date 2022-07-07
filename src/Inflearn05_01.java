import java.util.*;
public class Inflearn05_01 {
	public String solution(String str) {
		String answer= "YES";
		Stack<Character> stack = new Stack<>();
		for(char x: str.toCharArray()) {
			if(x=='(' ) stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO"; //���� ��ȣ�� ���� ��Ȳ
		
		
		return answer;
		
	}

	public static void main(String[] args) {
		 Inflearn05_01 T = new  Inflearn05_01();
		 Scanner sc = new Scanner(System.in);
		 String str = sc.next();
		 System.out.println(T.solution(str));
		 sc.close();
	

	}

}
