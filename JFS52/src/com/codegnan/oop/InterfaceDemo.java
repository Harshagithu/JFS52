package com.codegnan.oop;

class InterfaceDemo
{
	public static void main(String args[])
	{
		NotificationService email=new EmailNotification();
		System.out.println("------Email Notification-----");
		email.sendMessage("Java New Features Email");
		email.sendAlert("Spam detected in your email");
		
		NotificationService sms=new SMSNotification();
		System.out.println("-----SMS Notification-----");
		sms.sendMessage("Java New Course");
		sms.sendAlert("Check your java learning portal credentials daily");
	}
}