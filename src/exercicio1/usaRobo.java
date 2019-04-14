package exercicio1;

import java.util.concurrent.TimeUnit;

public class usaRobo{
	public static void delay() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		robo ROBO = new robo();
		ROBO.andar();
		delay();
		ROBO.virar();
		delay();
		ROBO.falar();
		delay();
	}
	
}
