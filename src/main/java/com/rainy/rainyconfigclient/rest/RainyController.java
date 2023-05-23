package com.rainy.rainyconfigclient.rest;

import com.rainy.rainyconfigclient.config.RainyConfig;
import com.rainy.rainyconfigclient.model.Rain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RainyController {

  final RainyConfig config;

  public RainyController(RainyConfig rainyConfig) {
    this.config = rainyConfig;
  }

  @GetMapping("/rain")
  public Rain get() {
    Rain r = new Rain();
    r.setName(config.getName());
    r.setAge(config.getAge());
    r.setColor(config.getColor());
    r.setWeight(config.getWeight());
    r.setLanguageLevels(config.getLanguageLevels());
    r.setExtraColors(config.getExtraColors());
    return r;
  }
}
