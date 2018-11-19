public class MyInteger {
	//step 1
	int value;
	//step2
	MyInteger(int value) {
			this.value = value;
	}
	//step 3
	public int getValue(){
		return value;
	}
	//step4
	public boolean isEven(){
		return isEven(value);
	}
	public boolean isOdd() {
		return isOdd(value);
	}
	public boolean isPrime(){
		return isPrime(value);
	}
	//step 5
	public static boolean isEven(int value){
		if(value % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(int value){
		if(value % 2 != 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isPrime(int value){
		for (int divisor = 2; divisor <= value / 2; divisor++){
			if (value % divisor == 0){
				return false;
			}
		}
		return true;
	}
	
	//step 6
	public static boolean isEven(MyInteger myInteger){
		return myInteger.isEven();
	}
	public static boolean isOdd(MyInteger myInteger){
		return myInteger.isOdd();
	}
	public static boolean isPrime(MyInteger myInteger){
		return myInteger.isPrime();
	}
	//step 7
	public boolean equals(int value){
		return this.value == value;
	}
	public boolean equals(MyInteger myInteger){
		return myInteger.value == this.value;
	}
	//step 8
	public static int parseInt(char[] chars) {
		int value = 0;
		for (int i = 0, j = (int)Math.pow(10, chars.length - 1); 
			  i < chars.length; i++, j /= 10) {
			value += (chars[i]- 48) * j;
		}
		return value;
	}

	//step 9
	public static int parseInt(String str) {
		int value = 0;
		for (int i = 0, j = (int)Math.pow(10, str.length() - 1); 
			  i < str.length(); i++, j /= 10) {
			value += (str.charAt(i) - 48) * j;
		}
		return value;
	}
}