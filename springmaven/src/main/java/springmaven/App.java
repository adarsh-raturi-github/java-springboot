package springmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context=new ClassPathXmlApplicationContext("spring.xml"); // create container
        Alien al=(Alien)context.getBean("alien");
       // System.out.println(al.getAge());
        al.code();
       // System.out.println( "Hello World!" );
    }
}
