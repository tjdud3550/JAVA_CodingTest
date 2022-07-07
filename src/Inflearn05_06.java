import java.util.*;
//공주구하기 큐 사용 FIFO

class Inflearn05_06 {	
	public int solution(int n, int k){
		int answer=0;
		Queue<Integer> Q=new LinkedList<>();
		for(int i=1; i<=n; i++) Q.offer(i);
		while(!Q.isEmpty()){
			for(int i=1; i<k; i++) Q.offer(Q.poll());
			Q.poll();
			if(Q.size()==1) answer=Q.poll();
		}
		return answer;
	}
	public static void main(String[] args){
		Inflearn05_06 T = new Inflearn05_06();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}