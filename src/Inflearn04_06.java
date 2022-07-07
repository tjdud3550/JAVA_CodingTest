import java.util.*;



public class Inflearn04_06 {
	
	

	public static void main(String[] args) {
	    HashMap<Character, Integer> answer = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(char x : str.toCharArray()) {
			answer.put(x, answer.getOrDefault(x,  0)+1);
		}
      
		for(int i =0; i < str.length(); i++) {
			System.out.print(answer + " ");
		}
		sc.close();
}
}
