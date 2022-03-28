/**
 *用于测试：标识符规则、变量、注释
 *@author  高淇
 *@version 1.0
*/
public  class  Test01 {

	public  static  void main(String[] args/*参数*/ ) {
		int   age  = 18;
		int   _age  = 19;
		int  $age = 20;
		int  age123 = 21;
		//int  123age =  22;	//数字不能做开头
		//int  age# = 23;	//标识符只能是：字母、数字、下划线、$
		int  年龄 = 24;	//java使用的是unicode字符集。
		int  _class = 25;

		int   monthlySalary = 15000;
		int  annualSalary = monthlySalary*12;
		System.out.println(annualSalary);

		//int, double 
		double  bonus = 3000.1;
		//System.out.println(bonus);
		
/*
	我是多行注释！我是多行注释！
		
*/
	}

}