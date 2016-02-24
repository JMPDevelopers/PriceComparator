package repository;

import annotation.ComponentTest;
import com.jmpdev.domain.User;
import com.jmpdev.domain.UserRole;
import com.jmpdev.repository.UserRepository;
import com.jmpdev.repository.UserRoleRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by HP on 2016-01-26.
 */
@ComponentTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RepositoryTest {

    //spokój, opanowanie, skill
    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRoleRepository userRoleRepository;

    private final Logger LOGGER = LogManager.getLogger(RepositoryTest.class);

    private EmbeddedDatabase db;

    @Before
    public void setUp() {
        //db = new EmbeddedDatabaseBuilder().addDefaultScripts().build();
        db = new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("db/sql/create-db.sql")
                .addScript("db/sql/insert-data.sql")
                .build();
    }

//    @Before
//    public void saveUserWithRoles() {
//        User user = new User("ja3ekja", "Jacek", "Felix", "ja@gmail.com", "pasword");
//        List<UserRole> userList = new LinkedList<UserRole>();
//        userList.add(new UserRole("ADMIN"));
//        user.setRoles(userList);
//        userRepository.save(user);
//
//    }
//    @Test
//    public void getUserRole(){
//        User user = userRepository.findByUsername("ja3ekja");
//        assertEquals("ADMIN", user.getRoles().get(0).getRoleName());
//            }
//
//    @Test
//    public void checkUserRoleTest() {
//        UserRole userRoleUSER = new UserRole();
//        userRoleUSER.setRoleName("USER");
//        userRoleRepository.save(userRoleUSER);
//
//       UserRole role = userRoleRepository.findByRoleName("USER");
//        assertEquals(role.getRoleName(), "USER");
//    }


    @Test
    public void Test(){
        List<User> userList = userRepository.findAll();
        assertNotNull(userList);
        assertEquals(userList.get(0), null);
        UserRole userRole = new UserRole("DBA");
        //user.getRoles().get(0);
    }

//    @Test
//    public void Test(){}
//
//    @Test
//    public void Test(){}
}