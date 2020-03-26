package com.currency.exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.builder.SpringApplicationBuilder;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableEurekaClient
public class CurrencyExchangeServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CurrencyExchangeServiceApplication.class);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
