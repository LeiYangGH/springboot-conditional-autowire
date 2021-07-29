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

  public ConsoleApp( @Qualifier("Bike") Vehicle vehicle){
    vehicle.run();
  }

  @Override
  public void run(String... args) throws Exception {
    log.info("ConsoleApp.run");
    log.info("rain="+String.valueOf(vehicleConfig.rain));
    System.exit(0);
  }
}
