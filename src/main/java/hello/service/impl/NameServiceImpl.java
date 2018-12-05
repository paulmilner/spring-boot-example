package hello.service.impl;

import hello.dao.NameDao;
import hello.service.NameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NameServiceImpl implements NameService {

    private static Logger LOGGER = LoggerFactory.getLogger(NameServiceImpl.class);

    @Autowired
    private NameDao nameDao;

    @Override
    public String getName(Long id) {
        LOGGER.debug("Get called on id " + id);
        return nameDao.get(id).getName();
    }
}
