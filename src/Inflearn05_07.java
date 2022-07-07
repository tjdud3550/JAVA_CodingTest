


import java.util.*;
class Inflearn05_07 {	
	public String solution(String need, String plan){
		String answer="YES";
		Queue<Character> Q=new LinkedList<>();
		for(char x : need.toCharArray()) Q.offer(x);
		for(char x : plan.toCharArray()){
			if(Q.contains(x)){
				if(x!=Q.poll()) return "NO"; //�����鼭 Ȯ�� 
			}
		}
		if(!Q.isEmpty()) return "NO"; //�ʼ����� �̼� ������
		return answer;
	}
	public static void main(String[] args){
		Inflearn05_07 T = new Inflearn05_07();
		Scanner kb = new Scanner(System.in);
		String a=kb.next();
		String b=kb.next();
		System.out.println(T.solution(a, b));
	}
}