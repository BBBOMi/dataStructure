package stackExample02;

public class StackTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptExp02 opt = new OptExp02();
		int result;
		String exp = "35*62/-";
		
		System.out.println("후위표기식 : " + exp);
		result = opt.evalPostfix(exp);
		System.out.println("결과 : " + result);
	}

}
