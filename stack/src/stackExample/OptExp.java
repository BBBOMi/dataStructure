package stackExample;

public class OptExp {
	private String exp; // 수식
	private int expSize; // 수식의 길이
	private char openPair; // 여는 괄호 ((, {, [)인지 검사할 변수
	private char ch;
	
	public boolean testPair(String exp) {
		this.exp = exp;
		this.expSize = exp.length();
		LinkedStack stack = new LinkedStack();
		
		for(int i=0; i<expSize; i++) {
			ch = this.exp.charAt(i);
			
			switch(ch) {
			case '(':	case '{':	case '[':
				stack.push(ch);
				break;
				
			case ')':	case '}':	case ']':
				if(stack.isEmpty())
					 return false;
				else {
					openPair = stack.pop();
					if(openPair == '(' && ch == ')' ||
						openPair == '{' && ch =='}' ||
						openPair == '[' && ch == ']')
						break;
					else return false;
				}
			}
		}
		
		if(stack.isEmpty()) return true;
		else return false;
	}
	
	public char[] toPostfix(String infix) {
			this.exp = infix;
			this.expSize = infix.length();
			char[] postfix = new char[expSize];
			int j = 0;
			LinkedStack stack = new LinkedStack();
			
			for(int i=0; i<expSize; i++) {
				ch = exp.charAt(i);
				switch(ch) {
				case '0':	case '1':	case '2':
				case '3':	case '4':	case '5':
				case '6':	case '7':	case '8':	case '9':
					postfix[j++] = ch;
					break;
				
				case '+':	case '-':	case '*':	case '/':
					stack.push(ch);
					break;
						
				case ')':
					postfix[j++] = stack.pop();
					break;
				}
			}
			postfix[j] = stack.pop();
			return postfix;
	}
}
