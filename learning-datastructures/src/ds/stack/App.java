package ds.stack;

public class App {

	public static void main(String[] args) {
		
		Stack myStack = new Stack(10);

		System.out.println("test master");

		System.out.println("test master");

		/*myStack.push(20);
		myStack.push(40);
		myStack.push(60);
		myStack.push(80);*/
		
		while(!myStack.isEmpty()){
			long val = myStack.pop();
			System.out.println(val);
		}
		
		System.out.println(reverseString("hello"));
		
	}
	
	public static String reverseString(String str){
		
		int stackSize = str.length(); 
		Stack st = new Stack(stackSize);
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			st.push(ch);
		}
		
		String result = "";
		while(!st.isEmpty()){
			char ch = st.pop();
			result = result + ch;
		}
		
		return result;
	}
}
