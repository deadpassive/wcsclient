package uk.ac.glam.wcsclient;

import uk.ac.glam.wcsclient.ows110.ReferenceGroupType;

public class StoredCoverage {

	private ReferenceGroupType coverageRef;

	protected StoredCoverage(ReferenceGroupType coverageRef) {
		this.coverageRef = coverageRef;
	}
	
	public String getCoverageHref() {
		return coverageRef.getAbstractReferenceBase().get(0).getHref();
	}
}
