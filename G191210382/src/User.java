public class User {

	String username, password;
	Database db = new Database();

	User(UserBuilder builder) {
		this.username = builder.username;
		this.password = builder.password;
	}

	public boolean userControl() {
		if (db.control(username, password) == true)
			return true;
		else
			return false;
	}

	public static class UserBuilder {
		String username, password;

		public UserBuilder(String username, String password) {
			this.username = username;
			this.password = password;
		}

		public UserBuilder user(String username) {
			this.username = username;
			return this;

		}

		public UserBuilder password(String password) {

			this.password = password;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}

}
