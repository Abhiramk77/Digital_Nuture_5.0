# Module 1: Design Patterns and Principles - Exercises

This document outlines the exercises solved under Module 1.

## Creational Patterns
1. **Singleton**: Implement a thread-safe configuration Logger class that restricts instantiation to a single global object. Use Double-Checked locking.
2. **Factory Method**: Create a Document editing system with different document types (`WordDocument`, `PdfDocument`) using document factories (`WordDocumentFactory`, `PdfDocumentFactory`).
3. **Builder**: Implement a `Computer` building utility with required fields (`HDD`, `RAM`) and optional fields (`graphicsCard`, `bluetooth`). Ensure step-by-step chaining.

## Structural Patterns
4. **Adapter**: Adapt a third-party `StripeGateway` transaction method (expects integer cents) to a standard `PaymentGateway` interface (expects double dollars).
5. **Decorator**: Develop a layered notification system where the core `EmailNotifier` is dynamically augmented with `SMSNotifierDecorator` and `SlackNotifierDecorator`.
6. **Proxy**: Build an image lazy-loader proxy that defers resource loading from disk and caches the image for subsequent display requests.

## Behavioral Patterns
7. **Observer**: Model a real-time `StockMarket` ticker that publishes GOOGL price updates and automatically broadcasts them to registered mobile and web dashboard observers.
8. **Strategy**: Implement a dynamic checkout payment system (`ShoppingCart`) that executes payment through interchangeable strategy algorithms (`CreditCardPayment`, `PayPalPayment`).
9. **Command**: Create an automation remote controller (`RemoteControl`) executing turn-on/off instructions (`LightOnCommand`, `LightOffCommand`) on a target (`Light`).
