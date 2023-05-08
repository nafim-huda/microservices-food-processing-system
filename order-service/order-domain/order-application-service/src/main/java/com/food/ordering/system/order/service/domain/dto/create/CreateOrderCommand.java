package com.food.ordering.system.order.service.domain.dto.create;

/* contains required information for creating an order
* Application Service will request this object whenever a client makes an order request in the domain layer
* */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter // generates getters for each property in this object
@Builder // creates Builder object from this object's properties
@AllArgsConstructor
public class CreateOrderCommand {
    @NotNull
    private final UUID customerId;
    @NotNull
    private final UUID restaurantId;
    @NotNull
    private final BigDecimal price;
    @NotNull
    private final List<OrderItem> items;
    @NotNull
    private final OrderAddress address;
}
