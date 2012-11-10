package uk.ac.glam.wcsclient;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.resource.Resource;

import uk.ac.glam.wcsclient.ows110.ReferenceGroupType;
import uk.ac.glam.wcsclient.wcs111.CapabilitiesType;
import uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType;
import uk.ac.glam.wcsclient.wcs111.CoverageSummaryType;
import uk.ac.glam.wcsclient.wcs111.DocumentRoot;
import uk.ac.glam.wcsclient.wcs111.util.Wcs111XMLProcessor;

public class WCS111 extends WebCoverageService {

	private CapabilitiesType capabilitiesType;
	private Wcs111XMLProcessor processor = new Wcs111XMLProcessor();
	private static final Logger LOGGER = Logger.getLogger("wcsclient");

	public WCS111(String url) throws IOException {
		super(url);
		Resource r = processor.load(url, null);
		DocumentRoot root = (DocumentRoot)r.getContents().get(0);
		capabilitiesType = root.getCapabilities();
	}

	public CapabilitiesType getCapabilities() {
		return capabilitiesType;
	}
	
	public CoverageDescriptionType describeCoverage(String identifier) throws IOException {
		
		String url = getServiceURL() + "?REQUEST=DescribeCoverage";
		// only use 1.1.1 for now
		url += "&VERSION=1.1.1";
		url += "&IDENTIFIERS=" + identifier;
		url += "&SERVICE=wcs";
		
		Resource r = processor.load(url, null);
		DocumentRoot root = (DocumentRoot) r.getContents().get(0);
		//We've only requested one coverage description
		return root.getCoverageDescriptions().getCoverageDescription().get(0);
	}
	
	public StoredCoverage getCoverageAndStore(String identifier, String bbox, String format) throws IOException {
		String url = getServiceURL() + "?SERVICE=WCS&REQUEST=GetCoverage&VERSION=1.1.1";
		url += "&IDENTIFIER=" + identifier;
		url += "&BOUNDINGBOX=" + bbox;
		url += "&FORMAT=" + format;
		url += "&STORE=true";
		
		LOGGER.info("Making GetCoverage request to: " + url);
		
		Resource r = processor.load(url, null);
		
		Object root = r.getContents().get(0);
		if (root instanceof DocumentRoot) {
			ReferenceGroupType coverage = ((DocumentRoot)root).getCoverages().getCoverage().get(0);
			return new StoredCoverage(coverage);
		} else if (root instanceof uk.ac.glam.wcsclient.ows110.DocumentRoot) {
			// Probably an exception
			// TODO: make suitable exception
		}
		return null;
	}
	
	public CoverageSummaryType getCoverageSummary(String identifier) {
		List<CoverageSummaryType> covSummaries = capabilitiesType.getContents().getCoverageSummary();
		for (Iterator<CoverageSummaryType> iterator = covSummaries.iterator(); iterator.hasNext();) {
			CoverageSummaryType coverageSummaryType = iterator
					.next();
			if (coverageSummaryType.getIdentifier().equals(identifier))
				return coverageSummaryType;
		}
		return null;
	}

}
