package com.codegnan.oop;

public interface NotificationService {
  void sendMessage(String message);
  void sendAlert(String message);
}

class EmailNotification implements NotificationService
{

	@Override
	public void sendMessage(String msg) {
		System.out.println("Email Message sent: "+msg);
		
	}

	@Override
	public void sendAlert(String msg) {
		System.out.println("Email Alert Message: "+msg);
	}
	
}

class SMSNotification implements NotificationService
{

	@Override
	public void sendMessage(String msg) {
		System.out.println("SMS Message sent");
		
	}

	@Override
	public void sendAlert(String msg) {
		System.out.println("SMS Alert Message: "+msg);
	}
}
