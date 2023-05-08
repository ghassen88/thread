package essaithread.step1;











class A extends Thread{
	void manger() {
		for(int i=0;i<10;i++) {
			System.out.println("ham ham" +i);
			try{
				Thread.sleep(0);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	@Override
	public void run() {
		manger();
		
	}

}
class B extends Thread{
	void marcher() {
		for(int i=0;i<10;i++) {
			System.out.println("tik tak" +i);
			try{
				Thread.sleep(0);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	@Override
	public void run() {
		marcher();
	}
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//double a = Double.parseDouble("tt");
		//System.out.println(Thread.currentThread().getName());
		//System.out.println(Thread.currentThread().getState());
		//System.out.println(Thread.currentThread().getId());
		
		
		//modele 1(modele sans thread)
		//on cherche est ce que notre application a besoin la programmation //
		/*prgrammation sequentielle
		 * *
		 * *
		 * */
		
		//il ya 3 threads en ecours d'éxecution
		//traitement parallele aleatoire
		 
		
		System.out.println("je me suis réveillé tard!!!!");
		
		
		//manger et marcher
		
		A a = new A();
		B b = new B();
	    a.setPriority(Thread.MAX_PRIORITY);
	    b.setPriority(Thread.MIN_PRIORITY);
		a.start();
		b.start();
		try {
			 a.join();
			    b.join();	
		}catch (Exception e) {
			// TODO: handle exception
		}
	   
		
		System.out.println("entrer à la salle 74");
		System.out.println("faire des cours ");
		System.out.println("faire des tps ");

		

	}

}
