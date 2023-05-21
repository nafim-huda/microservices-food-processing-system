package com.food.ordering.system.order.service.domain.ports.input.service;

import com.food.ordering.system.order.service.domain.dto.create.CreateOrderCommand;
import com.food.ordering.system.order.service.domain.dto.create.CreateOrderResponse;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderQuery;
import com.food.ordering.system.order.service.domain.dto.track.TrackOrderResponse;

import javax.validation.Valid;

/* Exposed to the client for making a request for a new order*/
/*
* We typically use the '@Valid' annotation within the interface and not its implementation due to
* Java Bean specification rules (ConstraintDeclarationException if used in the implementation class)
* */
public interface OrderApplicationService {
    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);


}
