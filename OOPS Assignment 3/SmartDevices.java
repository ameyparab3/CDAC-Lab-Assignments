interface Callable{
	void makeCall();
}

interface Messaging{
	void sendMessage();
}

interface Internet{
	void browse();
}

class SmartPhone implements Callable, Messaging, Internet{
	String number, message, website;
	SmartPhone(String number, String message, String website){
		this.number=number;
		this.message=message;
		this.website=website;
	}
	
	public void makeCall(){
		System.out.println("Calling "+this.number);
	}
	public void sendMessage(){
		System.out.println("Sending message to "+this.number+", message: "+this.message);
	}
	public void browse(){
		System.out.println("Browsing website: "+this.website);
	}
}

class SmartDevices{
	public static void main(String argz[]){
		SmartPhone s1 = new SmartPhone("1234567890", "Hello!", "www.google.com");
		s1.makeCall();
		s1.sendMessage();
		s1.browse();
	}
}