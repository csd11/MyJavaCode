class SON{

	public static void main(String args()){
	
		int sum = 0;
		int mul = 1;
		
		for(int num=3; num<=100; num++){
			
			sum = sum + num;
			mul = mul * num;
		}
		
		System.out.println("Sum of numbers = " + sum);
		System.out.println("Mul of numbers = " + mul);
	}	
}
