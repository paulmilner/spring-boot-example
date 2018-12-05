package hello.service;

import hello.dao.NameDao;
import hello.model.Name;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//@RunWith(SpringRunner.class)
//@ActiveProfiles("test")
//@SpringBootTest(classes = MocksApplication.class)

@RunWith(MockitoJUnitRunner.class)
public class NameServiceTest {

        //@Autowired
        @Mock
        private NameDao nameDao;

        @Test
        public void testNameServiceReturnsNameFromExistingId() throws Exception {

            when(nameDao.get(any())).thenReturn(new Name(1L,"test1"));
            Name name1 = nameDao.get(1L);
            assertNotNull(name1);
            assertEquals(1L,name1.getId().longValue());
            assertEquals("test1", name1.getName());

        }
}
