package uk.ac.glam.wcsclient;

import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		String url = "http://li199-25.members.linode.com:8080/geoserver/wcs?request=GetCapabilities&version=1.1.1&SERVICE=WCS";
		try {
			WebCoverageService wcs = WebCoverageService.createWebCoverageService(url);
			//CoverageDescriptionType cds = ((WCS111) wcs).describeCoverage("1azxzennwepp3");
			StoredCoverage cov = ((WCS111) wcs).getCoverageAndStore("sf:sfdem", "589980.0,913700.0,609000.0,4928010.0,urn:ogc:def:crs:EPSG::26713", 
					"geotiff");
			String href = cov.getCoverageHref();
			System.out.println(href);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
