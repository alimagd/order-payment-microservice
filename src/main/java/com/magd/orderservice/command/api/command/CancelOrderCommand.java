package com.magd.orderservice.command.api.command;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class CancelOrderCommand {

    @TargetAggregateIdentifier
    String orderId;
    String orderStatus = "CANCELED";

}
