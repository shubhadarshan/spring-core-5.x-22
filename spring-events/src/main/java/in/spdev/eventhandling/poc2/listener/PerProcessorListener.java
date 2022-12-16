package in.spdev.eventhandling.poc2.listener;

import in.spdev.eventhandling.poc2.event.TransactionFailureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class PerProcessorListener {

    /**
     * Want the listener, listen to multiple events
     */
    @Order(1)
    @EventListener(classes = {TransactionFailureEvent.class}) //array we can pass
    public void perProcess(){
        System.out.println("Doing some preprocessing stuff");
    }
}
