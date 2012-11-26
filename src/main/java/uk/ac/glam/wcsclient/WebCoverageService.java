package uk.ac.glam.wcsclient;

import java.io.IOException;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public abstract class WebCoverageService {
	protected String serviceURL;
	private static final Logger LOGGER = Logger.getLogger("wcsclient");
	
	public WebCoverageService(String url) {
		serviceURL = url.split("\\?")[0];
	}

	public String getServiceURL() {
		return serviceURL;
	}

	public static WebCoverageService createWebCoverageService(String url) throws IOException, SAXException, ParserConfigurationException {
		String version = null;
		
		LOGGER.info("Creating WCS with url: " + url);
		
		String[] params = url.split("\\?")[1].split("&");
		for (int i = 0; i < params.length; i++) {
			if (params[i].contains("=")) {
				String param = params[i].split("=")[0];
				String value = params[i].split("=")[1];

				if (param.equalsIgnoreCase("VERSION")) {
					version = value;
				}
			}
		}
		
		LOGGER.info("Version: " + version);
		
		if (version == null || version.equals("1.0.0")) {
			return new WCS100(url);
		} else if (version.equals("1.1.1")) {
			return new WCS111(url);
		}
		return null;
	}
}
