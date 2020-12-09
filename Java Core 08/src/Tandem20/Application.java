package Tandem20;

import java.util.Scanner;

public class Application {
	static void menu() {
		System.out.println("�������� 1 , ��� ��������� �� � ����� �����");
		System.out.println("�������� 2 , ��� ������� �� ����� � ����� � ����� ����");
		System.out.println("�������� 3 , ��� ������� �� ����� , �� ����� ���� ���� ������� ���");
		System.out.println("�������� 4 , ��� ������� �����, �� ����� ����� ������� ���");
		System.out.println("�������� 5 , ��� ������� ̳����, �� ����� ����� ������� ���");
		System.out.println("�������� 6 , ��� ������� �� ����� �������� ���� ����");
		System.out.println("�������� 7 , ��� ������� �� ����� ��������� ���� ����");
		System.out.println("�������� 8 , ��� ������� �� ����� �� �����, �� ����� ����� ������� ���");
		System.out.println("�������� 9 , ��� ������� �� ����� �� �����, �� ����� ������� ������� ���");
		System.out.println("�������� 10, ��� ������� �� ����� �� �������� � ������ ����� �� ����� ������� ���");

	 }

public static void main(String[] args) {
		
	
	

	Months[] monthsArr = Months.values();
	Sezon[]sezonArr = Sezon.values();
	Scanner sc = new Scanner(System.in) ;
 
			
	while (true) {
	menu();

	boolean flag = false;
	switch (sc.next()) {
	
	case "1" : {
		
	System.out.println("������ �����");
	sc = new Scanner(System.in);
	String months1 = sc.next().toUpperCase();
	
	boolean flag1 = false;

	for(Months m : monthsArr) {
		if(m.name().equalsIgnoreCase(months1)) {
			System.out.println("̳���� ����");
			flag1 = true;
			}
	}
		
				if(!flag1) {
					System.out.println("̳���� �� ����");
				}
	
				break;
	
	}
	case "2" : {
			
	System.out.println("������ ���� ����");
	sc = new Scanner(System.in);
	String sezon = sc.next().toUpperCase();
boolean flag1 = false;

	for(Months m : monthsArr) {
		if(m.getSezon().name().equalsIgnoreCase(sezon)) {
			System.out.println(m);
			flag1 = true;
			}
	}
		
				if(!flag1) {
					System.out.println("̳���� �� ����");
				}
	
				break;
	
	}

	case "3"  : {
	System.out.println("������ ������� ��� �����");
	sc = new Scanner(System.in);
	int mon = sc.nextInt();
boolean flag1 = false;
	
	for(Months m : monthsArr) {
		if(( m.getIndays() ==   mon )) { 
			System.out.println(m);
			flag1 = true;
			}
	}
				if(!flag1) {
					System.out.println("̳���� � ����� ������� ��� �� ����");
				}
	
				break;
	}
	case "4"  : {
	System.out.println("������ ������� ��� �����");
	sc = new Scanner(System.in);
	int mon = sc.nextInt();
boolean flag1 = false;
	
	for(Months m : monthsArr) {
		if(( m.getIndays() <  mon )) { 
			System.out.println(m);
			flag1 = true;
			}
	}
				if(!flag1) {
					System.out.println("̳����, �� ����� ����� ������� ���");
				}
	
				break;

	}
	case "5"  : {
	System.out.println("������ ������� ��� �����");
	sc = new Scanner(System.in);
	int mon = sc.nextInt();
	boolean flag1 = false;
	
	for(Months m : monthsArr) {
		if(( m.getIndays() >   mon )) { 
			System.out.println(m);
			flag1 = true;
			}
		}
				if(!flag1) {
					System.out.println("̳����, �� ����� ����� ������� ���");
				}
	
				break;
			}
	case "6" : {
		
	System.out.println("������ ���� ����");
	sc = new Scanner(System.in);
	String nsezon = sc.next().toUpperCase();
	boolean flag1 = false;
for(Sezon s : sezonArr) {
		if (s.name().equals(nsezon)) {
			System.out.println("��������� �����  " + s);
		flag = true;
			}
	}
if(flag1) {
	Sezon sezon1 = Sezon.valueOf(nsezon);
	int ordinal =  sezon1.ordinal();

	
	if(ordinal == (sezonArr.length-1)) {
		ordinal = 0;
		System.out.println(sezonArr[ordinal]);
}else {
	System.out.println(sezonArr[ordinal+1]);
	}
}
		
				if(!flag1) {
					System.out.println("���� ���� �� ����");
				}
	
				break;
	
	}
	case "7" : {
		
	System.out.println("������ ���� ����");
	sc = new Scanner(System.in);
	String nsezon = sc.next().toUpperCase();
	boolean flag1 = false;
for(Sezon s : sezonArr) {
		if (s.name().equals(nsezon)) {
		flag = true;
			}
	}
if(flag1) {
	Sezon sezon1 = Sezon.valueOf(nsezon);
	int ordinal =  sezon1.ordinal();

	
	if(ordinal == (sezonArr.length-1)) {
		ordinal = 0;
		System.out.println(sezonArr[ordinal]);
}else {
	System.out.println(sezonArr[ordinal-1]);
	}
}
		
				if(!flag1) {
					System.out.println("���� ���� �� ����");
				}
	
				break;
	
	}
	case "8"  : {
		System.out.println("������ ������� ��� �����");
		sc = new Scanner(System.in);
		sc.nextInt();
		boolean flag1 = false;
		
		for(Months m : monthsArr) {
			if(( m.getIndays() %2 == 0   )) { 
				System.out.println(m);
				flag1 = true;
				}
			}
					if(!flag1) {
						System.out.println("̳����, �� �� ����� ����� ������� ���");
					}
		
					break;
				}
	case "9"  : {
		System.out.println("������ ������� ��� �����");
		sc = new Scanner(System.in);
		sc.nextInt();
		boolean flag1 = false;
		
		for(Months m : monthsArr) {
			if(( m.getIndays() %2 == 1   )) { 
				System.out.println(m);
				flag1 = true;
				}
			}
					if(!flag1) {
						System.out.println("̳����, �� �� ����� ������� ������� ���");
					}
		
					break;
				}
	case "10"  : {
		System.out.println("������ �����");
		sc = new Scanner(System.in);
		String mont =sc.next().toUpperCase();
		boolean flag1 = false;
		
		for(Months m : monthsArr) {
			if(m.name().equals(mont))
			if(( m.getIndays() %2 == 0   )) { 
				System.out.println("̳���� �� ����� ������� ���");
				flag1 = true;
				}
			}
					if(!flag1) {
						System.out.println("̳����, �� �� ����� ����� ������� ���");
					}
		
					break;
				}
	}
	}	
	}



	

private static boolean isMonthsPresent(Months[] monthsArr, String months1) {
	// TODO Auto-generated method stub
	return false;
}

private static int months() {
	int indays = 0;
	return indays;
	}

}
