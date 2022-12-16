package in.spdev.eventhandling.poc2.publisher;

import in.spdev.eventhandling.poc2.event.TransactionFailureEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class GPay {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void sendMoneyViaMobileNo(Long mobileNo, double amount) {

        int anInt = new Random().nextInt(2);
        int nextInt = new Random().nextInt(5);
        System.out.println(anInt +" " +nextInt);

        if (anInt > nextInt) {
            applicationEventPublisher.publishEvent(new TransactionFailureEvent(mobileNo, amount));
            throw new RuntimeException("Transaction failed");
        }

        System.out.println(mobileNo + " " + amount + " " + "is successful");
    }
}
