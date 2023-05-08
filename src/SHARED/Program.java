package SHARED;







class A extends Thread{
	
	public static int content =0;
	
	public void run() {
		for(int i=0;i<1000;i++) {
			content++;
			System.out.println(getName()+ "work" +i);

		}
	}
} 
public class Program {
	
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new A();
		A a2 = new A();
		
		a1.start();
		a2.start();
		a1.setName("ali");
		a2.setName("baba");
		
		try {
			a1.join();
			a2.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		String s1="ghassen";
		StringBuilder b = new StringBuilder(s1);
		b.append("boussaa");
		System.out.println(b);
		
		System.out.println("************************ content"+ A.content);

	}

}
