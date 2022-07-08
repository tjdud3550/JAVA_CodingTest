import java.util.*;
class Node{ 
    int data; 
    Node lt, rt; 
    public Node(int val) { 
        data=val; 
        lt=rt=null; 
    } 
} 

//깊이 우선 탐색 
public void DFS(Node root) {
	if(root==null) return;
	else {
		DFS(root.lt);
		System.out.print(root.data+" ");
		DFS(root.rt);
	}
}


public class  Inflearn07_05{ 
    Node root;  //주소 저장  
    //너비 우선 탐색
    public void BFS(Node root){ 
		Queue<Node> Q=new LinkedList<>();
		Q.add(root);
		int L=0;
        while(!Q.isEmpty()){
            int len = Q.size();
			System.out.print(L+" : ");
            for(int i=0; i<len; i++){
                Node cur = Q.poll();
                System.out.print(cur.data+" ");
                if(cur.lt!=null) Q.add(cur.lt);
                if(cur.rt!=null) Q.add(cur.rt);
            }
			L++;
			System.out.println();
        }
    } 
  
    public static void main(String args[]) { 
    	Inflearn07_05 tree=new  Inflearn07_05(); 
        tree.root=new Node(1); 
        tree.root.lt=new Node(2); 
        tree.root.rt=new Node(3); 
        tree.root.lt.lt=new Node(4); 
        tree.root.lt.rt=new Node(5); 
		tree.root.rt.lt=new Node(6); 
        tree.root.rt.rt=new Node(7);
        tree.BFS(tree.root); 
    } 
} 