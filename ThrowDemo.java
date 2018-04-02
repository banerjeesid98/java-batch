
public class ThrowDemo {
	public static void main(String[] args) {
		int age = 17;
		try{
			new ThrowDemo().processBooking(age);
		} catch (AgeValidationException ex){
			System.out.println(ex.getMessage());
		}
	}

	void processBooking(int age) {
		if (age < 18) {
			throw new AgeValidationException("Age must be greater or equal 18");
		}

		System.out.println("booking process....");
	}
}

class AgeValidationException extends RuntimeException {
	AgeValidationException(String msg){
		super(msg);
	}
	
	public String getMessage(){
		return "YOURAPP says - " + super.getMessage();
	}
}
