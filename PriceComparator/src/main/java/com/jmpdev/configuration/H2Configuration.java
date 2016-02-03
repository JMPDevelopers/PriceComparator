package com.jmpdev.configuration;

/**
 * Created by HP on 2016-02-03.
 */

import com.jmpdev.pojo.DataConfigProfile;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.core.config.Order;
import org.aspectj.lang.annotation.Before;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.stereotype.Component;

//@Order(1)
@Configuration
@Profile(DataConfigProfile.H2)
public class H2Configuration {

    private final Logger LOGGER = LogManager.getLogger(H2Configuration.class);

//    public void databaseRun() {
//        LOGGER.error("Oracle database!");
//        EmbeddedDatabase db = new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2)
//                //.addScript("db/drop-table-db.sql")
//                .build();
//    }

}
