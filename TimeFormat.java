public class TimeFormat {
	public static void main(String[] args) {
			int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		String minutes = ("" + args[0].charAt(3) + args[0].charAt(4));
	    if (hours<12) {
	    	System.out.println(hours + ":" + minutes + " AM");
		}
        else {	
			hours = hours-12;
			if (hours==0) {
				hours = 12;
			}
			System.out.println(hours + ":" + minutes + " PM" );
		}
	}
}
	
	
	
		 
	
			
	
		
	
