/**
 * ���Լ�������
*/

import java.util.Scanner;

public class TestSystemIn {
	
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("�����������˻�����");
		String username = scanner.nextLine();
		System.out.println("���������䣺");
		int age = scanner.nextInt();
		System.out.println("��������н��");
		double salary = scanner.nextDouble();
		System.out.println("=======¼�����Ϣ����=========");
		System.out.println("�˻�����"+username);
		System.out.println("���䣺"+age);
		System.out.println("��н��"+(salary*12));
		
		
		
		
	}
}