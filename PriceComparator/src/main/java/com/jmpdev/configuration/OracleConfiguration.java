package com.jmpdev.configuration;


import com.jmpdev.pojo.DataConfigProfile;
import oracle.jdbc.pool.OracleDataSource;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.logging.log4j.core.config.Order;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;
import java.sql.SQLException;

/**
 * Created by HP on 2016-01-24.
 */
@Configuration
@ConfigurationProperties("oracle")
public class OracleConfiguration {

    private final Logger LOGGER = LogManager.getLogger(OracleConfiguration.class);

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String url;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Bean
    DataSource dataSource() throws SQLException {
        LOGGER.error("Oracle database!");
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setUser(username);
        dataSource.setPassword(password);
        dataSource.setURL(url);
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setFastConnectionFailoverEnabled(true);
        return dataSource;
    }

}