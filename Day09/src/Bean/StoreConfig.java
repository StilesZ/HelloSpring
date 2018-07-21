package Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Scope("prototype")
@Configuration
public class StoreConfig {

//        @Bean
    @Bean(name = "stringStore", initMethod = "init", destroyMethod = "destroy")
    public Store stringStore() {
        return new StringStore();
    }
}
