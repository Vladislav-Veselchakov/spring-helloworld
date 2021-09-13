import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String[] args) {
        System.out.println("------------------ VL main() ----------------------");
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat = (Cat) applicationContext.getBean("cat");

        System.out.println(bean.getMessage());
        System.out.println("Cat name: " + cat.getName());
        HelloWorld hw = (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println("bean == hw : " + (bean == hw));
        System.out.println("cat == cat1 : " + (cat == cat1));
        System.out.println("cat1 == cat2 : " + (cat1 == cat2));

    }
}