
public class primenumber {
static void prime(int a) {
		
		if(a==1||a==2) {
			System.out.println(a+" the number is prime");
		}
		else if(a%2==1) {
			System.out.println(a+" The number is prime");
		}else
		{
			System.out.println(a+" the number is not prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

prime(4);
prime(3);
prime(5);
prime(2);
prime(1);
	}

}


