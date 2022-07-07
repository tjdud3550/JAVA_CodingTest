import java.util.*;



public class test01 {
	public String solution(int n, int m, String str1, String str2) {
		String answer = "Yes";
		
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		for (char x: str1.toCharArray()) {
			if(Character.isDigit(x)) {
				stack1.push(x-48); 
				
			}
			return stack1;
			
			/**
			for (char x: str2.toCharArray()) {
				if(Character.isDigit(x)) {
					stack2.push(x-48); 
				}	
			}
			**/
			
			
		
		
		
			
		//return answer;

	}
	public static void main(String[] args) {
		test01 t = new test01();
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i =0; i<m; i++) {
			String str1 = sc.next();
		}
		for(int i = 0; i<n-m;i++) {
			String str2 = sc.next();
		}
		
				
		//System.out.println(t.solution(n,m,str1, str2));
		}
		

	}


