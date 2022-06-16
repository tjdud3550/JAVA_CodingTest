import java.util.*;
public class Inflearn03_04 {

	public static void main(String[] args) {
		Inflearn03_04 T = new Inflearn03_04();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //N°³ÀÇ ¼ö 
		int m = sc.nextInt(); //Æ¯Á¤ ¼ıÀÚ M
		int count = 0; //MÀÇ °æ¿ì°¡ ¸î¹ø ÀÖ´ÂÁö ´ãÀ» º¯¼ö 
		int sum = 0;
		int answer = 0, lt = 0;
		int [] arr = new int[n];
		
		for (int i = 0; i <= n; i++) {
			arr[i] = sc.nextInt(); //¼ö¿­ ³ÖÀ½ 1 2 1 3 1 1 2
		}
		
		//two pointer ÀÌ¿ëÇØ¼­ ÇÕ ±¸ÇÏ±â (ÀÌÁß for¹®) ¹Ì¯Q
		for (int rt = 0; rt < n ; rt++) {
			sum += arr[rt];
			if (sum == m) count++;
			while(sum>=m) {
				sum -= arr[lt++];
				if(sum == m) count++;
				
			}			
		}

		
		
		System.out.print(count);
		sc.close();
	}

}
