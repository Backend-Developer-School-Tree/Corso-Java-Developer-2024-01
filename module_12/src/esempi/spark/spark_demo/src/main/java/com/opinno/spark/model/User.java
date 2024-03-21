package com.opinno.spark.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    Long Id;

    String username;
}
