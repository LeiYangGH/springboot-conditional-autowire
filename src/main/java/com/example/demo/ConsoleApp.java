package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleApp implements CommandLineRunner {

  final Log log = LogFactory.getLog(getClass());

  @Autowired
  VehicleConfig vehicleConfig;

  @Autowired
  Vehicle vehicle;

  @Override
  public void run(String... args) throws Exception {
    log.info("ConsoleApp.run");
    log.info("rain=" + String.valueOf(vehicleConfig.rain));
    vehicle.run();
    System.exit(0);
  }
}
