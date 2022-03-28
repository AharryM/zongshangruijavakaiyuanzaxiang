/**
 * 测试基本数据类型的转换（自动转换、强制转换）
*/
public class TestTypeConvert {
	
	public static void main(String[] args) {
		//自动类型转换：表数范围小的可以自动转换为表数范围大的
		long  a1 = 3456;
		float a2 = a1;
		System.out.println(a2);
		//整型常量直接赋值给byte/short/char等类型，只要不超过表数范围，则可以自动转换
		byte b1 = 121;	//合法
		//byte b2 = 200;  //byte：[-128,127]，200超过byte的表数范围，则不合法
		
		//算术运算符，两个操作数都是整型：有一个是long，则结果为long。否则结果int（即使byte，结果也是int）
		long c1 = 1234;
		int  c2 = 123;
		long c3 = c1+c2;
		
		//算术运算符，有一个操作数是double，则结果是double
		double d1 = 3.14;
		int  d2 = 3;
		double d3 = d1+d2;
		
		//强制类型转换
		double m1 = 3.98;
		int m2 = (int)m1;
		System.out.println(m2);
		
		char m3 = 'c';
		int  m4 = m3+2;
		char m5 = (char)m4;
		System.out.println(m5);
		
		//当将一种类型强制转换成另一种类型，而又超出了目标类型的表数范围，就会被截断成一个完全不同的值。
		int n1 = 300;
		byte n2 = (byte)n1;
		System.out.println(n2);
		
		
		//溢出错误：操作比较大的数，要留意是否溢出。
		int salary = 1000000000;  //10亿
		int years = 30;
		int total01 = salary*years; 
		long total02 = 1L*salary*years;
		
		
		System.out.println(total01);
		System.out.println(total02);
		
		
		
	}
}