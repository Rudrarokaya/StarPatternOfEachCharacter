import java.util.*;
import java.util.Scanner;

public class Main {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Enter the word you want to print in star form: ");
		String word = sc.nextLine();
		word = word.toUpperCase();
		System.out.println("Your's desire Word Pattern : ");
		patternWord(word);

	}
	static void printA() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i==1 && j>1 && j<5) || (j==1 && i!=1) || (j==5 && i!=1) || i==3) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printB() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i==1 && j<4) || (i==3 && j<4) || (i==5 && j<4) || (i==2 && j==4) ||
						(i==4 && j==4) || (j==1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printC() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==1 && i!=1 && i!=5) || (i==1 && j>1 && j<4) || (i==5 && j>1 && j<4)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printD() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==1) || (i==1 && j<3) || (j==3 && i>1 && i<5) || (i==5 && j<3)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void printE() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i==1 || i==5 || i==3) || j==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printF() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i==1 || i==3 || j==1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printG() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==1 && i>1) || (i==1 && j>1) || (i==5 && j<4) ||
						(i==4 && j==3) || (i==3 && j==3) || (i==3 && j==4)
						|| (i==4 && j==5) || (i==5 && j==5) || (i==3 && j==5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printH() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==1 || i==3 || j==5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printI() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i==1 || j==3 || i==5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printJ() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==3) || (i==5 && j==2) || (i==4 && j==1) || (i==1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printK() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==1) || (i==3 && j==3) || (i==2 && j==4) || (i==1 && j==5)
						|| (i==4 && j==4) || (i==5 && j==5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printL() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==1 || i==5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printM() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==1 || j==5) || (i==2 && j==2) || (i==2 && j==4) || (i==3 && j==3)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void printN() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j==1 || j==5 || j==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printO() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i==1 && j>1 && j<5) || (i==5 && j>1 && j<5) || (j==1 && i>1 && i<5)
						|| (j==5 && i>1 && i<5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printP() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==1) || (i==1 && j<4) || (i==2 && j==4) || (i==3 && j<4)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printQ() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==2 && i>1 && i<4) || (i==1 && j==3) ||
						(i==4 && j==3) || (j==4 && i>1 && i<4) || (i==3 && j==3)
						|| (i==5 && j==2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void printR() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==1) || (i==1 && j>1 && j<5) || (i==3 && j<5) ||
						(i==2 && j==4) || (i==4 && j==3) || (i==5 && j==5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printS() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i==1 || i==5) || (j==1 && i<=3) || (i==3) || (i==4 && j==5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printT() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i==1 || j==3)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printU() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==1 && i<5) || (j==5 && i<5) || (i==5 && j>1 && j<5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printV() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==1 && i<4) || (j==5 && i<4) || (i==4 && j==2) || (i==4 && j==4)
						|| (i==5 && j==3)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printW() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==1 && i<=5) || (j==5 && j<=5) || (i==4 && j==2)
						|| (i==4 && j==4) || (i==3 && j==3)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	static void printX() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i==j || i+j == 6)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printY() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((j==3 && i>2) || (i==2 && j==2) || (i==2 && j==4) ||
						(i==1 && j==1) || (i==1 && j==5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printZ() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if((i==1 || i+j == 6 || i==5)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void patternWord(String word) {
		int length = word.length();

		for(int i=0; i<length; i++) {
				char ch = word.charAt(i);
				switch(ch) {
				case 'A':
					printA();
                    System.out.println();
					break;

				case 'B':
					printB();
                    System.out.println();
					break;

				case 'C':
					printC();
                    System.out.println();
					break;

				case 'D':
					printD();
                    System.out.println();
					break;

				case 'E':
					printE();
                    System.out.println();
					break;

				case 'F':
					printF();
                    System.out.println();
					break;

				case 'G':
					printG();
                    System.out.println();
					break;

				case 'H':
					printH();
                    System.out.println();
					break;

				case 'I':
					printI();
                    System.out.println();
					break;

				case 'J':
					printJ();
                    System.out.println();
					break;

				case 'K':
					printK();
                    System.out.println();
					break;

				case 'L':
					printL();
                    System.out.println();
					break;

				case 'M':
					printM();
                    System.out.println();
					break;

				case 'N':
					printN();
                    System.out.println();
					break;

				case 'O':
					printO();
                    System.out.println();
					break;

				case 'P':
					printP();
                    System.out.println();
					break;

				case 'Q':
					printQ();
                    System.out.println();
					break;

				case 'R':
					printR();
                    System.out.println();
					break;

				case 'S':
					printS();
                    System.out.println();
					break;

				case 'T':
					printT();
                    System.out.println();
					break;

				case 'U':
					printU();
                    System.out.println();
					break;

				case 'V':
					printV();
                    System.out.println();
					break;

				case 'W':
					printW();
                    System.out.println();
					break;

				case 'X':
					printX();
                    System.out.println();
					break;

				case 'Y':
					printY();
                    System.out.println();
					break;

				case 'Z':
					printZ();
                    System.out.println();
					break;
				}
			}
		}
	}
