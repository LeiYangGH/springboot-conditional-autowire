package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConsoleApp implements CommandLineRunner {

  final Log log = LogFactory.getLog(getClass());

  @Override
  public void run(String... args) throws Exception {
    log.info("ConsoleApp.run");
    System.exit(0);
  }
}
