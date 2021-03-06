package com.currency.exchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currency.exchange.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

	ExchangeValue findByFromAndTo(String from, String to);

}
