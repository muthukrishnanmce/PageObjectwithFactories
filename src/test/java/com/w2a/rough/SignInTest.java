package com.w2a.rough;

import com.w2a.base.Page;
import com.w2a.pages.actions.SigninPage;

public class SignInTest {

	
	public static void main(String[] args) {
		
		Page.initConfiguration();
		SigninPage signin = Page.topNav.gotoSignIn();
		signin.doLogin("abcdef@gmail.com", "1233432");
		Page.quitBrowser();
		
	}
}
