import java.util.*;
public class Inflearn04_02 {
	
	public String solution(String s1, String s2) {
		String answer = "YES";
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s1.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1);
			
		}
		//존재하는 지확인
		for(char x : s2.toCharArray()) {
			if(!map.containsKey(x) || map.get(x)==0) return "NO";
			map.put(x, map.get(x)-1);
		}
		
		 
		
		return answer;
		
	}

	public static void main(String[] args) {
		Inflearn04_02 T = new Inflearn04_02();
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		
		System.out.print(T.solution(a, b));
	}

}
