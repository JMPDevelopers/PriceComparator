package annotation;

import com.jmpdev.Application;
import com.jmpdev.pojo.DataConfigProfile;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cglib.core.Constants;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.web.WebAppConfiguration;

import java.lang.annotation.*;

/**
 * Created by HP on 2016-02-04.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@WebAppConfiguration
@ActiveProfiles(DataConfigProfile.H2)
@SpringApplicationConfiguration(classes = Application.class)
public @interface ComponentTest {
}
