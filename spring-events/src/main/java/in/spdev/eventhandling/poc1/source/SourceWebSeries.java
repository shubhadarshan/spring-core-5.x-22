package in.spdev.eventhandling.poc1.source;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SourceWebSeries{
    @Value("${name: Warner Bros}")
    private String name;
    @Value("${netWroth: 400mil}")
    private String netWroth;
}
