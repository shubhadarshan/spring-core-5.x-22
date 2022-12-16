package in.spdev.eventhandling.poc1.handler;

import in.spdev.eventhandling.poc1.event.StreamGOTEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class HotStarViewerHandler {

    @EventListener
    public void streamGOT(StreamGOTEvent streamGOTEvent){
        System.out.println("Streaming now 'Game of thrones'");
    }
}
