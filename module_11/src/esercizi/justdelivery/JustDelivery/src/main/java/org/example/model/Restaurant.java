package org.example.model;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class Restaurant {
    private Integer id;
    private String name;
    private Map<String, String> menu;

    public Restaurant(Integer id, String name, Map<String, String> menu) {
        this.id = id;
        this.name = name;
        this.menu = menu;
    }
}
