package sample;

import javax.swing.plaf.basic.BasicSplitPaneDivider;

public class ExceptionExample2 {

	public static void main(String[] args) {
		System.out.println("処理開始");
		
		try {
			//ここに例外が発生する可能性のあるコード記入
			System.out.println("割り算開始");
			int a = divide(10, 0);
			System.out.println(a);
			
		} catch (ArithmeticException e) {
			// ArithmeticExceptionが発生した場合の処理
			System.out.println("ArithmeticException caught:" + e.getMessage());
		}finally {
			//例外の有無に関わらず、実行されるコード記入
			System.out.println("割り算終了");
		}
		
		System.out.println("処理終了");
	}
	public static int divide(int a , int b)throws ArithmeticException {
		if (b == 0) {
			//0での除算を試みた場合、ArithmeticExceptionを投げる
			throw new ArithmeticException("ゼロ除算エラーです");
	}
      return a / b;
	}

}
