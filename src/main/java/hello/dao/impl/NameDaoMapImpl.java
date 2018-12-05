package hello.dao.impl;

import hello.dao.NameDao;
import hello.model.Name;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NameDaoMapImpl implements NameDao {

    private static Logger LOGGER = LoggerFactory.getLogger(NameDaoMapImpl.class);

    private Map<Long,String> names = new HashMap<>();

    public NameDaoMapImpl() {
        names.put(1L,"Paul");
        names.put(2L,"Helen");
        names.put(3L,"Sophie");
        names.put(4L,"Judy");
    }

    @Override
    public Name get(Long id) {
        LOGGER.debug("Get called on id " + id);
        Name name = new Name(id,names.get(id));
        return name;
    }

}
