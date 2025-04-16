package basic_codes;

public class CheckTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start_time= System.currentTimeMillis();
		for(int i=0;i<=100000;i++) {
		System.out.println(i);
		
		}
		long end_time=System.currentTimeMillis();
		long time_taken=end_time-start_time;
		System.out.println(time_taken);
	}

}
