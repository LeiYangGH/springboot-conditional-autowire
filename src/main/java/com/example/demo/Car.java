package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnExpression("'${rain}'=='true'")
public class Car implements Vehicle {

  final Log log = LogFactory.getLog(getClass());

  public Car() {
    log.info("Car constructor");
  }

  @Override
  public void run() {
    log.info("Car run");
  }
}
