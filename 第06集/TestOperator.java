public class TestOperator {
	
	public static void main(String[] args) {
		
		System.out.println("=======���������========");
		int  a = 3;
		int  b = 4;
		int  c = (a+b)*4;
		System.out.println(c);
		int  d = 15/4;
		System.out.println(d);
		int  d2 = 5%3;		//����ǣ�����2
		System.out.println(d2);
		
		a = 10;
		//b = a++;		//�ȸ�ֵ��������
		//b = ++a;		//����������ֵ
		b = a--;		//b = --a;
		
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("=======��չ�����========");
		a = 20;
		b = 30;
		a += b;   //a = a+b;
		System.out.println(a);
		System.out.println(b);		
		
		System.out.println("=======��ϵ�����========");
		a = 20;
		b = 30;
		boolean result = a<b;
		System.out.println(result);
		
		System.out.println("=======�߼������========");
		boolean  b1 = true & false;		//false
		boolean  b2 = true | false;     //true
		boolean b3 = !b2;				//false
		boolean b4 = true^true;			//false
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		
		//��·�롢��·��
//		int  w = 3/0;
		boolean  b5 = 3<4 || (4<4/0);
		System.out.println(b5);
		
		System.out.println("=======λ�����========");
		int m = 3;
		int n = 7;
		int p2 = m|n;
		int p1 = m&n; 
		int p3 = m^n;  //^������˼��������ѧ�е�������
		int p4 = ~m;   //��λȡ��
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		
		int  m2 = 3<<3;   //3*2*2*2  24
		int  m3 = 12>>2;  //12/2/2   3
		
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println("=======�ַ������ӷ�========");
		int  r1 = 3;
		int  r2 = 4;
		System.out.println(r1+r2);		//7
		System.out.println("����ǣ�"+r1+r2); 	//����ǣ�34
		
		
		
		System.out.println("=======���������========");
		int  y1 = 300;
		int  y2 = 40;
		int minY = y1<y2?y1:y2;	//���Ƿ���y1��y2�Ƚ�С��ֵ
		
		System.out.println(minY);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}