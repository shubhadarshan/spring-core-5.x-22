package in.spdev.eventhandling.poc2.test;

import in.spdev.eventhandling.poc2.config.ApplicationConfiguration;
import in.spdev.eventhandling.poc2.publisher.GPay;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class GPayApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        context.start();

        GPay gPay = context.getBean(GPay.class);
        gPay.sendMoneyViaMobileNo(658990549L,4000);

        context.stop();
        context.close();
    }
}
