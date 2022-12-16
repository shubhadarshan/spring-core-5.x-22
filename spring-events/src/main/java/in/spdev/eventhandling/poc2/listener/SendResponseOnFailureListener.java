package in.spdev.eventhandling.poc2.listener;

import in.spdev.eventhandling.poc2.event.TransactionFailureEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class SendResponseOnFailureListener {

    @Order(3)
    @EventListener
    public void sendEmail(TransactionFailureEvent transactionFailureEvent) {
        System.out.println(transactionFailureEvent.getAmount());
        System.out.println(transactionFailureEvent.getMobileNo());
        System.out.println("Sending mail to respected mobile no over Tx failure");
    }

    @Order(2)
    @EventListener
    public void sendSMS(TransactionFailureEvent transactionFailureEvent) {
        System.out.println(transactionFailureEvent.getAmount() + " " +
                "Sending SMS to " + transactionFailureEvent.getMobileNo() + " mobile no over Tx failure");
    }
}
