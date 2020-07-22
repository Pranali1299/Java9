class AirthmeticOp {

	static int a= 15, b=20;
	int x=4, y=5;
	static void dispStatic(){
	
		System.out.println(a+" + "+b+" = "+a+b);
	}
	void display() {

		System.out.println(x+" * "+y+" = "+x*y);
	}
}
class LogicalOp {

	static int a = 10, b = 20;
	int x = 5, y=10;

	static  void dispStatic(){

		System.out.println((a<b)&&(a!=b));
	
	}
	void display() {

		System.out.println((x>y)||(x==y));
	
	}

}
class BitwiseOp {

	static int a = 20;
	int b = -30;

	static void dispStatic(){

		System.out.println(a+"<<"+2+" = "+(a<<2));
		System.out.println(a+">>"+2+" = "+(a>>2));
        }

        void display() {

		System.out.println(b+">>"+3+" = "+(b>>3));
		System.out.println(b+"<<"+3+" = "+(b<<3));

        }

}
class Operator {

	public static void main(String[] args) {
	
	AirthmeticOp a = new AirthmeticOp();
	a.dispStatic();
	a.display();

	LogicalOp l = new LogicalOp();
	l.dispStatic();
	l.display();

	BitwiseOp b = new BitwiseOp();
	b.dispStatic();
	b.display();
	}
}

