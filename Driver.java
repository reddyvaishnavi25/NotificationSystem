package NotificationSystem;

public class Driver {

	public static void main(String[] args) {
		 ProductSubject iphone=new iPhone("iphone", 0);
		 ProductSubject shoe=new NikeShoe("nikeshoe",0);
		 
		 NotificationObserver observer1=new EmailObserver("thevaishnavi@gmail.com");
		 NotificationObserver observer2=new SMSObserver(9121938);
		 NotificationObserver observer3=new WhatsAppObserver("priya");
		 NotificationObserver observer4=new WhatsAppObserver("seetha");
		 
		 
		 iphone.register(observer1);
		 iphone.register(observer2);
		 iphone.register(observer3);
		 iphone.register(observer4);
		 
		 
		 NotificationObserver observer5=new EmailObserver("ram.456@gmail.com");
		 NotificationObserver observer6=new SMSObserver(468795);
		 NotificationObserver observer7=new WhatsAppObserver("sam");
		
		 
		 shoe.register(observer5);
		 shoe.register(observer6);
		 shoe.register(observer7);
		 
		 iphone.setQuantity(5);
		 shoe.setQuantity(10);
		 
		 shoe.unregister(observer6);
		 iphone.unregister(observer2);
		 
		 iphone.setQuantity(3);
		 shoe.setQuantity(8);
		 
	}

}
