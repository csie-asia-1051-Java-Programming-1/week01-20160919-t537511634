package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;
public class ex01_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner scn = new Scanner(System.in);
		System.out.println("請輸入攝氏溫度:");
		int a = scn.nextInt();
		int b = (a-32)*5/9;
		System.out.println("轉換成華氏溫度是:"+ b );
		
		
	}

}
