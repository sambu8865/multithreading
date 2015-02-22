public class Threading implements Runnable {
	
	private Thread t;
	private String threadname;
	Threading(String tname){
		threadname=tname;
		System.out.println("Instantiating the thread object");
	}
	
	public void start(){
		if(t==null){
			t=new Thread(this,threadname);
			t.start();
		}
		
	}
	
	public static void main(String[] args){
		Threading r1=new Threading("Thread1");
		Threading r2=new Threading("Thread2");
		r1.start();
		r2.start()	;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside the thread " +threadname);
	}
}
