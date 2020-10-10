package tasks;

import java.util.ArrayList;

public class Section3 {
	//task 1
	public int solutions(double a, double b, double c) {
		int solutionsQuantity;
		double D = b*b - 4*a*c;
		if(D > 0) solutionsQuantity = 2;
		else if(D == 0) solutionsQuantity = 1;
		else solutionsQuantity = 0;
		return solutionsQuantity;
	}
	//task 2
	public int findZip(String s1) {
		int position = 0;
		if(s1.contains("zip")) {
			int count = 0;
			for(int i = 0; i < s1.length(); i ++) {
				if(s1.charAt(i) == 'z' 
				  && s1.charAt(i+1) == 'i'
				  && s1.charAt(i+2) == 'p') {
					count += 1;
					if(count == 2) position = i;
				}
			}
			if (count == 1) position = -1;
		}
		else position = -1;
		return position;
	}
	//task 3
	public boolean checkPerfect(int num) {
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) sum += i;
		}
		if(sum == num) return true;
		else return false;
	}
	//task 4
	public String flipEndChars(String s1) {
		String  s2 = "";
		if(s1.length() < 2) s2 = "Incompatible.";
		else if(s1.charAt(0) == s1.charAt(s1.length()-1)) s2 = "Two's a pair.";
		else {
			for(int i = 0; i < s1.length(); i++) {
				if(i == 0) s2 += s1.charAt(s1.length()-1);
				else if(i == s1.length()-1) s2 += s1.charAt(0);
				else s2 += s1.charAt(i);
			}
		}
		return s2;
	}
	//task 5
	public boolean isValidHexCode(String s1) {
		ArrayList<Character> l = new ArrayList<Character>();
		l.add('0'); l.add('1'); l.add('2'); l.add('3'); l.add('4'); l.add('5'); l.add('6'); l.add('7'); l.add('8'); l.add('9');
		l.add('a'); l.add('b'); l.add('c'); l.add('d'); l.add('e'); l.add('f');
		l.add('A'); l.add('B'); l.add('C'); l.add('D'); l.add('E'); l.add('F');
		
		if(s1.charAt(0) != '#' || s1.length() != 7) return false;
		else {
			for(int i = 1; i < s1.length(); i++) 
				if(!l.contains(s1.charAt(i))) return false;
		}
		
		return true;
	}
	//task 6
	public boolean same(int []a1, int[] a2) {
		int u1 = 0, u2 = 0;
		//a1
		for (int i = 0; i < a1.length - 1; i++)
		{
			boolean unique = true;
			for (int j = i + 1; j < a1.length; j++)
			{
				if (a1[i] == a1[j]) unique = false;
			}
			if(unique) u1 += 1;
		} 
		//a2
		for (int i = 0; i < a2.length - 1; i++)
		{
			boolean unique = true;
			for (int j = i + 1; j < a2.length; j++)
			{
				if (a2[i] == a2[j]) unique = false;
			}	
			if(unique) u2 += 1;
		}
		//result
		System.out.println(u1 + " " + u2);
		if(u1 == u2) return true;
		else return false;
	}
	//task 7
	public static boolean isKaprekar(int n)
	{
		String square = Integer.toString(n * n);
		String first = square.substring(0, square.length() / 2);
		String last = square.substring(square.length() / 2, square.length());
		int a = first.equals("") ? 0 : Integer.parseInt(first);
		int b = last.equals("") ? 0 : Integer.parseInt(last);
		return a + b == n;
	}
	//task 8
	public String longestZero(String s1) {
		int current = 0;
		int longest = 0;
		String result = "";
		boolean z = true;
		
		for(int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) == '0') {
				current += 1;
				z = true;
				//if(current.length() > longest.length()) longest = current;
			}
			else if (z == true)
			{
				if (current > longest) longest = current;
				z = false;
				current = 0;
			}
		}
		for(int i = 0;i < longest;i++)
			result += "0";
		return result;
	}
	//task 9
	public boolean primeNumber(int num) {
		boolean nonPrime = false;
		for(int i = 2; i < num/2; i++) {
			if(num % i == 0)
            {
                nonPrime = true;
                break;
            }
		}
		if(!nonPrime) return true;
		else return false;
	}
	
	public int nextPrime(int num) {
		int newNum = 0;
		if(primeNumber(num)) 
			return num;
		else {
			newNum = num;
			while(!primeNumber(newNum)) {
				newNum++;
				if(primeNumber(newNum)) break;
			}
		}
		return newNum;
	}
	//task 10
	public boolean rightTriangle(double a, double b, double c) {
		if( (a*a == b*b+c*c) ||
			(b*b == a*a+c*c) ||
			(c*c == a*a+b*b)) return true;
		else return false;
	}
}
