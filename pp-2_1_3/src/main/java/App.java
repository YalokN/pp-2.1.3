import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat2 =
                (Cat) applicationContext.getBean("cat");
        if (bean == bean2) {
            System.out.println("true bean");
        } else
            System.out.println("false bean");

        if (beanCat == beanCat2) {
            System.out.println("true beanCat");
        } else
            System.out.println("false beanCat");
        System.out.println(bean.getMessage());
        System.out.println(beanCat.getMessage());
    }
}