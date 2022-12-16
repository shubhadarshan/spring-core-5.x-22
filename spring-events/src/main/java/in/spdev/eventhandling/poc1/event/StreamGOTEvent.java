package in.spdev.eventhandling.poc1.event;

import org.springframework.context.ApplicationEvent;

public class StreamGOTEvent extends ApplicationEvent {
    String webSeries;
    public StreamGOTEvent(Object source,String webSeries) {
        super(source);
        this.webSeries=webSeries;
    }
}
