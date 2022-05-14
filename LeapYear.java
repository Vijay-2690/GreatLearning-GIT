class LeapYear{
	public static void main(String[]args){
	int year = 1200;
if (year%400 == 0) {
System.out.println("Leap Year");
	}else if (year%400 != 0 && year%100 == 0){
	System.out.println("Not a leap year");
	} else if (year%4 == 0 && year%100 != 0){
	System.out.println("Leap Year");
	}else {
	System.out.println("Not a leap year");
		}
	}
}