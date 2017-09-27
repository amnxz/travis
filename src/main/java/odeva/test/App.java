package odeva.test;

/**
 * Hello world!
 *
 */


public class App 
{
	
	static public String retournerChaine(String xml){
		String chaine;
		System.out.println(xml);
		chaine=xml;
		return chaine;
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        retournerChaine("testTravis");
    }
}
