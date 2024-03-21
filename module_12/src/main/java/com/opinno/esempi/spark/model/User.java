package com.opinno.esempi.spark.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    Long id;

    String username;
}
