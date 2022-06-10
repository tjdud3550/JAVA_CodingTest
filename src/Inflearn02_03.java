import java.util.*;

public class Inflearn02_03 {
	public String solution(int n, int[] a, int [] b) {
		String answer = "";
		for(int i = 0; i< n; i++) {
			if(a[i] == b[i]) answer +="D";
			else if(a[i] == 1&& b[i] ==3) answer+="A";
			else if(a[i]==2 && b[i] ==1) answer+="A";
			else if(a[i]==3 && b[i] ==2) answer +="A";
			else answer += "B";
		}
		return answer;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inflearn02_03 T = new Inflearn02_03();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int [] a = new int[n];
		int [] b = new int[n];
		for(int i =0;i <n;i++) {
			a[i] = scanner.nextInt();
			//a의 가위바위보 넣을거
		}
		for(int i = 0; i<n; i++) {
			b[i] = scanner.nextInt();
			//b가위 바위 보 넣을거
		}
		for (char x : T.solution(n,a,b).toCharArray()) System.out.println(x);}

		
	}

}
