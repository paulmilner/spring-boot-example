package hello;

import hello.dao.NameDao;
import hello.dao.impl.NameDaoMapImpl;
import hello.dao.impl.NameDaoMongoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class ApplicationConfiguration {
    @Bean
    @Primary
    public NameDao nameDao() {
        //return new NameDaoMapImpl();
        return new NameDaoMongoImpl();
    }
}