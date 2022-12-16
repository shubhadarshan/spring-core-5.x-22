package in.spdev.eventhandling.poc2.listener;

/*
 * ContextRefreshedEvent - Event raised when an ApplicationContext gets initialized or refreshed
 * */


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("application initialize = " + event);
    }
}
