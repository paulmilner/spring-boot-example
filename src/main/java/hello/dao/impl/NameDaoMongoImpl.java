package hello.dao.impl;

import hello.dao.NameDao;
import hello.model.Name;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NameDaoMongoImpl implements NameDao { // comment out to prevent Spring finding >1 implementation

    //TODO the Mongo datasource that will be used by this DAO!

    private static Logger LOGGER = LoggerFactory.getLogger(NameDaoMongoImpl.class);

    //@Override
    public Name get(Long id) {
        LOGGER.debug("Get called on id " + id);
        Name name = new Name(id,"Someone! (I can't yet find out who you are)");
        return name;
    }

}
