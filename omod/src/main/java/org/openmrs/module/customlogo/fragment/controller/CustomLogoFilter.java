package org.openmrs.module.customlogo.fragment.controller;

import org.openmrs.ui.framework.page.PageRequest;
import org.openmrs.ui.framework.page.PageRequestMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomLogoFilter implements PageRequestMapper {
	
	@Override
	public boolean mapRequest(PageRequest request) {
		if (request.getProviderName().equals("referenceapplication")) {
			if (request.getPageName().equals("login")) {
				// change to the custom login provided by the module
				request.setProviderNameOverride("customlogo");
				request.setPageNameOverride("customLogin");
				return true;
			}
		}
		return false;
	}
	
}
