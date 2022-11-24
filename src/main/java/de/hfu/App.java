package de.hfu;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Bitte geben Sie etwas ein..." );
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(s.toUpperCase());
    }
}
