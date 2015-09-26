package com.automation.peloton.common.listeners;

import org.openqa.selenium.remote.DriverCommand;

import com.infostretch.automation.ui.webdriver.CommandTracker;
import com.infostretch.automation.ui.webdriver.QAFExtendedWebElement;
import com.infostretch.automation.ui.webdriver.QAFWebElementCommandAdapter;

public class WebElementCommandListener extends QAFWebElementCommandAdapter {
	@Override
	public void beforeCommand(QAFExtendedWebElement element, CommandTracker commandTracker) {
		super.beforeCommand(element, commandTracker);
		String command = commandTracker.getCommand();
			if (command.equalsIgnoreCase(DriverCommand.SEND_KEYS_TO_ELEMENT)) {
				//element.clear();
			}
	}
	@Override
	public void onFailure(QAFExtendedWebElement element, CommandTracker commandTracker) {
		super.onFailure(element, commandTracker);
	}
}
