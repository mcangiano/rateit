package it.mc.spin.presentation.html.login.controller;

public final class LoginForm {

	private String	username;
	private String	password;

	public String getUsername() {

		return username;
	}

	public void setUsername(final String username) {

		this.username = username;
	}

	public String getPassword() {

		return password;
	}

	public void setPassword(final String password) {

		this.password = password;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((password == null) ? 0 : password.hashCode());
		result = (prime * result) + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		LoginForm other = (LoginForm) obj;
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else
			if (!password.equals(other.password)) {
				return false;
			}
		if (username == null) {
			if (other.username != null) {
				return false;
			}
		} else
			if (!username.equals(other.username)) {
				return false;
			}
		return true;
	}

	@Override
	public String toString() {

		return "LoginForm [username=" + username + ", password=" + password + "]";
	}
}
