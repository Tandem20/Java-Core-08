package Tandem20;

import java.util.Scanner;

public class Application {
	static void menu() {
		System.out.println("Натисніть 1 , щоб перевірити чи є такий місяць");
		System.out.println("Натисніть 2 , щоб вивести всі місяці з такою ж порою року");
		System.out.println("Натисніть 3 , щоб вивести всі місяці , які мають таку саму кількість днів");
		System.out.println("Натисніть 4 , щоб вивести місяці, які мають меншу кількість днів");
		System.out.println("Натисніть 5 , щоб вивести Місяці, які мають більшу кількість днів");
		System.out.println("Натисніть 6 , щоб вивести на екран наступну пору року");
		System.out.println("Натисніть 7 , щоб вивести на екран попередню пору року");
		System.out.println("Натисніть 8 , щоб вивести на екран всі місяці, які мають парну кількість днів");
		System.out.println("Натисніть 9 , щоб вивести на екран всі місяці, які мають непарну кількість днів");
		System.out.println("Натисніть 10, щоб вивести на екран чи введений з консолі місяць має парну кількість днів");

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
		
	System.out.println("ВВедіть місяць");
	sc = new Scanner(System.in);
	String months1 = sc.next().toUpperCase();
	
	boolean flag1 = false;

	for(Months m : monthsArr) {
		if(m.name().equalsIgnoreCase(months1)) {
			System.out.println("Місяць існує");
			flag1 = true;
			}
	}
		
				if(!flag1) {
					System.out.println("Місяць не існує");
				}
	
				break;
	
	}
	case "2" : {
			
	System.out.println("ВВедіть пору року");
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
					System.out.println("Місяць не існує");
				}
	
				break;
	
	}

	case "3"  : {
	System.out.println("ВВедіть кількість днів місяця");
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
					System.out.println("Місяця з такою кількістю днів не існує");
				}
	
				break;
	}
	case "4"  : {
	System.out.println("ВВедіть кількість днів місяця");
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
					System.out.println("Місяці, які мають меншу кількість днів");
				}
	
				break;

	}
	case "5"  : {
	System.out.println("ВВедіть кількість днів місяця");
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
					System.out.println("Місяці, які мають більшу кількість днів");
				}
	
				break;
			}
	case "6" : {
		
	System.out.println("ВВедіть пору року");
	sc = new Scanner(System.in);
	String nsezon = sc.next().toUpperCase();
	boolean flag1 = false;
for(Sezon s : sezonArr) {
		if (s.name().equals(nsezon)) {
			System.out.println("Наступний сезон  " + s);
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
					System.out.println("Пори року не існує");
				}
	
				break;
	
	}
	case "7" : {
		
	System.out.println("ВВедіть пору року");
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
					System.out.println("Пори року не існує");
				}
	
				break;
	
	}
	case "8"  : {
		System.out.println("ВВедіть кількість днів місяця");
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
						System.out.println("Місяці, які не мають парну кількість днів");
					}
		
					break;
				}
	case "9"  : {
		System.out.println("ВВедіть кількість днів місяця");
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
						System.out.println("Місяці, які не мають непарну кількість днів");
					}
		
					break;
				}
	case "10"  : {
		System.out.println("ВВедіть місяць");
		sc = new Scanner(System.in);
		String mont =sc.next().toUpperCase();
		boolean flag1 = false;
		
		for(Months m : monthsArr) {
			if(m.name().equals(mont))
			if(( m.getIndays() %2 == 0   )) { 
				System.out.println("Місяць має парну кількість днів");
				flag1 = true;
				}
			}
					if(!flag1) {
						System.out.println("Місяці, які не мають парну кількість днів");
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
