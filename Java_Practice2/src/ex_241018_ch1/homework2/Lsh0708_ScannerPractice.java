package ex_241018_ch1.homework2;

import java.util.Scanner;

public class Lsh0708_ScannerPractice {

	public static void main(String[] args) {
		System.out.println("-------------회원가입 폼 작성------------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ID : ");		
		String userId = scanner.next();
		System.out.println("패스워드 : ");		
		String userPass = scanner.next();
		System.out.println("패스워드 확인 : ");		
		String userPass2 = scanner.next();
		System.out.println("주소 : ");		
		String userAdress = scanner.next();
		System.out.println("전화번호 : ");		
		String userTel = scanner.next();
		System.out.println("먹고 싶은 메뉴 : ");		
		String userMenu = scanner.next();
		
		
		System.out.println("------------------------------------");

		System.out.println("ID : " + userId);
		System.out.println("패스워드 : " + userPass);
		System.out.println("패스워드 확인 : " + userPass2);
		System.out.println("주소 : " + userAdress);
		System.out.println("전화번호 : " + userTel);
		System.out.println("먹고 싶은 메뉴 : " + userMenu);
		
		scanner.close();
	}

}
