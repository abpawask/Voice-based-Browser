/**
 * This command class represents the functionality
 *  to display all the paragraphs of the selected view.
 */

package com.browser.command;

import com.browser.view.TabView;

public class TextCommand implements Command {

	@Override
	public void execute() {
		TabView.getCurrentViewController().getTagHandler().deselectAllLinks();
		TabView.getCurrentViewController().getTagHandler().deselectAllHeaders();
		TabView.getCurrentViewController().getTagHandler().deselectAllText();
		TabView.getCurrentViewController().getTagHandler()
				.highlightAllTextinCurrentView();
	}

}
