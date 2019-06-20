package ksmart31.team00;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ksmart31.team00", "ksmart31.team01", "ksmart31.team02", "ksmart31.jjh"})
@MapperScan(basePackages = {"ksmart31.team01", "ksmart31.team02", "ksmart31.jjh"})
public class KsmartwareApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(KsmartwareApplication.class, args);
	}

}
