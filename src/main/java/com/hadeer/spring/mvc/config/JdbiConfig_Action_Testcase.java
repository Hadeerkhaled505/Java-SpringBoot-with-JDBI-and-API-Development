package com.hadeer.spring.mvc.config;

import org.jdbi.v3.core.Jdbi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hadeer.spring.mvc.Dao.TestCases_ActionsDAO;
@Configuration
public class JdbiConfig_Action_Testcase {
	
	
	  @Value("${spring.datasource.url}")
	    private String dbUrl;

	    @Value("${spring.datasource.username}")
	    private String dbUsername;

	    @Value("${spring.datasource.password}")
	    private String dbPassword;

	
	
	
	
	 @Bean
	    public TestCases_ActionsDAO testCases_ActionsDAO(Jdbi jdbi) {
	        return jdbi.onDemand(TestCases_ActionsDAO.class);
	    }

}
