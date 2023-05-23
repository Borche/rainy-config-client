package com.rainy.rainyconfigclient.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix="rain")
@Getter @Setter @ToString
public class RainyConfig {

  private String name;
  private int age;
  private String color;
  private int weight;

  Map<String, String> languageLevels;
  List<String> extraColors;

}
