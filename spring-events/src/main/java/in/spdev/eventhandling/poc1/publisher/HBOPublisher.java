package in.spdev.eventhandling.poc1.publisher;

import in.spdev.eventhandling.poc1.event.StreamGOTEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class HBOPublisher {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void publish(StreamGOTEvent streamGOTEvent){
        applicationEventPublisher.publishEvent(streamGOTEvent);
    }
}
