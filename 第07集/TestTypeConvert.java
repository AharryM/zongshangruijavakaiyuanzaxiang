/**
 * ���Ի����������͵�ת�����Զ�ת����ǿ��ת����
*/
public class TestTypeConvert {
	
	public static void main(String[] args) {
		//�Զ�����ת����������ΧС�Ŀ����Զ�ת��Ϊ������Χ���
		long  a1 = 3456;
		float a2 = a1;
		System.out.println(a2);
		//���ͳ���ֱ�Ӹ�ֵ��byte/short/char�����ͣ�ֻҪ������������Χ��������Զ�ת��
		byte b1 = 121;	//�Ϸ�
		//byte b2 = 200;  //byte��[-128,127]��200����byte�ı�����Χ���򲻺Ϸ�
		
		//����������������������������ͣ���һ����long������Ϊlong��������int����ʹbyte�����Ҳ��int��
		long c1 = 1234;
		int  c2 = 123;
		long c3 = c1+c2;
		
		//�������������һ����������double��������double
		double d1 = 3.14;
		int  d2 = 3;
		double d3 = d1+d2;
		
		//ǿ������ת��
		double m1 = 3.98;
		int m2 = (int)m1;
		System.out.println(m2);
		
		char m3 = 'c';
		int  m4 = m3+2;
		char m5 = (char)m4;
		System.out.println(m5);
		
		//����һ������ǿ��ת������һ�����ͣ����ֳ�����Ŀ�����͵ı�����Χ���ͻᱻ�ضϳ�һ����ȫ��ͬ��ֵ��
		int n1 = 300;
		byte n2 = (byte)n1;
		System.out.println(n2);
		
		
		//������󣺲����Ƚϴ������Ҫ�����Ƿ������
		int salary = 1000000000;  //10��
		int years = 30;
		int total01 = salary*years; 
		long total02 = 1L*salary*years;
		
		
		System.out.println(total01);
		System.out.println(total02);
		
		
		
	}
}