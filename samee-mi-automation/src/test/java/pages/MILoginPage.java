package pages;

public class MILoginPage extends MIDashboardPage {
	/**
	 * Emtpy constructor.
	 */
	public enum Elements {
		MAIN_CONTENT_BOX("Main_content_box", "#welcomeMsg2"),
		USERNAME_FIELD("Username_field", "#comp12_usernameBox"),
		PASSWORD_FIELD("Password_field", "#comp12_passwordBox"),
		LOGIN_BUTTON("Login_button", "#btnText");

		private String name;
		private String address;

		Elements(String name, String address) {
			this.name = name;
			this.address = address;
		}
	}
	
	public MILoginPage() {
		
	}

	/**
	 * This opens a new window/tab with the given URL and waits for the main content box to appear in the HTML.
	 * 
	 * TODO change this to accept base URL, zone, and UCN to let it handle assembling the final URL
	 * 
	 * @param url  target URL to open in the new window/tab
	 */
	public MILoginPage(String url) {
		seTools.get(url);
		seTools.waitUntilPresent(Elements.MAIN_CONTENT_BOX.name, Elements.MAIN_CONTENT_BOX.address);
	}

	/**
	 * This opens a new browser, goes to the given URL and waits for the main content box to appear in the HTML.
	 * 
	 * TODO change this to accept base URL, zone, and UCN to let it handle assembling the final URL
	 * 
	 * @param url  target URL to open in the new browser
	 * @param browser target browser to open
	 */
	public MILoginPage(String url, String browser) {
		seTools.initializeDriver(browser);
		seTools.get(url);
		seTools.waitUntilPresent(Elements.MAIN_CONTENT_BOX.name, Elements.MAIN_CONTENT_BOX.address);
	}
	
	/**
	 * This logs into the SAMC Zone using the given username/password in the on-screen fields and clicking the login button.
	 * 
	 * @param username  username of the user to log in as
	 * @param password  password of the user to log in as
	 */
	public void loginIntoSamcZone(String username, String password) {
		clearAndEnterUsernameInField(username);
		clearAndEnterPasswordInField(password);
		clickLoginButton();
		seTools.waitUntilPresent("Old NG Dash", "#sam_dashboard"); // TODO remove hard coded wait for the old NG Dash page
	}
	
	/**
	 * This clears the contents of the username field and types in the username passed to it.
	 * 
	 * @param username  username of the user to log in as
	 */
	public void clearAndEnterUsernameInField(String username) {
		seTools.clearAndSendKeysToElement(Elements.USERNAME_FIELD.name, username, Elements.USERNAME_FIELD.address);
	}
	
	/**
	 * This clears the contents of the password field and types in the password passed to it.
	 * 
	 * @param password  password of the user to log in as
	 */
	public void clearAndEnterPasswordInField(String password) {
		seTools.clearAndSendKeysToElement(Elements.PASSWORD_FIELD.name, password, Elements.PASSWORD_FIELD.address);
	}
	
	/**
	 * This clicks on the login button.
	 */
	public void clickLoginButton() {
		seTools.clickElement(Elements.LOGIN_BUTTON.name, Elements.LOGIN_BUTTON.address);
	}

	public boolean areLoginElementsPresent() {
		return seTools.elementExists(Elements.USERNAME_FIELD.name, Elements.USERNAME_FIELD.address)
				&& seTools.elementExists(Elements.PASSWORD_FIELD.name, Elements.PASSWORD_FIELD.address) 
				&& seTools.elementExists(Elements.LOGIN_BUTTON.name, Elements.LOGIN_BUTTON.address);
	}
	
}
