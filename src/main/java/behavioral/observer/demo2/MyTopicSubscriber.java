package behavioral.observer.demo2;

public class MyTopicSubscriber implements Observer {

	private String name;
	private Subject subject;
	
	public MyTopicSubscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		String message = (String) subject.getUpdates(this);
		if (message == null) {
			System.out.println(name + ": No new message.");
		} else {
			System.out.println(name + " Consuming new message : " + message);
		}
	}

	@Override
	public void setSubject(Subject subject) {
		// TODO Auto-generated method stub
		this.subject = subject;		
	}

}
