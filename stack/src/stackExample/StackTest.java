package stackExample;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptExp opt = new OptExp();
		String exp = "(3*5)-(6/2)";
		char postfix[];
		
		System.out.println(exp);
		if(opt.testPair(exp))
			System.out.println("괄호 맞음!");
		else
			System.out.println("괄호 틀림!");
		
		System.out.print("후위표기식 : ");
		postfix = opt.toPostfix(exp);
		System.out.println(postfix);	
	}

}
