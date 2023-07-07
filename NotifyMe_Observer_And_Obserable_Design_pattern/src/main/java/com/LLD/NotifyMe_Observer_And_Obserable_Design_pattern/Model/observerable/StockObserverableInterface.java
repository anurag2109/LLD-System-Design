package com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observerable;

import com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observer.NotificationAlertObserverInterface;

public interface StockObserverableInterface {
	public void add(NotificationAlertObserverInterface alertObserverInterface);
	public void remover(NotificationAlertObserverInterface alertObserverInterface);
	public void notifySubscriber();
	public void setStock(int stockCount);
	public int getStock();
}
