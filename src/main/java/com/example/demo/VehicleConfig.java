package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {
  @Value("${rain}")
  public boolean rain;
}
