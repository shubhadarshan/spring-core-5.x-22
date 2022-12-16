package in.spdev.eventhandling.poc1.test;

import in.spdev.eventhandling.poc1.config.ApplicationConfiguration;
import in.spdev.eventhandling.poc1.event.StreamGOTEvent;
import in.spdev.eventhandling.poc1.publisher.HBOPublisher;
import in.spdev.eventhandling.poc1.source.SourceWebSeries;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PremiereGOT {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        SourceWebSeries sourceBean = applicationContext.getBean(SourceWebSeries.class);
        StreamGOTEvent streamGOTEvent = new StreamGOTEvent(sourceBean, "GOT");
        HBOPublisher publisherBean = applicationContext.getBean(HBOPublisher.class);
        publisherBean.publish(streamGOTEvent);
    }
}
