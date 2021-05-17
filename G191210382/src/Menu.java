import java.util.Scanner;

public class Menu {

	public void selectOption(int option) {
		IOptions options = new Options(); // Dependency Injection
		Scanner input = new Scanner(System.in);
		while (option != 4) {
			System.out.println("ISLEM:");
			System.out.println("1.Sicaklik Goruntule");
			System.out.println("2.Sogutucu Ac");
			System.out.println("3.Sogutucu Kapat");
			System.out.println("4.Cikis");
			option=input.nextInt();
			if (option == 1)
				options.thermometer();
			else if (option == 2)
				options.openCooler();
			else if (option == 3)
				options.closeCooler();
			else
				System.out.println("Hoscakalin..");
		}

	}
}
