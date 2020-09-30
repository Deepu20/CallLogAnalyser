package com.logcalls.logsAnalyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.logcalls.logsAnalyzer.service"})
@EntityScan("com.logcalls.logsAnalyzer.model")
@EnableJpaRepositories("com.logcalls.logsAnalyzer.repository")

public class LogsAnalyzerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LogsAnalyzerApplication.class, args);
	}

}
