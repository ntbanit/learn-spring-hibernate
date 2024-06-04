package an.nguyen.spring_core_demo.construct_inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YogaCourseController {

    private final Coach coach;

    @Autowired
    public YogaCourseController(@Qualifier("yogaCoach") Coach coach) {
        this.coach = coach;
    }
    @GetMapping("/yoga-workout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }
}
