package io.jenkins.plugins;

import java.io.IOException;

import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

import hudson.EnvVars;
import hudson.Extension;
import hudson.FilePath;
import hudson.Launcher;
import hudson.model.AbstractProject;
import hudson.model.Action;
import hudson.model.Build;
import hudson.model.BuildListener;
import hudson.model.FreeStyleProject;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.BuildWrapper;
import hudson.tasks.BuildWrapperDescriptor;
import hudson.tasks.Builder;
import jenkins.tasks.SimpleBuildStep;

public class HelloWorldBuilder extends Builder implements SimpleBuildStep, Action {

	// User user;
	// private String platformurl;
	private String username;
	private String password;

	@DataBoundConstructor
	public HelloWorldBuilder(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}

	@DataBoundSetter
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	@DataBoundSetter
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void perform(Run<?, ?> run, FilePath workspace, EnvVars env, Launcher launcher, TaskListener listener)
			throws InterruptedException, IOException {
		run.addAction(new HelloWorldBuilder(username));

		listener.getLogger().println("Username: " + username);
		listener.getLogger().println("Password: " + password);

		if (username == null) {
			listener.getLogger().println("Username is null ");
		} else {
			listener.getLogger().println("Welcome :" + username);
			listener.getLogger().println("Welcome :" + username);
		}

	}

	@Extension
	public static class DescriptorImpl extends BuildStepDescriptor<Builder> {

		@Override
		public String getDisplayName() {
			return "Qualys IaC Integration";
		}

		@Override
		public boolean isApplicable(Class<? extends AbstractProject> jobType) {
			// TODO Auto-generated method stub
			return jobType == FreeStyleProject.class;
		}
	}

	@Override
	public String getIconFileName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUrlName() {
		// TODO Auto-generated method stub
		return null;
	}

}
