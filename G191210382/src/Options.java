import java.util.Random;

public class Options implements IOptions {

	int temp;
	boolean coolerStatus;
	public void thermometer() {
		ISubject observer = new Observer(); //Dependency Injection
		Random rand = new Random();
		temp = rand.nextInt(100);
		System.out.println("Sistem sicakligi: " + temp + "°C");
		if (temp > 40) {
			observer.notify("Sistem kritik sicaklikta");
		}
	}
	public void openCooler() {
		System.out.println("Sogutucu Acildi");
		coolerStatus = true;
	}

	public void closeCooler() {	
		System.out.println("Sogutucu Kapatildi");
		coolerStatus = false;
	}
}
