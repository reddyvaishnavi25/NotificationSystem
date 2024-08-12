package NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public interface ProductSubject {
	public void register(NotificationObserver observer);
	public void unregister(NotificationObserver observer);
	public void sendNotifyAll();
	public void setQuantity(int quantity);
	public String getName();
}

class iPhone implements ProductSubject{
	private List<NotificationObserver> observers;
	private int quantity;
	private String name;
	public iPhone(String name,int quantity)
	{
		this.name=name;
		this.quantity=quantity;
		observers=new ArrayList<>();
	}
	
	@Override
	public void register(NotificationObserver observer) {
		observers.add(observer);
	}
	@Override
	public void unregister(NotificationObserver observer) {
		observers.remove(observer);
	}
	@Override
	public void sendNotifyAll() {
		for(NotificationObserver observer: observers)
		{
			observer.update(this);
		}
	}
	@Override
	public void setQuantity(int quantity) {
		this.quantity=quantity;
		if(quantity>0)
		{
			sendNotifyAll();
		}
	}
	
	public String getName()
	{
		return this.name;
	}
}

class NikeShoe implements ProductSubject{
	private List<NotificationObserver> observers;
	private int quantity;
	private String name;
	
	public NikeShoe(String name, int quantity)
	{
		this.name=name;
		this.quantity=quantity;
		observers=new ArrayList<>();
	}
	@Override
	public void register(NotificationObserver observer) {
		System.out.println("control is here");
		observers.add(observer);
	}
	@Override
	public void unregister(NotificationObserver observer) {
		observers.remove(observer);
	}
	@Override
	public void sendNotifyAll() {
		for(NotificationObserver observer: observers)
		{
			observer.update(this);
		}
	}
	@Override
	public void setQuantity(int quantity) {
		this.quantity=quantity;
		if(quantity>0)
		{
			sendNotifyAll();
		}
	}
	
	public String getName()
	{
		return this.name;
	}
	
}