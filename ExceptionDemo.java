
public class ExceptionDemo {
	public static void main(String[] args) {
		int x = 0;
		int arr[] = {1,2}; 
		int y = 0;
		String ui = "0";
		try{
			x = Integer.parseInt(ui);
			y = 6/x;
			arr[x] = 6;
			System.out.println("line is executed....");
		} catch(ArithmeticException ex){
			System.out.println("Error ... " + ex.getMessage());
		} catch(NumberFormatException ex){
			System.out.println("Error ... " + ex.getMessage());
		} catch (Exception ex){
			System.out.println("Error ... " + ex.getMessage());
		} finally{
			System.out.println("Ececution End...");
		}
		
		System.out.println("y = " + y);
	}
	
	int fun (){
		return -1;
	}
}
