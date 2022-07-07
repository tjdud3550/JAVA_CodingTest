import java.util.*;

public class Inflearn05_04 {
	public int solution(String str) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>();
		for (char x: str.toCharArray()) {
			if(Character.isDigit(x)) {
				stack.push(x-48); //�� x-48
			}
			else {
				int rt = stack.pop();
				int lt = stack.pop();
				//��Ģ����
				if(x=='+') stack.push(lt+rt);
				else if(x=='-') stack.push(lt-rt);
				else if(x=='*') stack.push(lt*rt);
				else if(x=='/') stack.push(lt/rt);
			}
		}
		answer = stack.get(0);
		return answer;
		}
	
		
		

	public static void main(String[] args) {
		
		Inflearn05_04 T = new Inflearn05_04();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		sc.close();

	}

}
