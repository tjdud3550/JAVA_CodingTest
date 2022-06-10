import java.util.ArrayList;
import java.util.Scanner;
public class Inflearn03_01 {
	public ArrayList<Integer> solution(int n, int m, int[]a,int[]b){
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 =0, p2=0; //포인터
		while(p1<n&&p2<m) {
			if(a[p1]<b[p2]) answer.add(a[p1++]);
			else answer.add(b[p2++]);			
		}
		while(p1<n) answer.add(a[p1++]);
		while(p2<n) answer.add(a[p2++]);

		
		
		
		return answer;
	}
	  

	public static void main(String[] args) {
		//효율적으로 짜라..^^...진짜 배열쓰라는거 아님
		Inflearn03_01 T = new Inflearn03_01();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] a = new int[n];
		for(int i =0; i<n; i++) {
			a[i] = scanner.nextInt();
		} //첫번쨰 배열 
		int m = scanner.nextInt();
		int [] b = new int[m];
		for(int i =0; i<m; i++) {
			b[i]= scanner.nextInt();
		} //두번쨰 배열 
		for(int x:T.solution(n,m,a,b)) System.out.print(x+"");
	}

}
