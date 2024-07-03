package com.hadeer.spring.mvc.config;

import javax.sql.DataSource;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hadeer.spring.mvc.Dao.TestCaseDAO;
@Configuration
public class JdbiConfig_testcase {
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
	    public TestCaseDAO testCaseDAO(Jdbi jdbi) {
	        return jdbi.onDemand(TestCaseDAO.class);
	    }
}
