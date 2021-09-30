package bridgelabz.com;

public class watch {
	public void test(){
		int num = 0;
		for(int i=0; i<=10; i++){  
			num =num+i;
			System.out.print(num+", ");
		}  
	}
	public static void main(String args[]){  

		long Start = System.currentTimeMillis();

		new watch().test();

		long Stop = System.currentTimeMillis();      

		long time = Stop - Start ;
		System.out.println();
		System.out.println("Elapsed Time: "+time +" milli seconds");
	}
}


