package com.jokeeffe.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "This is Maven" );
        System.out.println("This is Jenkins");
        System.out.println("This is Java");
        System.out.println("This is now in TeamCity");
        
        int x,y;
        Calculator c = new Calculator();
        x = 4;
        y = 6;
        System.out.println(c.Add(x,y));
    }
}
