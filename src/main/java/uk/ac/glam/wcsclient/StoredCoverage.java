package uk.ac.glam.wcsclient;

import net.opengis.ows11.ReferenceGroupType;

public class StoredCoverage {

	private ReferenceGroupType coverageRef;

	protected StoredCoverage(ReferenceGroupType coverageRef) {
		this.coverageRef = coverageRef;
	}
	
	public String getCoverageHref() {
            // TODO: do the necessary cast
		//return coverageRef.getAbstractReferenceBase().get(0).getHref();
                return null;
	}
}
