package NotificationSystem;

public interface iMessage {
public String getMessage(ProductSubject product);
}

class EmailMessage implements iMessage{

	@Override
	public String getMessage(ProductSubject product) {
		return "Alert!" + " " + product.getName() + " "+"is back in stock. Sent to Email";
	}
	
}

class SMSMessage implements iMessage{

	@Override
	public String getMessage(ProductSubject product) {
		return "Alert!" + " " + product.getName() + " "+"is back in stock. Sent to SMS";
	}
	
}


class WhatsAppMessage implements iMessage{

	@Override
	public String getMessage(ProductSubject product) {
		return "Alert!" + " " + product.getName() + " "+"is back in stock. Sent to WhatsApp";
	}
	
}
