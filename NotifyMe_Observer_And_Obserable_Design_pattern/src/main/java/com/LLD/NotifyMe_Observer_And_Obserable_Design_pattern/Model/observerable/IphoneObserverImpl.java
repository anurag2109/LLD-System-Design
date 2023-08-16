package com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observerable;

import java.util.ArrayList;
import java.util.List;

import com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observer.NotificationAlertObserverInterface;

public class IphoneObserverImpl implements StockObserverableInterface {

	List<NotificationAlertObserverInterface> observerList;
	private int newStock;
	
	public IphoneObserverImpl() {
		observerList = new ArrayList<>();
	}

	@Override
	public void add(NotificationAlertObserverInterface alertObserverInterface) {
		observerList.add(alertObserverInterface);
	}

	@Override
	public void remover(NotificationAlertObserverInterface alertObserverInterface) {
		observerList.remove(alertObserverInterface);
	}

	@Override
	public void notifySubscriber() {
		for(NotificationAlertObserverInterface observer : observerList) {
			observer.update();
		}
	}

	@Override
	public void setStock(int stockCount) {
		if(this.newStock > 0) {
			this.newStock = stockCount;
		}else {
			notifySubscriber();
			this.newStock = stockCount;
		}
	}

	@Override
	public int getStock() {
		return this.newStock;
	}

}
