package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;
public class ex02_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Scanner scn = new Scanner(System.in);
		System.out.println("請輸入公斤:");
		int a = scn.nextInt();
		double b = a*(1/0.45359);
		System.out.println("轉換成磅是:"+ b );

	}

}
