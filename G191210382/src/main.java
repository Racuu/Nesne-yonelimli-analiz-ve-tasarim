import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Kullanici Adi: ");
		String username = input.next();
		System.out.println("Sifre: ");
		String password = input2.next();

		User user = new User.UserBuilder(username, password).user(username).password(password)
				.build();
		
		if (user.userControl() == true) {
			Menu menu=new Menu();
			int option = 0;
			menu.selectOption(option);
		} else
			System.out.println("Hatali Giris");

	}

}
