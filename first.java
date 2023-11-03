import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str);
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)!=' ') st.push(str.charAt(i));
		    else{
		        while(st.empty()==false){
		            System.out.print(st.pop());
		            
		        }
		        System.out.print(" ");
		    }
		}
		while(st.empty()==false){
		    System.out.print(st.pop());
		}
	}
}