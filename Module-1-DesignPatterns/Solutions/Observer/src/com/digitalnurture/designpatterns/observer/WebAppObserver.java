package com.digitalnurture.designpatterns.observer;

public class WebAppObserver implements Observer {
    private final String dashboardId;

    public WebAppObserver(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println("[Web Dashboard " + dashboardId + "]: Render stock " + stockSymbol + " at new price: $" + price);
    }
}
