package tasks;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 Section1 s1 = new Section1();
		 Section2 s2 = new Section2();
		 
		 while (true) {
			 //
			 System.out.println("Ââåäèòå íîìåğ çàäà÷è (1-60, 0 - âûõîä): ");
				int task = scanner.nextInt();
				if(task == 0) break;
				if(task > 0 && task < 61) {
					switch (task) {
					case 1:
						System.out.println("Ââåäèòå ÷èñëî è äåëèòåëü:");
						 double a = scanner.nextDouble();
						 double b = scanner.nextDouble();
						 s1.remainder(a, b);
						 break;
					case 2:
						System.out.println("Ââåäèòå äëèíó îñíîâàíèÿ:");
						 double a2 = scanner.nextDouble();
						 System.out.println("Ââåäèòå äëèíó âûñîòû:");
						 double h = scanner.nextDouble();
						 s1.triArea(a2, h);
						 break;
					case 3:
						 System.out.println("Ââåäèòå êîë-âî öûïëÿò:");
						 int chickens = scanner.nextInt();  
						 System.out.println("Ââåäèòå êîë-âî êîğîâ:");
						 int cows = scanner.nextInt();
						 System.out.println("Ââåäèòå êîë-âî ñâèíåé:");
						 int pigs = scanner.nextInt();
						 s1.animals(chickens, cows, pigs);
						 break;
					case 4:
						System.out.println("Ââåäèòå çíà÷åíèÿ prob, prize, pay:");
						 double prob = scanner.nextDouble();
						 double prize = scanner.nextDouble();
						 double pay = scanner.nextDouble();
						 boolean result = s1.profitableGamble(prob, prize, pay);
						 System.out.println(result);
						 break;
					case 5:
						System.out.println("Ââåäèòå çíà÷åíèÿ N, a, b:");
						 int N = scanner.nextInt();
						 int a5 = scanner.nextInt();
						 int b5 = scanner.nextInt();
						 s1.operation(N, a5, b5);
						 break;
					case 6:
						 System.out.println("Ââåäèòå ñèìâîë:");
						 char character = scanner.next().charAt(0);
						 s1.ctoa(character);
						 break;
					case 7:
						 System.out.println("Ââåäèòå ÷èñëî:");
						 int n = scanner.nextInt();
						 s1.addUpTo(n);
						 break;
					case 8:
						 System.out.println("Ââåäèòå äëèíû äâóõ ñòîğîí òğåóãîëüíèêà:");
						 int a8 = scanner.nextInt();
						 int b8 = scanner.nextInt();
						 s1.nextEdge(a8, b8);
						 break;
					case 9:
						 System.out.println("Ââåäèòå êîë-âî çíà÷åíèé â ìàññèâå:");
						 int n9 = scanner.nextInt();
						 
						 if(n9 < 0) break;
						 else if(n9 == 0) System.out.println(0);
						 else {
							double[] a9 = new double[n9];  
							for(int i = 0; i < n9; i++) {
								System.out.println("Ââåäèòå "+ i +" çíà÷åíèe:");
								a9[i] = scanner.nextDouble();
							}
							s1.sumOfCubes(a9);
							break;
						 }
					case 10:
						 System.out.println("Ââåäèòå íà÷åíèÿ a, b, c:");
						 double a10 = scanner.nextDouble();
						 double b10 = scanner.nextDouble();
						 double c10 = scanner.nextDouble();
						 boolean result10 = s1.abcmath(a10, b10, c10);
						 System.out.println(result10);
						 break;
					case 11:
						 System.out.println("Ââåäèòå ñòğîêó: ");
						 scanner.nextLine();
						 String s21 = scanner.nextLine();						 
						 System.out.println("Ââåäèòå êîë-âî ïîâòîğåíèé ñèìâîëîâ: ");
						 int number = scanner.nextInt();
						 s2.repeat(s21, number);
						 break;
					case 12:
						 System.out.println("Ââåäèòå êîë-âî çíà÷åíèé â ìàññèâå:");
						 int n22 = scanner.nextInt();
						 double[] a22;
						 if(n22 < 0) break;
						 else if(n22 == 0) System.out.println(0);
						 else {
							a22 = new double[n22];  
							for(int i = 0; i < n22; i++) {
								System.out.println("Ââåäèòå "+ i +" çíà÷åíèe:");
								a22[i] = scanner.nextDouble();
							}
						 s2.differenceMaxMin(a22);
						 break;
						 }
					case 13:
						System.out.println("Ââåäèòå êîë-âî çíà÷åíèé â ìàññèâå:");
						 int n23 = scanner.nextInt();
						 double[] a23;
						 if(n23 < 0) break;
						 else if(n23 == 0) System.out.println(0);
						 else {
							a23 = new double[n23];  
							for(int i = 0; i < n23; i++) {
								System.out.println("Ââåäèòå "+ i +" çíà÷åíèe:");
								a23[i] = scanner.nextDouble();
							}
						 boolean result23 = s2.isAvgWhole(a23);
						 System.out.println(result23);
						 break;
						 }
						 break;
					case 14:
						System.out.println("Ââåäèòå êîë-âî çíà÷åíèé â ìàññèâå:");
						 int n24 = scanner.nextInt();
						 int[] a24;
						 if(n24 < 0) break;
						 else if(n24 == 0) System.out.println(0);
						 else {
							a24 = new int[n24];  
							for(int i = 0; i < n24; i++) {
								System.out.println("Ââåäèòå "+ i +" çíà÷åíèe:");
								a24[i] = scanner.nextInt();
							}
						  s2.cumulativeSum(a24);
						  break;
						 }
						 break;
					case 15:
						System.out.println("Ââåäèòå ÷èñëî:");
						scanner.nextLine();
						String s25 = scanner.nextLine();
						s2.getDecimalPlaces(s25);
						break;
					case 16:
						System.out.println("Ââåäèòå æåëàåìîå ÷èñëî Ôèáîíà÷÷è:");
						int n16 = scanner.nextInt();
						System.out.println(n16+" ÷èñëî Ôèáîíà÷÷è: " + s2.Fibonacci(n16));
						break;
					case 17:
						System.out.println("Ââåäèòå ïî÷òîâûé èíäåêñ: ");
						scanner.nextLine();
						String zc = scanner.nextLine();
						System.out.println(s2.isValid(zc));
						break;
					case 18:
						System.out.println("Ââåäèòå ïåğâóş ñòğîêó: ");
						scanner.nextLine();
						String s181 = scanner.nextLine();
						System.out.println("Ââåäèòå âòîğóş ñòğîêó: ");
			//			scanner.nextLine();
						String s182 = scanner.nextLine();
						System.out.println(s2.isStrangePair(s181, s182));
						break;
					case 19:
						System.out.println("Ââåäèòå ñòğîêó: ");
						scanner.nextLine();
						String s191 = scanner.nextLine();
						System.out.println("Ââåäèòå ïğåôèêñ/ñóôôèêñ: ");
				//		scanner.nextLine();
						String s192 = scanner.nextLine();
						System.out.println("Ïğåôèêñ: " + s2.isPrefix(s191, s192) + "\n" +
											"Ñóôôèêñ: " + s2.isSuffix(s191, s192));
						break;
					case 20:
						System.out.println("Ââåäèòå êîëè÷åñòâî øàãîâ: ");
						int steps = scanner.nextInt();
						System.out.println(s2.boxSeq(steps));
						break;
					case 21:
					case 22:
					case 23:
					case 24:
					case 25:
					case 26:
					case 27:
					case 28:
					case 29:
					case 30:
					case 31:
					case 32:
					case 33:
					case 34:
					case 35:
					case 36:
					case 37:
					case 38:
					case 39:
					case 40:
					case 41:
					case 42:
					case 43:
					case 44:
					case 45:
					case 46:
					case 47:
					case 48:
					case 49:
					case 50:
					case 51:
					case 52:
					case 53:
					case 54:
					case 55:
					case 56:
					case 57:
					case 58:
					case 59:
					case 60:	
					}
				}
				else break;
			//	
			
   }
  }
}
