import java.util.*;
public class Inflearn04_01 {
	
	public char solution(int n, String s) {
		char answer= ' ';
		HashMap<Character, Integer> map = new HashMap<>();
		//문자열 for문
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);
		}
		//특정키가 있는지 확인
		System.out.println(map.containsKey('A'));
		//size 키의 갯수 
		System.out.println(map.size());
		//키 삭제
		System.out.println(map.remove('A'));
		int max = Integer.MIN_VALUE;
		for(char key : map.keySet()) {
			//System.out.println(x+""+map.get(x));
			if(map.get(key)>max) {
				max = map.get(key);
				answer = key;
			}
		
		}
		
		
		
		
		
		
		
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn04_01 T = new Inflearn04_01();
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n, str));
		sc.close();
	}

}
