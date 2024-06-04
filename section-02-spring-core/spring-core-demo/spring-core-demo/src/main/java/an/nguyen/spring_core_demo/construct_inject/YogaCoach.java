package an.nguyen.spring_core_demo.construct_inject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("yogaCoach")
public class YogaCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice yoga for 30 minutes";
    }
}
