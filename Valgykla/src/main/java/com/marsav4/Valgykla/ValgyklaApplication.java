package com.marsav4.Valgykla;

import com.marsav4.Valgykla.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class ValgyklaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValgyklaApplication.class, args);
	}

}
