package New_Test;

public class StringTest {

	public static void main(String[] args) {
		String a = "123;456;789;123 ";
		System.out.println(a.charAt(0)); // ���ص�0��Ԫ��
		System.out.println(a.indexOf(";")); // ���ص�һ��;��λ��
		System.out.println(a.concat(";000")); // ����һ�����ַ��������أ�a����
		System.out.println(a.contains("000")); // �ж�a�Ƿ����000
		System.out.println(a.endsWith("000")); // �ж�a�Ƿ���000��β
		System.out.println(a.equals("000")); // �ж��Ƿ����000
		System.out.println(a.equalsIgnoreCase("000"));// �ж��ں��Դ�Сд������Ƿ����000
		System.out.println(a.length()); // ����a����
		System.out.println(a.trim()); // ����aȥ��ǰ��ո����ַ�����a����
		String[] b = a.split(";"); // ��a�ַ�������;�ָ������
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		System.out.println("===================");

		System.out.println(a.substring(2, 5)); // ��ȡa�ĵ�2������5���ַ� a����
		System.out.println(a.replace("1", "a"));
		System.out.println(a.replaceAll("1", "a")); // replaceAll��һ��������������ʽ

		System.out.println("===================");

		String s1 = "12345?6789";
		String s2 = s1.replace("?", "a");
		String s3 = s1.replaceAll("[?]", "a");
		// �����[?] �ű�ʾ�ַ��ʺţ��������������滻����Ȼ�������л������������ͻᱨ�쳣
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.replaceAll("[\\d]", "a")); //��s1�����������滻Ϊa�������s1��ֵδ�ı䡣

	}
}
