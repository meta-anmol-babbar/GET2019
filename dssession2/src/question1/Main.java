package question1;

public class Main {
	public static void main (String args[]){
		Stack s=new Stack();
		s.push("1");
		s.push("2");
		s.push("=");
		//s.print();
		//s.pop();
		//s.print();
//		System.out.println(s.peek());
		//String s1= "=";
		//System.out.println(Precedence.precedence.get("="));
	//	for(String P : Precedence.precedence.keySet()) {
			//System.out.println("->" + P.);
			//Precedence.show();
		StackOperations s1=new StackOperations();
		s1.infixToPostfix("( a + b ) * ( c + d )");
			
	}

}
