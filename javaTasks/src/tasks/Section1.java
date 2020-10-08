package tasks;

public class Section1 {
	//№1
	public void remainder(double a, double b) {
		System.out.println(a % b);
	}
	//№2
	public void triArea(double a, double h) {
		System.out.println(0.5*a*h);
	}
	//№3
	public void animals(int chickens, int cows, int pigs) {
		System.out.println(chickens*2 + cows*4 + pigs*4);
	}
	//№4
	public boolean profitableGamble(double prob, double prize, double pay) {
		if (prob*prize > pay)  return true ; 
		else return false;
	}
	//№5
	public void operation(int N, int a, int b) {
		if(N - b == a) System.out.println("Сложить");
		else if(N + b == a) System.out.println("Вычесть");
		else if(N / b == a) System.out.println("Умножить");
		else if(N*b == a) System.out.println("Разделить");
		else System.out.println("Ничего");
	}
	//№6
	public void ctoa(char a) {
		int n = a;
		System.out.println(n);
	}
	//№7
	public void addUpTo(int n) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += i+1;
		}
		System.out.println(sum);
	}
	//№8
	public void nextEdge(int a, int b) {
		System.out.println(a+b-1);
	}
	//№9
	public void sumOfCubes(double[] array) {
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += Math.pow(array[i],3);
		}
		System.out.println(sum);
	}
	//№10
	public boolean abcmath(double a, double b, double c) {
		for(int i = 0; i < b; i++) a += a;
		if (a%c == 0) return true;
		else return false;
	}
}
