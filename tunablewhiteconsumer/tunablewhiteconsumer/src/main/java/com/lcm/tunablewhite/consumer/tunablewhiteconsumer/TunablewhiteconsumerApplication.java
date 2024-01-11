package com.lcm.tunablewhite.consumer.tunablewhiteconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableScheduling
public class TunablewhiteconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TunablewhiteconsumerApplication.class, args);
	}

}
