package com.hadeer.spring.mvc.config;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hadeer.spring.mvc.Dao.ActionsDAO;

import org.springframework.beans.factory.annotation.Value;
import javax.sql.DataSource;

@Configuration
public class JdbiConfig_Action {

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @Value("${spring.datasource.username}")
    private String dbUsername;

    @Value("${spring.datasource.password}")
    private String dbPassword;

    @Bean
    public Jdbi jdbi(DataSource dataSource) {
        Jdbi jdbi = Jdbi.create(dataSource);
        jdbi.installPlugin(new SqlObjectPlugin());
        return jdbi;
    }

    @Bean
    public ActionsDAO actionsDAO(Jdbi jdbi) {
        return jdbi.onDemand(ActionsDAO.class);
    }
    
   
   
}
