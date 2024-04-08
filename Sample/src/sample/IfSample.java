package sample;

import java.sql.SQLClientInfoException;

public class IfSample {

	public static void main(String[] args) {
		var score = 50; //成績
		
		if (score == 100) {
		System.out.println("満点です！");
		}else if (score >=90) {
		System.out.println("よくできました！");
		}else if (score >= 30) {
		System.out.println("合格です！");
		}else {
		System.out.println("赤点です。。。");
		}

	}

}
