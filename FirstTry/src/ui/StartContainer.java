package ui;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import resources.ResourcePaths;
import util.HTMLUtil;
import model.User;

public class StartContainer extends AbstractContainer {

	@Override
	public void provideContent(HttpServletRequest request,
			StringBuilder content, User currentUser) {
		String userName = "";
		if (currentUser != null) {
			userName = currentUser.getUserName();
		}
		Map<String, String> replacements = new HashMap<String, String>();
		replacements.put("USERNAME", userName);
		content.append(HTMLUtil.getHTMLFile(ResourcePaths.HTML_FILE_PATH
				+ "/startPage.html", replacements));

	}
}
