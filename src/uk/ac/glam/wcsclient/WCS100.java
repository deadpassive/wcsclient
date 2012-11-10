package uk.ac.glam.wcsclient;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;

import uk.ac.glam.wcsclient.wcs100.DocumentRoot;
import uk.ac.glam.wcsclient.wcs100.WCSCapabilitiesType;
import uk.ac.glam.wcsclient.wcs100.util.Wcs100XMLProcessor;

public class WCS100 extends WebCoverageService {

	private WCSCapabilitiesType capabilitiesType;

	public WCS100(String url) throws IOException {
		super(url);
		Wcs100XMLProcessor processor = new Wcs100XMLProcessor();
		Resource r = processor.load(url, null);
		DocumentRoot root = (DocumentRoot) r.getContents().get(0);
		capabilitiesType = root.getWCSCapabilities();
	}

	public WCSCapabilitiesType getCapabilities() {
		return capabilitiesType;
	}

}
