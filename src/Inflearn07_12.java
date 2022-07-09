
import java.util.*;
class Inflearn07_12 {
	static int n, m, answer=0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v){
		if(v==n) answer++;
		else{
			for(int i=1; i<=n; i++){
				//갈수있나 확인 현재지점 갈 수 있으면 확인, 방문 안할시에 확인
				if(graph[v][i]==1 && ch[i]==0){
					ch[i]=1;
					DFS(i);
					ch[i]=0;
				}
			}
		}
	}
	
	public static void main(String[] args){
		Inflearn07_12 T = new Inflearn07_12();
		Scanner kb = new Scanner(System.in);
		n=kb.nextInt();
		m=kb.nextInt();
		graph=new int[n+1][n+1]; //1~n까지의 인덱스 
		ch=new int[n+1]; //체크확인할 인덱스 
		for(int i=0; i<m; i++){
			int a=kb.nextInt();
			int b=kb.nextInt();
			graph[a][b]=1; ///방향 그래프 
		}
		ch[1]=1;
		T.DFS(1);
		System.out.println(answer);
	}	
}