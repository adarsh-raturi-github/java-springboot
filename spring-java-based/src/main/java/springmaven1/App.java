package springmaven1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springmaven1.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
       Desktop dt=context.getBean(Desktop.class);
       dt.compile();

       Desktop dt1=context.getBean(Desktop.class);
       dt1.compile();
    }
}
