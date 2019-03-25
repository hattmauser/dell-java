package FibonacciSeq;

public class FibonacciSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getfebSeq(4));
	}
	
	public static int getfebSeq(int index) {
		int firstsecpos = 1;
		
		if (index == 0 || index == 1) {	
			return firstsecpos;
		} else {
			return getfebSeq(index - 1) + getfebSeq(index - 2);
		}
	}

}
