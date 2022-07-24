package io.jenkins.plugins;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

public class User {
	
	public String platformUrl;
	public String userName;
	public String password;
	
	public User() {
		
		
	}
	@DataBoundConstructor
	public User(String platformUrl, String userName, String password) {
		
		this.platformUrl = platformUrl;
		this.userName = userName;
		this.password = password;
	}
	public String getPlatformUrl() {
		return platformUrl;
	}
	 @DataBoundSetter
	public void setPlatformUrl(String platformUrl) {
		this.platformUrl = platformUrl;
	}
	public String getUserName() {
		return userName;
	}
	 @DataBoundSetter
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	 @DataBoundSetter
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	
	


}
