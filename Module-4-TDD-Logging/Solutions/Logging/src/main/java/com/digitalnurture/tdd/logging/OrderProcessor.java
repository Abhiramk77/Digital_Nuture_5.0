package com.digitalnurture.tdd.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderProcessor {
    private static final Logger logger = LoggerFactory.getLogger(OrderProcessor.class);

    public void processOrder(String orderId, double price) {
        logger.trace("Entering processOrder method. Order ID: {}, Price: {}", orderId, price);

        if (orderId == null || orderId.trim().isEmpty()) {
            logger.error("Order processing failed: Order ID is empty!");
            throw new IllegalArgumentException("Order ID cannot be empty.");
        }

        logger.debug("Validating price for Order: {}", orderId);
        if (price <= 0) {
            logger.warn("Order {} has non-positive price: ${}", orderId, price);
        }

        logger.info("Successfully processed Order {} for amount ${}", orderId, price);
        logger.trace("Exiting processOrder method.");
    }
}
