package NotificationSystem;

public interface NotificationObserver {
public void update(ProductSubject product);
}

class EmailObserver implements NotificationObserver{

	String email;
	iMessage message;
	public EmailObserver(String email)
	{
		this.email=email;
		message=new EmailMessage();
	}
	@Override
	public void update(ProductSubject product) {
		sendEmail(product);
	}
	private void sendEmail(ProductSubject product) {
		System.out.println(message.getMessage(product));
	}
	
}

class SMSObserver implements NotificationObserver{

	int phonenum;
	iMessage message;
	public SMSObserver(int phonenum)
	{
		this.phonenum=phonenum;
		message=new SMSMessage();
	}
	@Override
	public void update(ProductSubject product) {
		sendSMS(product);
	}
	private void sendSMS(ProductSubject product) {
		System.out.println(message.getMessage(product));
	}
	
}

class WhatsAppObserver implements NotificationObserver{

	String name;
	iMessage message;
	public WhatsAppObserver(String name)
	{
		this.name=name;
		message=new WhatsAppMessage();
	}
	@Override
	public void update(ProductSubject product) {
		sendWhatsApp(product);
	}
	private void sendWhatsApp(ProductSubject product) {
		System.out.println(message.getMessage(product));
	}
	
}
