public class TestIntDouble {
	
	public static void main(String[] args) {
		
		byte age = 18;
		short salary = 25000;
		int  salary2 = 50000;
		int  beijingPopulation = 30000000;
		long  globalPopulation = 7000000000L;	//���ͳ���Ĭ�ϵ�������int. �ĳ�long������Ҫ����ӣ�L/l
		//byte age2 = 140;		//���ͳ�������byte�ı�����Χ�������Զ�תΪbyte������ר�Ž��Զ���ǿ��ת�͡�
		
		//���ڽ���
		int  t1 = 65;		//ʮ����
		int  t2 = 065;		//�˽���
		int  t3 = 0x65;		//ʮ������
		int  t4 = 0b01000001;	//������
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		
		//���Ը�����
		double d1 = 3.14;
		float  f1 = 3.14F;		//���㳣��Ĭ����double���ĳ�float����Ҫ����ӣ�F/f
		
		double d2 = 314E-2;		//��ѧ��������314*10^(-2)
		
		System.out.println(d2);
		
		//�������ǲ���ȷ�ģ����ڱȽ�ҪС�ġ�
		//���Ҫʹ�þ�ȷ�����㣬ʹ��BigDecimal�ࣨ�ȼ�ס���֣�
		float  f3 = 0.1F;
		double d3 = 0.1;
		System.out.println(f3);
		System.out.println(d3);
		System.out.println(f3==d3);
		
		
	}
	
}