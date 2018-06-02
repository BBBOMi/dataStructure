package stackExample02;

public class OptExp02 {
	private String exp;
	
	public int evalPostfix(String postfix) {
		LinkedStack stack = new LinkedStack();
		exp = postfix;
		int opr1, opr2;
		char ch;
		
		for(int i=0; i<exp.length(); i++) {
			ch = exp.charAt(i);
			
			if(ch != '+' && ch != '-' && ch != '*' && ch != '/') {
				stack.push(ch - '0');
			} else {
				opr2 = stack.pop();
				opr1 = stack.pop();
				
				switch(ch) {
				case '+' :
					stack.push(opr1 + opr2);
					break;
				case '-' :
					stack.push(opr1 - opr2);
					break;
				case '*' :
					stack.push(opr1 * opr2);
					break;
				case '/' :
					stack.push(opr1 / opr2);
					break;
				}
			}
		}
		return stack.pop();
	}
}
