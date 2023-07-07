package com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern;

import com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observer.EmailAlertNotification;
import com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observer.NotificationAlertObserverInterface;
import com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observer.SmsAlertNotification;
import com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observerable.IphoneObserverImpl;
import com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observerable.StockObserverableInterface;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StockObserverableInterface iphonObserverableInterface = new IphoneObserverImpl();
    	NotificationAlertObserverInterface email1 = new EmailAlertNotification("abc@gmail.com", iphonObserverableInterface);
    	NotificationAlertObserverInterface mob1 = new SmsAlertNotification("9876543210", iphonObserverableInterface);
    	iphonObserverableInterface.add(email1);
    	iphonObserverableInterface.add(mob1);
    	
    	iphonObserverableInterface.setStock(10);
    	iphonObserverableInterface.setStock(20);
    	
    }
}
