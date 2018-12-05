package hello.service;

import hello.dao.NameDao;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class NameServiceTestConfiguration {
    @Bean
    @Primary
    public NameDao nameDao() {
        return Mockito.mock(NameDao.class);
    }
}