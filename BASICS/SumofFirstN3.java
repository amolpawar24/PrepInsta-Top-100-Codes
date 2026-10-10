class SumofFirstN3
{
	public static void main(String[] args) 
	{
		int num = 10;
		int sum = getSum(num);
		
		System.out.println("Sum is : "+ sum);
	}
	
	public static int getSum(int n)
	{
		if (n == 0)
		{
			return n;
		}
		
		return n + getSum(n - 1);
	}
}
