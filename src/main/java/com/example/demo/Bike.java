package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component()
@ConditionalOnExpression("'${rain}'=='false'")
public class Bike implements Vehicle {

  final Log log = LogFactory.getLog(getClass());

  public Bike() {
    log.info("Bike constructor");
  }

  @Override
  public void run() {
    log.info("Bike run");
  }
}