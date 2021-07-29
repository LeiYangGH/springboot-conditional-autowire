package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("Bike")
public class Bike implements Vehicle {

  final Log log = LogFactory.getLog(getClass());

  @Override
  public void run() {
    log.info("Bike run");
  }
}