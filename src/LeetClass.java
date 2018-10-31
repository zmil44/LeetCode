import java.util.*;
public class LeetClass {
	
	private char original;
	private String result;
	public LeetClass()
	{
		Welcome();
	}
	public void Welcome()
	{
		System.out.println("Welcome to the Leet Converter\n");
	}
	public void GetInput()
	{
		System.out.print("Please enter a character: ");
		Scanner scan=new Scanner(System.in);
		original=scan.next().charAt(0);
		scan.close();
	}
	public void Convert()
	{
		switch (original)
		
		{
					case 'A': case 'a':
						 result=("/-\\"); 
						break;
					
					case 'B': case 'b':
						result=("|3");
						break;
					
					case 'C': case 'c':
						result=("(");
						break;
					
					case 'D': case 'd':
						result=("|)");
						break;
					
					case 'E': case 'e':
						result=("3");
						break;
					
					case 'F': case 'f':
						result=("|=");
							break;
					
					case 'G': case 'g':
						result=("9");
							break;
					
					case 'H': case 'h':
						result=("|-|");
							break;
					
					case 'I': case 'i':
						result=("|");
							break;
					
					case 'J': case 'j':
						result=("_|");
							break;
					
					case 'K': case 'k':
						result=("|<");
							break;
					
					case 'L': case 'l':
						result=("|_");
							break;
					
					case 'M': case 'm':
						result=("|\\/|");
							break;
					
					case 'N': case 'n':
						result=("|\\|");
							break;
					
					case 'O': case 'o':
						result=("()");
							break;
					
					case 'P': case 'p':
						result=("|2");
							break;
					
					case 'Q': case 'q':
						result=("(,)");
							break;
					
					case 'R': case 'r':
						result=(":|?");
							break;
					
					case 'S': case 's':
						result=("5");
							break; 
					
					case 'T': case 't':
						result=("+");
							break;
					
					case 'U': case 'u':
						result=("|_|");
							break;
					
					case 'V': case 'v':
						result=("\\/");
							break;
					
					case 'W': case 'w':
						result=("\\//\\//");
							break;
					
					case 'X': case 'x':
						result=("><");
							break;
					
					case 'Y': case 'y':
						result=("'/");
							break;
					
					case 'Z': case 'z':
						result=("2");
							break;
					
					default:
						result=("You entered an invalid character");
				}
	}
	public void DisplayResults()
	{
		System.out.printf("User input: %c	Leet Equivalent: %s",original,result);
	}
	
	
	

}
