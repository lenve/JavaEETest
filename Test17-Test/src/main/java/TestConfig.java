import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by sang on 16-12-14.
 */
@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("dev");
    }
    @Bean
    @Profile("prod")
    public TestBean prodTestBean() {
        return new TestBean("prod");
    }
}
