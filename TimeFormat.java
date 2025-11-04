// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		String minutes = ("" + args[0].charAt(3) + args[0].charAt(4));
	    if (hours<=12) {
	    System.out.println(hours + ":" + minutes + " am");
		}
        else if (hours>12) {	
		System.out.println("0" + (hours - 12) + ":" + minutes + " pm" );
		}
	}
}
	
	
	
		 
	
			
	
		
	
