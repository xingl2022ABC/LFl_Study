package New_Test;

public class StringBufferCapacityTest {

	public static void main(String[] args) {
		//StringBuffer�ĵĳ�ʼ��СΪ��16+��ʼ�ַ������ȣ���capacity=16+��ʼ�ַ�������
		//length ʵ�ʳ���  capacity �洢�ռ��С
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1 length: " + sb1.length());
		System.out.println("sb1 capacity: " + sb1.capacity());
		System.out.println("=====================");
		
		StringBuffer sb2 = new StringBuffer("123");
		sb2.append("456");
		System.out.println("sb2 length: " + sb2.length());
		System.out.println("sb2 capacity: " + sb2.capacity());
		System.out.println("=====================");
		
		sb2.append("7890123456789");
		System.out.println("sb2 length: " + sb2.length());
		System.out.println("sb2 capacity: " + sb2.capacity());
		System.out.println("=====================");
		
		sb2.append("0");
		System.out.println("sb2 length: " + sb2.length());
		System.out.println("sb2 capacity: " + sb2.capacity());
		//һ��length����capacityʱ��capacity����ǰһ�εĻ����ϼ�1�󷭱���
		System.out.println("=====================");
		
		//��ǰsb2length 20   capacity 40�� ��append 70���ַ� ����(��1��2������)
		sb2.append("1234567890123456789012345678901234567890123456789012345678901234567890");
		System.out.println("sb2 length: " + sb2.length());
		System.out.println("sb2 capacity: " + sb2.capacity());
		//���append�Ķ���ܳ�������(��1��2������)���������µĳ��ȸ���
		
		System.out.println("=====================");
		sb2.append("0");
		System.out.println("sb2 length: " + sb2.length());
		System.out.println("sb2 capacity: " + sb2.capacity());
		sb2.trimToSize();
		System.out.println("=====after trime================");
		System.out.println("sb2 length: " + sb2.length());
		System.out.println("sb2 capacity: " + sb2.capacity());
	}

}
