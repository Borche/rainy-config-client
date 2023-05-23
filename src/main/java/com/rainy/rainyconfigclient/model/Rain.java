package com.rainy.rainyconfigclient.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Rain {
  String name, color;
  int age, weight;

  Map<String, String> languageLevels;
  List<String> extraColors;
}
