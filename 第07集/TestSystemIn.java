/**
 * 测试键盘输入
*/

import java.util.Scanner;

public class TestSystemIn {
	
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("请输入您的账户名：");
		String username = scanner.nextLine();
		System.out.println("请输入年龄：");
		int age = scanner.nextInt();
		System.out.println("请输入月薪：");
		double salary = scanner.nextDouble();
		System.out.println("=======录入的信息如下=========");
		System.out.println("账户名："+username);
		System.out.println("年龄："+age);
		System.out.println("年薪："+(salary*12));
		
		
		
		
	}
}