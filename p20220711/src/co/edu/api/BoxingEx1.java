package co.edu.api;

public class BoxingEx1 {
	public static void main(String[] args) {
		Integer AAA = new Integer(100);
		Integer BBB = new Integer("200");
		Integer CCC = Integer.valueOf("300");
		
		int AAA1 = AAA.intValue();
		int BBB1 = BBB.intValue();
		int CCC1 = CCC.intValue();
		
		System.out.println(AAA1);
		System.out.println(BBB1);
		System.out.println(CCC1);
		
		System.out.println("==============================");
		
		Integer DDD = 100;
		System.out.println(DDD.intValue());
		
		int value = DDD;
		System.out.println("value: "+value);
		int result = DDD + 100;
		System.out.println("result: "+result);
		
		System.out.println("==============================");
		
		// 포장값은 비교하려면 equal 쓰거나 언박싱해야됨
		// 범위 넘어가버리면 다른값 취급되어버림
		
		System.out.println("<< -128 ~ 127 초과값인 경우 >>");
		Integer ob1 = 300;
		Integer ob2 = 300;
		System.out.println("'==' 결과: "+(ob1==ob2));
		System.out.println("언박싱 후 '==' 결과: "+(ob1.intValue()==ob2.intValue()));
		System.out.println("equals() 결과: "+ob1.equals(ob2));
		System.out.println();
		
		System.out.println("<< -128 ~ 127 범위값인 경우 >>");
		Integer ob3 = 10;
		Integer ob4 = 10;
		System.out.println("'==' 결과: "+(ob3==ob4));
		System.out.println("언박싱 후 '==' 결과: "+(ob3.intValue()==ob4.intValue()));
		System.out.println("equals() 결과: "+ob3.equals(ob4));
		System.out.println();
		
	}
}
