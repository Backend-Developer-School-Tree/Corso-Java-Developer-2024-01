package com.opinno.justdelivery.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class Order {

    Long id;
    LocalDateTime dateTimeOrder;
    User user;

}
