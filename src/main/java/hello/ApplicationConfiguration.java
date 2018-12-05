package hello;

import hello.dao.NameDao;
import hello.dao.impl.NameDaoMapImpl;
import hello.dao.impl.NameDaoMongoImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import java.util.Optional;
import java.util.Properties;

@Configuration
public class ApplicationConfiguration {

    private static Logger LOGGER = LoggerFactory.getLogger(ApplicationConfiguration.class);

    @Value("${database.type}")
    private String databaseType;

    @Bean
    @Primary
    public NameDao nameDao() {
        if (databaseType!=null && databaseType.equals("mongo")) {
            LOGGER.debug("Using Mongo DAO");
            return new NameDaoMongoImpl();
        } else {
            LOGGER.debug("Using map-backed DAO");
            return new NameDaoMapImpl();
        }
    }

}