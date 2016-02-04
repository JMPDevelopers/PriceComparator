package repository;

import annotation.ComponentTest;
import com.jmpdev.Application;
import com.jmpdev.domain.User;
import com.jmpdev.domain.UserRole;
import com.jmpdev.pojo.DataConfigProfile;
import com.jmpdev.repository.UserRepository;
import com.jmpdev.repository.UserRoleRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Created by HP on 2016-01-26.
 */
@ComponentTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RepositoryTest {

    private final Logger LOGGER = LogManager.getLogger(RepositoryTest.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRoleRepository userRoleRepository;

    @Test
    public void saveUserTest() {
        User user = new User(UUID.randomUUID().toString(), "Jarek", "jureczku", "jac@gmail.com", "ryba");
        userRepository.save(user);
    }

    @Test
    public void saveRoleTest() {
        UserRole userRole = new UserRole();
        userRole.setRoleName("USER");
        userRoleRepository.save(userRole);
    }

    @Test
    public void saveUserWithRoleTest() {

    }

    @Test
    @Ignore
    public void getRoleOfUserTest() {
        User user = userRepository.findByUsername("JACEK123");
        String role = user.getRoles().get(0).getRoleName();
        assertEquals("USER", role);
    }

    @Test
    @Ignore
    public void getUserRoleTest() {
        UserRole userRole = userRoleRepository.findByRoleName("USER");
        String ryba = userRole.toString();
        LOGGER.error(ryba);
    }

//    @Test
//    public void Test(){}
//
//    @Test
//    public void Test(){}
//
//    @Test
//    public void Test(){}
}