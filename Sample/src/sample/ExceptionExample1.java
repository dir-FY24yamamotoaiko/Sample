package sample;

public class ExceptionExample1 {

	public static void main(String[] args) {
		System.out.println("処理開始");
		
		try {
		//ここに例外が発生するコードを記入
		System.out.println("割り算開始");
		int a = 10 / 0;
		System.out.println(a);
		}catch (ArithmeticException e) {
			// ここにArithmeticExceptionが発生した場合の処理を記入
		System.out.println("ArithmeticExceptionが発生" + e.getMessage());
		}finally {
			//例外の有無に関わらず、実行するコード
		System.out.println("割り算終了");
		}
		
		System.out.println("処理終了");

	}

}