package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
  final Log log = LogFactory.getLog(getClass());

  @Override
  public void run() {
    log.info("Car run");
  }
}
