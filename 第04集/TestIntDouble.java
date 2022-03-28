public class TestIntDouble {
	
	public static void main(String[] args) {
		
		byte age = 18;
		short salary = 25000;
		int  salary2 = 50000;
		int  beijingPopulation = 30000000;
		long  globalPopulation = 7000000000L;	//整型常量默认的类型是int. 改成long类型需要后面加：L/l
		//byte age2 = 140;		//整型常量超过byte的表数范围，则不能自动转为byte。后面专门讲自动和强制转型。
		
		//关于进制
		int  t1 = 65;		//十进制
		int  t2 = 065;		//八进制
		int  t3 = 0x65;		//十六进制
		int  t4 = 0b01000001;	//二进制
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		
		//测试浮点数
		double d1 = 3.14;
		float  f1 = 3.14F;		//浮点常量默认是double。改成float，需要后面加：F/f
		
		double d2 = 314E-2;		//科学计数法：314*10^(-2)
		
		System.out.println(d2);
		
		//浮点数是不精确的，用于比较要小心。
		//如果要使用精确的运算，使用BigDecimal类（先记住名字）
		float  f3 = 0.1F;
		double d3 = 0.1;
		System.out.println(f3);
		System.out.println(d3);
		System.out.println(f3==d3);
		
		
	}
	
}