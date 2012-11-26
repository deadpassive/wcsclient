package uk.ac.glam.wcsclient;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import net.opengis.ows11.ReferenceGroupType;
import net.opengis.wcs11.CapabilitiesType;
import net.opengis.wcs11.CoverageDescriptionType;
import net.opengis.wcs11.CoverageSummaryType;
import net.opengis.wcs11.CoveragesType;
import org.geotools.wcs111.WCSConfiguration;
import org.geotools.xml.Configuration;
import org.geotools.xml.Parser;
import org.xml.sax.SAXException;

public class WCS111 extends WebCoverageService {

    private CapabilitiesType capabilitiesType;
    private static final Logger LOGGER = Logger.getLogger("wcsclient");
    private final Configuration configuration = new WCSConfiguration();

    public WCS111(String urlString) throws IOException, SAXException, ParserConfigurationException {
        super(urlString);
        

        URL url = new URL(urlString);
        Parser parser = new Parser(configuration);
        capabilitiesType = (CapabilitiesType) parser.parse(url.openStream());

    }

    public CapabilitiesType getCapabilities() {
        return capabilitiesType;
    }

    public CoverageDescriptionType describeCoverage(String identifier) throws IOException, SAXException, ParserConfigurationException {

        String urlString = getServiceURL() + "?REQUEST=DescribeCoverage";
        // only use 1.1.1 for now
        urlString += "&VERSION=1.1.1";
        urlString += "&IDENTIFIERS=" + identifier;
        urlString += "&SERVICE=wcs";
        
        URL url = new URL(urlString);
        Parser parser = new Parser(configuration);
        return (CoverageDescriptionType) parser.parse(url.openStream());
    }

    public StoredCoverage getCoverageAndStore(String identifier, String bbox, String format) throws IOException, SAXException, ParserConfigurationException {
        String urlString = getServiceURL() + "?SERVICE=WCS&REQUEST=GetCoverage&VERSION=1.1.1";
        urlString += "&IDENTIFIER=" + identifier;
        urlString += "&BOUNDINGBOX=" + bbox;
        urlString += "&FORMAT=" + format;
        urlString += "&STORE=true";

        LOGGER.info("Making GetCoverage request to: " + urlString);
        
        URL url = new URL(urlString);
        Parser parser = new Parser(configuration);
        CoveragesType coverages =  (CoveragesType) parser.parse(url.openStream());
        
        return new StoredCoverage((ReferenceGroupType)coverages.getCoverage().get(0));
    }

    public CoverageSummaryType getCoverageSummary(String identifier) {
        List<CoverageSummaryType> covSummaries = capabilitiesType.getContents().getCoverageSummary();
        for (Iterator<CoverageSummaryType> iterator = covSummaries.iterator(); iterator.hasNext();) {
            CoverageSummaryType coverageSummaryType = iterator
                    .next();
            if (coverageSummaryType.getIdentifier().equals(identifier)) {
                return coverageSummaryType;
            }
        }
        return null;
    }
}
