package tasks;
//task 1 
public class Section2 {
	public void repeat(String s1, int n) {
		String s2 = "";
		for(int i = 0; i < s1.length(); i++) 
			for(int j = 0; j < n; j++)
				s2 += s1.charAt(i);
		System.out.println(s2);
	}
//task 2
	public void differenceMaxMin(double[] a) {
		double min = 1000000, max = -1000000;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) max = a[i];
			else if(a[i] < min) min = a[i];
		}
		System.out.println(max-min);
	}
//task 3
	public boolean isAvgWhole(double[] a) {
		double avg = 0;
		for(int i = 0; i < a.length; i++)
			avg += a[i];
		avg = avg/a.length;
		if(avg % 2 == 0) return true;
		else return false;
	}
//task 4 
	public void cumulativeSum(int[] a) {
		int[] b = new int[a.length];
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
			b[i] = sum;
		}
		for(int i = 0; i < a.length; i++)
			System.out.print(b[i]+" ");
	}
//task 5
	public void getDecimalPlaces(String s) {
		int n = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='.') n = s.length()-i-1; 
		}
		System.out.println(n);
	}
//task 6
	public int Fibonacci(int num) {
		int a = 1;
		int b = 1;
		for (int i = 2; i <= num; i++)
		{
			int sum = a + b;
			a = b;
			b = sum;
		}
		return b;
	}
//task 7
	public boolean isValid(String zipCode) {
		if(zipCode.length() != 5) return false;
		else if(zipCode.contains(" ")) return false;
		for(int i = 0; i < zipCode.length(); i ++)
			if (!Character.isDigit(zipCode.charAt(i))) return false;
		return true;	
	}
//task 8
	public boolean isStrangePair(String s1, String s2) {
		int m = s1.length() - 1;
		int n = s2.length() - 1;
		if(s1.charAt(0) == s2.charAt(n) && s2.charAt(0) == s1.charAt(m)) return true;
		else return false;
	}
//task 9
	public boolean isPrefix(String word, String prefix) {
		if(word.startsWith(prefix.substring(0,prefix.length()-2))) return true;
		else return false;
	}
	public boolean isSuffix(String word, String suffix) {
		if(word.startsWith(suffix.substring(1,suffix.length()-1))) return true;
		else return false;
	}
//task 10	
	public int boxSeq(int num) {
		int a = 0;
		if(num == 0) return a;
		else {
			for(int i = 1; i <= num; i++) {
				if(i%2 == 0) a -= 1;
				else a += 3;
			}	
		}
		return a;
	}
}
