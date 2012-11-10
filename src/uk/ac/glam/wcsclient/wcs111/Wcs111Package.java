/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uk.ac.glam.wcsclient.wcs111;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import uk.ac.glam.wcsclient.ows110.Ows110Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * This XML Schema Document defines the DescribeCoverage operation request and response XML elements and types, used by the OGC Web Coverage Service (WCS). 
 * 		Copyright (c) 2007 Open Geospatial Consortium, Inc, All Rights Reserved. 
 * This XML Schema Document encodes the elements and types that are shared by multiple WCS operations. 
 * 		Copyright (c) 2007 Open Geospatial Consortium, Inc, All Rights Reserved. 
 * Top level GML schema
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Basic support for tracking moving objects and objects with changing state.     
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * GML Feature schema. 		      
 *     Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Extends the units.xsd and basicTypes.xsd schemas with types for recording measures using specific types of units, especially the measures and units needed for coordinate reference systems and coordinate operations. The specific unit types encoded are length, angle, scale factor, time, area, volume, speed, and grid length. This schema allows angle values to be recorded as single numbers or in degree-minute-second format. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		Parts of this schema are based on Subclause 6.5.7 of ISO/CD 19103 Geographic information - Conceptual schema language, on Subclause A.5.2.2.3 of ISO/CD 19118 Geographic information - Encoding, and on Subclause 4.7 of OpenGIS Recommendation Paper OGC 02-007r4 Units of Measure Use and Definition Recommendations.
 * Builds on gmlBase.xsd to encode units of measure (or uom), including definitions of units of measure and dictionaries of such definitions. GML 3.0 candidate schema, primary editor: Arliss Whiteside. Last updated 2005-06-22.
 * 	Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 	Parts of this schema are based on Subclause 6.5.7 of ISO/CD 19103 Geographic information - Conceptual schema language, on Subclause A.5.2.2.3 of ISO/CD 19118 Geographic information - Encoding, and on most of OpenGIS Recommendation Paper OGC 02-007r4 Units of Measure Use and Definition Recommendations.
 * 
 * 			Dictionary schema for GML 3.1.1 
 * 			Components to support the lists of definitions.  
 *     Copyright (c) 2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * GML base schema for GML 3
 * 		Components to support the GML encoding model.  
 * 		The abstract Schematron rules can be used by any schema that includes gmlBase.  
 * 		Copyright (c) 2001-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 
 *     Generic simpleContent components for use in GML 
 *     Copyright (c) 2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 *     
 * 
 * 			GML 3.0 candidate xlinks schema. Copyright (c) 2001 OGC, All Rights Reserved.
 * 		
 * The temporal schema for GML 3.1 provides constructs for handling time-varying spatial data. 
 *     This schema reflects a partial implementation of the model described in ISO 19108:2002. 
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * This schema defines "direction" element and type.
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 
 * 	Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * GML Coverage schema. 
 *         Copyright (c) 2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * GML conformant schema for Values in which the  
 * 		    * scalar Value types and lists have their values recorded in simpleContent elements 
 * 		    * complex Value types are built recursively
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Grid geometries
 *     A subset of implicit geometries
 *     Designed for use with GML Coverage schema, but maybe useful elsewhere as well.  
 *     
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * How to encode coordinate reference system definitions. Builds on referenceSystems.xsd to encode the data needed to define coordinate reference systems, including the specific subtypes of coordinate reference systems. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Coordinate Reference System (SC_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates, with the exception of the abstract "SC_CRS" class. The "SC_CRS" class is encoded in referenceSystems.xsd, to eliminate the (circular) references from coordinateOperations.xsd to coordinateReferenceSystems.xsd. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * How to encode coordinate system definitions. Builds on referenceSystems.xsd to encode the data needed to define coordinate systems, including the specific subtypes of coordinate systems. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Coordinate System (CS_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * How to encode reference system definitions. Builds on several other parts of GML 3 to encode the data needed to define reference systems. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Reference System (RS_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. The SC_CRS class is also encoded here, to eliminate the (circular) references from coordinateOperations.xsd to coordinateReferenceSystems.xsd. The RS_SpatialReferenceSystemUsingGeographicIdentifier class is not encoded, since it is not applicable to coordinate positions. The CI_Citation class is not directly encoded, since such information can be included as metaDataProperty elements which are optionally allowed. A modified version of the EX_Extent (DataType) class from ISO 19115 is currently encoded here, using GML 3 schema types. (A more extensive version of the EX_Extent package might be XML encoded in the future, probably in a separate extent.xsd schema.)
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111.
 * How to encode datum definitions. Builds on referenceSystems.xsd to encode the data needed to define datums, including the specific subtypes of datums. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Datum (CD_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * How to encode coordinate operation definitions. Builds on referenceSystems.xsd to encode the data needed to define coordinate operations, including Transformations, Conversions, and other specific subtypes of operations. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Coordinate Operation (CC_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * How to encode positional data quality information. Builds on units.xsd to encode the data needed to describe the positional accuracy of coordinate operations. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Data Quality (DQ) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * Observation schema for GML 3.1     
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Default Style schema for GML 3.1.0
 * 		Copyright (c) 2001-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		Compliance: reference to ISO Specifications
 * The Temporal Reference Systems schema for GML 3.1 provides constructs for handling various styles of temporal reference system. 
 *     This schema reflects a partial implementation of the model described in ISO 19108:2002. 
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * The temporal topology schema for ISO19136 provides constructs for handling topological complexes and 
 * 		temporal feature relationships. 
 * 		Temporal geometric characteristics of features are represented as instants and periods. 
 * 		While, temporal context of features that does not relate to the position of time is described as connectivity relationships 
 * 		among instants and periods. These relationships are called temporal topology as they do not change in time, 
 * 		as long as the direction of time does not change. 
 * 		It is used effectively in the case of describing a family tree expressing evolution of species, an ecological cycle, 
 * 		a lineage of lands or buildings, or a history of separation and merger of administrative boundaries.
 * 		This schema reflects a partial yet consistent implementation of the model described in ISO 19108:2002. 
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * This XML Schema Document defines a GridCRS element that is much simpler but otherwise similar to a specialization of gml:DerivedCRS. This GridCRS roughly corresponds to the CV_RectifiedGrid class in ISO 19123, without inheritance from CV_Grid. This GridCRS is designed for use by the OGC Web Coverage Service (WCS) and elsewhere. 
 * 		This XML Schema Document is not a GML Application Schema, although it uses the GML 3.1.1 profile for WCS 1.1.1. 
 * 		Copyright (c) 2007 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document defines interpolation method elements and types, used by the OGC Web Coverage Service (WCS). 
 * 		Copyright (c) 2007 Open Geospatial Consortium, Inc, All Rights Reserved. 
 * This XML Schema Document includes and imports, directly and indirectly, all the XML Schemas defined by the OWS Common Implemetation Specification.
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document encodes the GetResourceByID operation request message. This typical operation is specified as a base for profiling in specific OWS specifications. For information on the allowed changes and limitations in such profiling, see Subclause 9.4.1 of the OWS Common specification.
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document encodes the parts of the MD_DataIdentification class of ISO 19115 (OGC Abstract Specification Topic 11) which are expected to be used for most datasets. This Schema also encodes the parts of this class that are expected to be useful for other metadata. Both may be used within the Contents section of OWS service metadata (Capabilities) documents.
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document encodes various parameters and parameter types that can be used in OWS operation requests and responses.
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document encodes the parts of ISO 19115 used by the common "ServiceIdentification" and "ServiceProvider" sections of the GetCapabilities operation response, known as the service metadata XML document. The parts encoded here are the MD_Keywords, CI_ResponsibleParty, and related classes. The UML package prefixes were omitted from XML names, and the XML element names were all capitalized, for consistency with other OWS Schemas. This document also provides a simple coding of text in multiple languages, simplified from Annex J of ISO 19115.
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document defines the GetCapabilities operation request and response XML elements and types, which are common to all OWSs. This XML Schema shall be edited by each OWS, for example, to specify a specific value for the "service" attribute.
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document encodes the common "ServiceIdentification" section of the GetCapabilities operation response, known as the Capabilities XML document. This section encodes the SV_ServiceIdentification class of ISO 19119 (OGC Abstract Specification Topic 12). 
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document encodes the common "ServiceProvider" section of the GetCapabilities operation response, known as the Capabilities XML document. This section encodes the SV_ServiceProvider class of ISO 19119 (OGC Abstract Specification Topic 12). 
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document encodes the basic contents of the "OperationsMetadata" section of the GetCapabilities operation response, also known as the Capabilities XML document.
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document encodes the allowed values (or domain) of a quantity, often for an input or output parameter to an OWS. Such a parameter is sometimes called a variable, quantity, literal, or typed literal. Such a parameter can use one of many data types, including double, integer, boolean, string, or URI. The allowed values can also be encoded for a quantity that is not explicit or not transferred, but is constrained by a server implementation.
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document encodes the Exception Report response to all OWS operations.
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * 
 *    See http://www.w3.org/XML/1998/namespace.html and
 *    http://www.w3.org/TR/REC-xml for information about this namespace.
 * 
 *     This schema document describes the XML namespace, in a form
 *     suitable for import by other schema documents.  
 * 
 *     Note that local names in this namespace are intended to be defined
 *     only by the World Wide Web Consortium or its subgroups.  The
 *     following names are currently defined in this namespace and should
 *     not be used with conflicting semantics by any Working Group,
 *     specification, or document instance:
 * 
 *     base (as an attribute name): denotes an attribute whose value
 *          provides a URI to be used as the base for interpreting any
 *          relative URIs in the scope of the element on which it
 *          appears; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML Base specification.
 * 
 *     id   (as an attribute name): denotes an attribute whose value
 *          should be interpreted as if declared to be of type ID.
 *          This name is reserved by virtue of its definition in the
 *          xml:id specification.
 * 
 *     lang (as an attribute name): denotes an attribute whose value
 *          is a language code for the natural language of the content of
 *          any element; its value is inherited.  This name is reserved
 *          by virtue of its definition in the XML specification.
 *   
 *     space (as an attribute name): denotes an attribute whose
 *          value is a keyword indicating what whitespace processing
 *          discipline is intended for the content of the element; its
 *          value is inherited.  This name is reserved by virtue of its
 *          definition in the XML specification.
 * 
 *     Father (in any context at all): denotes Jon Bosak, the chair of 
 *          the original XML Working Group.  This name is reserved by 
 *          the following decision of the W3C XML Plenary and 
 *          XML Coordination groups:
 * 
 *              In appreciation for his vision, leadership and dedication
 *              the W3C XML Plenary on this 10th day of February, 2000
 *              reserves for Jon Bosak in perpetuity the XML name
 *              xml:Father
 *   
 * This schema defines attributes and an attribute group
 *         suitable for use by
 *         schemas wishing to allow xml:base, xml:lang, xml:space or xml:id
 *         attributes on elements they define.
 * 
 *         To enable this, such a schema must import this schema
 *         for the XML namespace, e.g. as follows:
 *         &lt;schema . . .&gt;
 *          . . .
 *          &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                     schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 * 
 *         Subsequently, qualified reference to any of the attributes
 *         or the group defined below will have the desired effect, e.g.
 * 
 *         &lt;type . . .&gt;
 *          . . .
 *          &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *  
 *          will define a type which will schema-validate an instance
 *          element with any of those attributes
 * In keeping with the XML Schema WG's standard versioning
 *    policy, this schema document will persist at
 *    http://www.w3.org/2007/08/xml.xsd.
 *    At the date of issue it can also be found at
 *    http://www.w3.org/2001/xml.xsd.
 *    The schema document at that URI may however change in the future,
 *    in order to remain compatible with the latest version of XML Schema
 *    itself, or with the XML namespace itself.  In other words, if the XML
 *    Schema or XML namespaces change, the version of this document at
 *    http://www.w3.org/2001/xml.xsd will change
 *    accordingly; the version at
 *    http://www.w3.org/2007/08/xml.xsd will not change.
 *   
 * This XML Schema  Document encodes the typical Contents section of an OWS service metadata (Capabilities) document. This  Schema can be built upon to define the Contents section for a specific OWS. If the ContentsBaseType in this XML Schema cannot be restricted and extended to define the Contents section for a specific OWS, all other relevant parts defined in owsContents.xsd shall be used by the "ContentsType" in the wxsContents.xsd prepared for the specific OWS.
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document specifies types and elements for input and output of operation data, allowing including multiple data items with each data item either included or referenced. The contents of each type and element specified here can be restricted and/or extended for each use in a specific OWS specification.
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * This XML Schema Document specifies types and elements for document or resource references and for package manifests that contain multiple references. The contents of each type and element specified here can be restricted and/or extended for each use in a specific OWS specification.
 * 		Copyright (c) 2006 Open Geospatial Consortium, Inc. All Rights Reserved. 
 * <!-- end-model-doc -->
 * @see uk.ac.glam.wcsclient.wcs111.Wcs111Factory
 * @model kind="package"
 *        annotation="urn:opengis:specification:gml:schema-xsd:gml:3.1.1 appinfo='gml.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:feature:v3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1 appinfo='geometryBasic2d.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1 appinfo='geometryBasic0d1d.xsd\r\n\r\n\t\t\t<sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\">Schematron validation</sch:title>\r\n\t\t\t<sch:pattern name=\"Check SRS tags\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\r\n\t\t\t\t<sch:rule abstract=\"true\" id=\"CRSLabels\">\r\n\t\t\t\t\t<sch:report test=\"not(@srsDimension) or @srsName\">The presence of a dimension attribute implies the presence of the srsName attribute.</sch:report>\r\n\t\t\t\t\t<sch:report test=\"not(@axisLabels) or @srsName\">The presence of an axisLabels attribute implies the presence of the srsName attribute.</sch:report>\r\n\t\t\t\t\t<sch:report test=\"not(@uomLabels) or @srsName\">The presence of an uomLabels attribute implies the presence of the srsName attribute.</sch:report>\r\n\t\t\t\t\t<sch:report test=\"(not(@uomLabels) and not(@axisLabels)) or (@uomLabels and @axisLabels)\">The presence of an uomLabels attribute implies the presence of the axisLabels attribute and vice versa.</sch:report>\r\n\t\t\t\t</sch:rule>\r\n\t\t\t</sch:pattern>\r\n\t\t\t<sch:pattern name=\"Check Dimension\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\r\n\t\t\t\t<sch:rule abstract=\"true\" id=\"Count\">\r\n\t\t\t\t\t<sch:report test=\"not(@count) or @srsDimension\">The presence of a count attribute implies the presence of the dimension attribute.</sch:report>\r\n\t\t\t\t</sch:rule>\r\n\t\t\t</sch:pattern>\r\n\t\t'"
 *        annotation="urn:opengis:specification:gml:schema-measures:3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-units:3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1 appinfo='\r\n\t\t\t<sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\">Schematron validation</sch:title>\r\n\t\t\t<sch:ns prefix=\"gml\" uri=\"http://www.opengis.net/gml\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/>\r\n\t\t\t<sch:ns prefix=\"xlink\" uri=\"http://www.w3.org/1999/xlink\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/>\r\n\t\t\t<sch:pattern name=\"Check either href or content not both\" xmlns:sch=\"http://www.ascc.net/xml/schematron\">\r\n\t\t\t\t<sch:rule abstract=\"true\" id=\"hrefOrContent\">\r\n\t\t\t\t\t<sch:report test=\"@xlink:href and (*|text())\">Property element may not carry both a reference to an object and contain an object.</sch:report>\r\n\t\t\t\t\t<sch:assert test=\"@xlink:href | (*|text())\">Property element must either carry a reference to an object or contain an object.</sch:assert>\r\n\t\t\t\t</sch:rule>\r\n\t\t\t</sch:pattern>\r\n\t\t'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1 appinfo='basicTypes.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xlinks:v3.0c2 appinfo='xlinks.xsd v3.0b2 2001-07'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:temporal:3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:direction:3.1.1 appinfo='direction.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:topology:3.1.1 appinfo='topology.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1 appinfo='geometryComplexes.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1 appinfo='geometryAggregates.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1 appinfo='geometryPrimitives.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coverage:3.1.1 appinfo='coverage.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1 appinfo='valueObjects.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:grids:3.1.1 appinfo='grids.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:datums:3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:observation:3.1.1 appinfo='observation.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-defaultStyle:v3.1.0 appinfo='defaultStyle.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1 appinfo='null'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1 appinfo='null'"
 *        annotation="http://www.w3.org/XML/1998/namespace lang='en'"
 * @generated
 */
public interface Wcs111Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wcs111";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/wcs/1.1.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wcs111";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Wcs111Package eINSTANCE = uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl.init();

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.AvailableKeysTypeImpl <em>Available Keys Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.AvailableKeysTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getAvailableKeysType()
	 * @generated
	 */
	int AVAILABLE_KEYS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_KEYS_TYPE__KEY = 0;

	/**
	 * The number of structural features of the '<em>Available Keys Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABLE_KEYS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.AxisSubsetTypeImpl <em>Axis Subset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.AxisSubsetTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getAxisSubsetType()
	 * @generated
	 */
	int AXIS_SUBSET_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_SUBSET_TYPE__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_SUBSET_TYPE__KEY = 1;

	/**
	 * The number of structural features of the '<em>Axis Subset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_SUBSET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.AxisTypeImpl <em>Axis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.AxisTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getAxisType()
	 * @generated
	 */
	int AXIS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__TITLE = Ows110Package.DESCRIPTION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__ABSTRACT = Ows110Package.DESCRIPTION_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__KEYWORDS = Ows110Package.DESCRIPTION_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Available Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__AVAILABLE_KEYS = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__MEANING = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__DATA_TYPE = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>UOM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__UOM = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__REFERENCE_SYSTEM = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__METADATA = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE__IDENTIFIER = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Axis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AXIS_TYPE_FEATURE_COUNT = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.CapabilitiesTypeImpl <em>Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.CapabilitiesTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getCapabilitiesType()
	 * @generated
	 */
	int CAPABILITIES_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE__SERVICE_IDENTIFICATION = Ows110Package.CAPABILITIES_BASE_TYPE__SERVICE_IDENTIFICATION;

	/**
	 * The feature id for the '<em><b>Service Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE__SERVICE_PROVIDER = Ows110Package.CAPABILITIES_BASE_TYPE__SERVICE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Operations Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE__OPERATIONS_METADATA = Ows110Package.CAPABILITIES_BASE_TYPE__OPERATIONS_METADATA;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE__UPDATE_SEQUENCE = Ows110Package.CAPABILITIES_BASE_TYPE__UPDATE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE__VERSION = Ows110Package.CAPABILITIES_BASE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE__CONTENTS = Ows110Package.CAPABILITIES_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITIES_TYPE_FEATURE_COUNT = Ows110Package.CAPABILITIES_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.ContentsTypeImpl <em>Contents Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.ContentsTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getContentsType()
	 * @generated
	 */
	int CONTENTS_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Coverage Summary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE__COVERAGE_SUMMARY = 0;

	/**
	 * The feature id for the '<em><b>Supported CRS</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE__SUPPORTED_CRS = 1;

	/**
	 * The feature id for the '<em><b>Supported Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE__SUPPORTED_FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Other Source</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE__OTHER_SOURCE = 3;

	/**
	 * The number of structural features of the '<em>Contents Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENTS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageDescriptionsTypeImpl <em>Coverage Descriptions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.CoverageDescriptionsTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getCoverageDescriptionsType()
	 * @generated
	 */
	int COVERAGE_DESCRIPTIONS_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Coverage Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DESCRIPTIONS_TYPE__COVERAGE_DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Coverage Descriptions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DESCRIPTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageDescriptionTypeImpl <em>Coverage Description Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.CoverageDescriptionTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getCoverageDescriptionType()
	 * @generated
	 */
	int COVERAGE_DESCRIPTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DESCRIPTION_TYPE__TITLE = Ows110Package.DESCRIPTION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DESCRIPTION_TYPE__ABSTRACT = Ows110Package.DESCRIPTION_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DESCRIPTION_TYPE__KEYWORDS = Ows110Package.DESCRIPTION_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DESCRIPTION_TYPE__IDENTIFIER = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DESCRIPTION_TYPE__METADATA = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DESCRIPTION_TYPE__DOMAIN = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DESCRIPTION_TYPE__RANGE = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Supported CRS</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DESCRIPTION_TYPE__SUPPORTED_CRS = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Supported Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DESCRIPTION_TYPE__SUPPORTED_FORMAT = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Coverage Description Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DESCRIPTION_TYPE_FEATURE_COUNT = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageDomainTypeImpl <em>Coverage Domain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.CoverageDomainTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getCoverageDomainType()
	 * @generated
	 */
	int COVERAGE_DOMAIN_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Spatial Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DOMAIN_TYPE__SPATIAL_DOMAIN = 0;

	/**
	 * The feature id for the '<em><b>Temporal Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DOMAIN_TYPE__TEMPORAL_DOMAIN = 1;

	/**
	 * The number of structural features of the '<em>Coverage Domain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_DOMAIN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.CoveragesTypeImpl <em>Coverages Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.CoveragesTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getCoveragesType()
	 * @generated
	 */
	int COVERAGES_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGES_TYPE__COVERAGE = 0;

	/**
	 * The number of structural features of the '<em>Coverages Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageSummaryTypeImpl <em>Coverage Summary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.CoverageSummaryTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getCoverageSummaryType()
	 * @generated
	 */
	int COVERAGE_SUMMARY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_SUMMARY_TYPE__TITLE = Ows110Package.DESCRIPTION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_SUMMARY_TYPE__ABSTRACT = Ows110Package.DESCRIPTION_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_SUMMARY_TYPE__KEYWORDS = Ows110Package.DESCRIPTION_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_SUMMARY_TYPE__METADATA = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>WGS84 Bounding Box</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_SUMMARY_TYPE__WGS84_BOUNDING_BOX = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supported CRS</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_SUMMARY_TYPE__SUPPORTED_CRS = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Supported Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_SUMMARY_TYPE__SUPPORTED_FORMAT = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Coverage Summary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_SUMMARY_TYPE__COVERAGE_SUMMARY = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_SUMMARY_TYPE__IDENTIFIER = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Identifier1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_SUMMARY_TYPE__IDENTIFIER1 = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Coverage Summary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COVERAGE_SUMMARY_TYPE_FEATURE_COUNT = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.RequestBaseTypeImpl <em>Request Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.RequestBaseTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getRequestBaseType()
	 * @generated
	 */
	int REQUEST_BASE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_BASE_TYPE__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_BASE_TYPE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Request Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUEST_BASE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.DescribeCoverageTypeImpl <em>Describe Coverage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.DescribeCoverageTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getDescribeCoverageType()
	 * @generated
	 */
	int DESCRIBE_COVERAGE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_COVERAGE_TYPE__SERVICE = REQUEST_BASE_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_COVERAGE_TYPE__VERSION = REQUEST_BASE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_COVERAGE_TYPE__IDENTIFIER = REQUEST_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Describe Coverage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_COVERAGE_TYPE_FEATURE_COUNT = REQUEST_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.DocumentRootImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Available Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AVAILABLE_KEYS = 3;

	/**
	 * The feature id for the '<em><b>Axis Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AXIS_SUBSET = 4;

	/**
	 * The feature id for the '<em><b>Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPABILITIES = 5;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTENTS = 6;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COVERAGE = 7;

	/**
	 * The feature id for the '<em><b>Coverage Descriptions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COVERAGE_DESCRIPTIONS = 8;

	/**
	 * The feature id for the '<em><b>Coverages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COVERAGES = 9;

	/**
	 * The feature id for the '<em><b>Coverage Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COVERAGE_SUMMARY = 10;

	/**
	 * The feature id for the '<em><b>Describe Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIBE_COVERAGE = 11;

	/**
	 * The feature id for the '<em><b>Get Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CAPABILITIES = 12;

	/**
	 * The feature id for the '<em><b>Get Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_COVERAGE = 13;

	/**
	 * The feature id for the '<em><b>Grid Base CRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRID_BASE_CRS = 14;

	/**
	 * The feature id for the '<em><b>Grid CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRID_CRS = 15;

	/**
	 * The feature id for the '<em><b>Grid CS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRID_CS = 16;

	/**
	 * The feature id for the '<em><b>Grid Offsets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRID_OFFSETS = 17;

	/**
	 * The feature id for the '<em><b>Grid Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRID_ORIGIN = 18;

	/**
	 * The feature id for the '<em><b>Grid Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRID_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IDENTIFIER = 20;

	/**
	 * The feature id for the '<em><b>Interpolation Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERPOLATION_METHODS = 21;

	/**
	 * The feature id for the '<em><b>Temporal Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPORAL_DOMAIN = 22;

	/**
	 * The feature id for the '<em><b>Temporal Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEMPORAL_SUBSET = 23;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 24;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.DomainSubsetTypeImpl <em>Domain Subset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.DomainSubsetTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getDomainSubsetType()
	 * @generated
	 */
	int DOMAIN_SUBSET_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Bounding Box Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SUBSET_TYPE__BOUNDING_BOX_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SUBSET_TYPE__BOUNDING_BOX = 1;

	/**
	 * The feature id for the '<em><b>Temporal Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SUBSET_TYPE__TEMPORAL_SUBSET = 2;

	/**
	 * The number of structural features of the '<em>Domain Subset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_SUBSET_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.FieldSubsetTypeImpl <em>Field Subset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.FieldSubsetTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getFieldSubsetType()
	 * @generated
	 */
	int FIELD_SUBSET_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SUBSET_TYPE__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Interpolation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SUBSET_TYPE__INTERPOLATION_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Axis Subset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SUBSET_TYPE__AXIS_SUBSET = 2;

	/**
	 * The number of structural features of the '<em>Field Subset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_SUBSET_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.FieldTypeImpl <em>Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.FieldTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getFieldType()
	 * @generated
	 */
	int FIELD_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__TITLE = Ows110Package.DESCRIPTION_TYPE__TITLE;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__ABSTRACT = Ows110Package.DESCRIPTION_TYPE__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__KEYWORDS = Ows110Package.DESCRIPTION_TYPE__KEYWORDS;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__IDENTIFIER = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__DEFINITION = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Null Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__NULL_VALUE = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interpolation Methods</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__INTERPOLATION_METHODS = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE__AXIS = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE_FEATURE_COUNT = Ows110Package.DESCRIPTION_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.GetCapabilitiesTypeImpl <em>Get Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.GetCapabilitiesTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getGetCapabilitiesType()
	 * @generated
	 */
	int GET_CAPABILITIES_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Accept Versions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__ACCEPT_VERSIONS = Ows110Package.GET_CAPABILITIES_TYPE__ACCEPT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__SECTIONS = Ows110Package.GET_CAPABILITIES_TYPE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Accept Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__ACCEPT_FORMATS = Ows110Package.GET_CAPABILITIES_TYPE__ACCEPT_FORMATS;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__UPDATE_SEQUENCE = Ows110Package.GET_CAPABILITIES_TYPE__UPDATE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__SERVICE = Ows110Package.GET_CAPABILITIES_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE_FEATURE_COUNT = Ows110Package.GET_CAPABILITIES_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.GetCoverageTypeImpl <em>Get Coverage Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.GetCoverageTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getGetCoverageType()
	 * @generated
	 */
	int GET_COVERAGE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COVERAGE_TYPE__SERVICE = REQUEST_BASE_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COVERAGE_TYPE__VERSION = REQUEST_BASE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COVERAGE_TYPE__IDENTIFIER = REQUEST_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COVERAGE_TYPE__DOMAIN_SUBSET = REQUEST_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Range Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COVERAGE_TYPE__RANGE_SUBSET = REQUEST_BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COVERAGE_TYPE__OUTPUT = REQUEST_BASE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Get Coverage Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_COVERAGE_TYPE_FEATURE_COUNT = REQUEST_BASE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.GridCrsTypeImpl <em>Grid Crs Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.GridCrsTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getGridCrsType()
	 * @generated
	 */
	int GRID_CRS_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Srs Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CRS_TYPE__SRS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Grid Base CRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CRS_TYPE__GRID_BASE_CRS = 1;

	/**
	 * The feature id for the '<em><b>Grid Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CRS_TYPE__GRID_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Grid Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CRS_TYPE__GRID_ORIGIN = 3;

	/**
	 * The feature id for the '<em><b>Grid Offsets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CRS_TYPE__GRID_OFFSETS = 4;

	/**
	 * The feature id for the '<em><b>Grid CS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CRS_TYPE__GRID_CS = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CRS_TYPE__ID = 6;

	/**
	 * The number of structural features of the '<em>Grid Crs Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_CRS_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.ImageCRSRefTypeImpl <em>Image CRS Ref Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.ImageCRSRefTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getImageCRSRefType()
	 * @generated
	 */
	int IMAGE_CRS_REF_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Image CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CRS_REF_TYPE__IMAGE_CRS = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CRS_REF_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CRS_REF_TYPE__ARCROLE = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CRS_REF_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Remote Schema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CRS_REF_TYPE__REMOTE_SCHEMA = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CRS_REF_TYPE__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CRS_REF_TYPE__SHOW = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CRS_REF_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CRS_REF_TYPE__TYPE = 8;

	/**
	 * The number of structural features of the '<em>Image CRS Ref Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CRS_REF_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.InterpolationMethodBaseTypeImpl <em>Interpolation Method Base Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.InterpolationMethodBaseTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getInterpolationMethodBaseType()
	 * @generated
	 */
	int INTERPOLATION_METHOD_BASE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION_METHOD_BASE_TYPE__VALUE = Ows110Package.CODE_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Code Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION_METHOD_BASE_TYPE__CODE_SPACE = Ows110Package.CODE_TYPE__CODE_SPACE;

	/**
	 * The number of structural features of the '<em>Interpolation Method Base Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION_METHOD_BASE_TYPE_FEATURE_COUNT = Ows110Package.CODE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.InterpolationMethodsTypeImpl <em>Interpolation Methods Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.InterpolationMethodsTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getInterpolationMethodsType()
	 * @generated
	 */
	int INTERPOLATION_METHODS_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Interpolation Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION_METHODS_TYPE__INTERPOLATION_METHOD = 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION_METHODS_TYPE__DEFAULT = 1;

	/**
	 * The number of structural features of the '<em>Interpolation Methods Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION_METHODS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.InterpolationMethodTypeImpl <em>Interpolation Method Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.InterpolationMethodTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getInterpolationMethodType()
	 * @generated
	 */
	int INTERPOLATION_METHOD_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION_METHOD_TYPE__VALUE = INTERPOLATION_METHOD_BASE_TYPE__VALUE;

	/**
	 * The feature id for the '<em><b>Code Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION_METHOD_TYPE__CODE_SPACE = INTERPOLATION_METHOD_BASE_TYPE__CODE_SPACE;

	/**
	 * The feature id for the '<em><b>Null Resistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION_METHOD_TYPE__NULL_RESISTANCE = INTERPOLATION_METHOD_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interpolation Method Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERPOLATION_METHOD_TYPE_FEATURE_COUNT = INTERPOLATION_METHOD_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.OutputTypeImpl <em>Output Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.OutputTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getOutputType()
	 * @generated
	 */
	int OUTPUT_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Grid CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__GRID_CRS = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE__STORE = 2;

	/**
	 * The number of structural features of the '<em>Output Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.RangeSubsetTypeImpl <em>Range Subset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.RangeSubsetTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getRangeSubsetType()
	 * @generated
	 */
	int RANGE_SUBSET_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Field Subset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SUBSET_TYPE__FIELD_SUBSET = 0;

	/**
	 * The number of structural features of the '<em>Range Subset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_SUBSET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.RangeTypeImpl <em>Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.RangeTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getRangeType()
	 * @generated
	 */
	int RANGE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE__FIELD = 0;

	/**
	 * The number of structural features of the '<em>Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.SpatialDomainTypeImpl <em>Spatial Domain Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.SpatialDomainTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getSpatialDomainType()
	 * @generated
	 */
	int SPATIAL_DOMAIN_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Bounding Box Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_DOMAIN_TYPE__BOUNDING_BOX_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_DOMAIN_TYPE__BOUNDING_BOX = 1;

	/**
	 * The feature id for the '<em><b>Grid CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_DOMAIN_TYPE__GRID_CRS = 2;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_DOMAIN_TYPE__TRANSFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Image CRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_DOMAIN_TYPE__IMAGE_CRS = 4;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_DOMAIN_TYPE__POLYGON = 5;

	/**
	 * The number of structural features of the '<em>Spatial Domain Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_DOMAIN_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.TimePeriodTypeImpl <em>Time Period Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.TimePeriodTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getTimePeriodType()
	 * @generated
	 */
	int TIME_PERIOD_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Begin Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE__BEGIN_POSITION = 0;

	/**
	 * The feature id for the '<em><b>End Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE__END_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Time Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE__TIME_RESOLUTION = 2;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE__FRAME = 3;

	/**
	 * The number of structural features of the '<em>Time Period Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_PERIOD_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link uk.ac.glam.wcsclient.wcs111.impl.TimeSequenceTypeImpl <em>Time Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.glam.wcsclient.wcs111.impl.TimeSequenceTypeImpl
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getTimeSequenceType()
	 * @generated
	 */
	int TIME_SEQUENCE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SEQUENCE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Time Position</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SEQUENCE_TYPE__TIME_POSITION = 1;

	/**
	 * The feature id for the '<em><b>Time Period</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SEQUENCE_TYPE__TIME_PERIOD = 2;

	/**
	 * The number of structural features of the '<em>Time Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SEQUENCE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '<em>Identifier Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getIdentifierType()
	 * @generated
	 */
	int IDENTIFIER_TYPE = 29;

	/**
	 * The meta object id for the '<em>Interpolation Method Base Type Base</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getInterpolationMethodBaseTypeBase()
	 * @generated
	 */
	int INTERPOLATION_METHOD_BASE_TYPE_BASE = 30;

	/**
	 * The meta object id for the '<em>Time Duration Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getTimeDurationType()
	 * @generated
	 */
	int TIME_DURATION_TYPE = 31;


	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.AvailableKeysType <em>Available Keys Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Available Keys Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AvailableKeysType
	 * @generated
	 */
	EClass getAvailableKeysType();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.AvailableKeysType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Key</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AvailableKeysType#getKey()
	 * @see #getAvailableKeysType()
	 * @generated
	 */
	EAttribute getAvailableKeysType_Key();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.AxisSubsetType <em>Axis Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis Subset Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisSubsetType
	 * @generated
	 */
	EClass getAxisSubsetType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.AxisSubsetType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisSubsetType#getIdentifier()
	 * @see #getAxisSubsetType()
	 * @generated
	 */
	EAttribute getAxisSubsetType_Identifier();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.AxisSubsetType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Key</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisSubsetType#getKey()
	 * @see #getAxisSubsetType()
	 * @generated
	 */
	EAttribute getAxisSubsetType_Key();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.AxisType <em>Axis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Axis Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisType
	 * @generated
	 */
	EClass getAxisType();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.AxisType#getAvailableKeys <em>Available Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Available Keys</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisType#getAvailableKeys()
	 * @see #getAxisType()
	 * @generated
	 */
	EReference getAxisType_AvailableKeys();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.AxisType#getMeaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meaning</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisType#getMeaning()
	 * @see #getAxisType()
	 * @generated
	 */
	EReference getAxisType_Meaning();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.AxisType#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisType#getDataType()
	 * @see #getAxisType()
	 * @generated
	 */
	EReference getAxisType_DataType();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.AxisType#getUOM <em>UOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UOM</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisType#getUOM()
	 * @see #getAxisType()
	 * @generated
	 */
	EReference getAxisType_UOM();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.AxisType#getReferenceSystem <em>Reference System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference System</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisType#getReferenceSystem()
	 * @see #getAxisType()
	 * @generated
	 */
	EReference getAxisType_ReferenceSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.AxisType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisType#getMetadata()
	 * @see #getAxisType()
	 * @generated
	 */
	EReference getAxisType_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.AxisType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.AxisType#getIdentifier()
	 * @see #getAxisType()
	 * @generated
	 */
	EAttribute getAxisType_Identifier();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.CapabilitiesType <em>Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CapabilitiesType
	 * @generated
	 */
	EClass getCapabilitiesType();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.CapabilitiesType#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contents</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CapabilitiesType#getContents()
	 * @see #getCapabilitiesType()
	 * @generated
	 */
	EReference getCapabilitiesType_Contents();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.ContentsType <em>Contents Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contents Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ContentsType
	 * @generated
	 */
	EClass getContentsType();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.ContentsType#getCoverageSummary <em>Coverage Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coverage Summary</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ContentsType#getCoverageSummary()
	 * @see #getContentsType()
	 * @generated
	 */
	EReference getContentsType_CoverageSummary();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.ContentsType#getSupportedCRS <em>Supported CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported CRS</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ContentsType#getSupportedCRS()
	 * @see #getContentsType()
	 * @generated
	 */
	EAttribute getContentsType_SupportedCRS();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.ContentsType#getSupportedFormat <em>Supported Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Format</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ContentsType#getSupportedFormat()
	 * @see #getContentsType()
	 * @generated
	 */
	EAttribute getContentsType_SupportedFormat();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.ContentsType#getOtherSource <em>Other Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Source</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ContentsType#getOtherSource()
	 * @see #getContentsType()
	 * @generated
	 */
	EReference getContentsType_OtherSource();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.CoverageDescriptionsType <em>Coverage Descriptions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage Descriptions Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDescriptionsType
	 * @generated
	 */
	EClass getCoverageDescriptionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.CoverageDescriptionsType#getCoverageDescription <em>Coverage Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coverage Description</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDescriptionsType#getCoverageDescription()
	 * @see #getCoverageDescriptionsType()
	 * @generated
	 */
	EReference getCoverageDescriptionsType_CoverageDescription();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType <em>Coverage Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage Description Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType
	 * @generated
	 */
	EClass getCoverageDescriptionType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType#getIdentifier()
	 * @see #getCoverageDescriptionType()
	 * @generated
	 */
	EAttribute getCoverageDescriptionType_Identifier();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType#getMetadata()
	 * @see #getCoverageDescriptionType()
	 * @generated
	 */
	EReference getCoverageDescriptionType_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType#getDomain()
	 * @see #getCoverageDescriptionType()
	 * @generated
	 */
	EReference getCoverageDescriptionType_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType#getRange()
	 * @see #getCoverageDescriptionType()
	 * @generated
	 */
	EReference getCoverageDescriptionType_Range();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType#getSupportedCRS <em>Supported CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported CRS</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType#getSupportedCRS()
	 * @see #getCoverageDescriptionType()
	 * @generated
	 */
	EAttribute getCoverageDescriptionType_SupportedCRS();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType#getSupportedFormat <em>Supported Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Format</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDescriptionType#getSupportedFormat()
	 * @see #getCoverageDescriptionType()
	 * @generated
	 */
	EAttribute getCoverageDescriptionType_SupportedFormat();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.CoverageDomainType <em>Coverage Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage Domain Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDomainType
	 * @generated
	 */
	EClass getCoverageDomainType();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.CoverageDomainType#getSpatialDomain <em>Spatial Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial Domain</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDomainType#getSpatialDomain()
	 * @see #getCoverageDomainType()
	 * @generated
	 */
	EReference getCoverageDomainType_SpatialDomain();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.CoverageDomainType#getTemporalDomain <em>Temporal Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Domain</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageDomainType#getTemporalDomain()
	 * @see #getCoverageDomainType()
	 * @generated
	 */
	EReference getCoverageDomainType_TemporalDomain();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.CoveragesType <em>Coverages Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverages Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoveragesType
	 * @generated
	 */
	EClass getCoveragesType();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.CoveragesType#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coverage</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoveragesType#getCoverage()
	 * @see #getCoveragesType()
	 * @generated
	 */
	EReference getCoveragesType_Coverage();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.CoverageSummaryType <em>Coverage Summary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coverage Summary Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageSummaryType
	 * @generated
	 */
	EClass getCoverageSummaryType();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getMetadata()
	 * @see #getCoverageSummaryType()
	 * @generated
	 */
	EReference getCoverageSummaryType_Metadata();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getWGS84BoundingBox <em>WGS84 Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>WGS84 Bounding Box</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getWGS84BoundingBox()
	 * @see #getCoverageSummaryType()
	 * @generated
	 */
	EReference getCoverageSummaryType_WGS84BoundingBox();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getSupportedCRS <em>Supported CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported CRS</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getSupportedCRS()
	 * @see #getCoverageSummaryType()
	 * @generated
	 */
	EAttribute getCoverageSummaryType_SupportedCRS();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getSupportedFormat <em>Supported Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Format</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getSupportedFormat()
	 * @see #getCoverageSummaryType()
	 * @generated
	 */
	EAttribute getCoverageSummaryType_SupportedFormat();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getCoverageSummary <em>Coverage Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coverage Summary</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getCoverageSummary()
	 * @see #getCoverageSummaryType()
	 * @generated
	 */
	EReference getCoverageSummaryType_CoverageSummary();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getIdentifier()
	 * @see #getCoverageSummaryType()
	 * @generated
	 */
	EAttribute getCoverageSummaryType_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getIdentifier1 <em>Identifier1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier1</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.CoverageSummaryType#getIdentifier1()
	 * @see #getCoverageSummaryType()
	 * @generated
	 */
	EAttribute getCoverageSummaryType_Identifier1();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.DescribeCoverageType <em>Describe Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Describe Coverage Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DescribeCoverageType
	 * @generated
	 */
	EClass getDescribeCoverageType();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.DescribeCoverageType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DescribeCoverageType#getIdentifier()
	 * @see #getDescribeCoverageType()
	 * @generated
	 */
	EAttribute getDescribeCoverageType_Identifier();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getAvailableKeys <em>Available Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Available Keys</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getAvailableKeys()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AvailableKeys();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getAxisSubset <em>Axis Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Axis Subset</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getAxisSubset()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AxisSubset();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getCapabilities <em>Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Capabilities</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Capabilities();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contents</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getContents()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Contents();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coverage</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getCoverage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Coverage();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getCoverageDescriptions <em>Coverage Descriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coverage Descriptions</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getCoverageDescriptions()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CoverageDescriptions();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getCoverages <em>Coverages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coverages</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getCoverages()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Coverages();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getCoverageSummary <em>Coverage Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coverage Summary</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getCoverageSummary()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CoverageSummary();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getDescribeCoverage <em>Describe Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Describe Coverage</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getDescribeCoverage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DescribeCoverage();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGetCapabilities <em>Get Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Capabilities</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGetCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGetCoverage <em>Get Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Coverage</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGetCoverage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCoverage();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGridBaseCRS <em>Grid Base CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Base CRS</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGridBaseCRS()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GridBaseCRS();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGridCRS <em>Grid CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid CRS</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGridCRS()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GridCRS();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGridCS <em>Grid CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid CS</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGridCS()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GridCS();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGridOffsets <em>Grid Offsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Offsets</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGridOffsets()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GridOffsets();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGridOrigin <em>Grid Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Origin</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGridOrigin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GridOrigin();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGridType <em>Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getGridType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GridType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getIdentifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getInterpolationMethods <em>Interpolation Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interpolation Methods</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getInterpolationMethods()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InterpolationMethods();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getTemporalDomain <em>Temporal Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Domain</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getTemporalDomain()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TemporalDomain();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DocumentRoot#getTemporalSubset <em>Temporal Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Subset</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DocumentRoot#getTemporalSubset()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TemporalSubset();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.DomainSubsetType <em>Domain Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Subset Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DomainSubsetType
	 * @generated
	 */
	EClass getDomainSubsetType();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.DomainSubsetType#getBoundingBoxGroup <em>Bounding Box Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bounding Box Group</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DomainSubsetType#getBoundingBoxGroup()
	 * @see #getDomainSubsetType()
	 * @generated
	 */
	EAttribute getDomainSubsetType_BoundingBoxGroup();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DomainSubsetType#getBoundingBox <em>Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounding Box</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DomainSubsetType#getBoundingBox()
	 * @see #getDomainSubsetType()
	 * @generated
	 */
	EReference getDomainSubsetType_BoundingBox();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.DomainSubsetType#getTemporalSubset <em>Temporal Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal Subset</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.DomainSubsetType#getTemporalSubset()
	 * @see #getDomainSubsetType()
	 * @generated
	 */
	EReference getDomainSubsetType_TemporalSubset();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.FieldSubsetType <em>Field Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Subset Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.FieldSubsetType
	 * @generated
	 */
	EClass getFieldSubsetType();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.FieldSubsetType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.FieldSubsetType#getIdentifier()
	 * @see #getFieldSubsetType()
	 * @generated
	 */
	EReference getFieldSubsetType_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.FieldSubsetType#getInterpolationType <em>Interpolation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interpolation Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.FieldSubsetType#getInterpolationType()
	 * @see #getFieldSubsetType()
	 * @generated
	 */
	EAttribute getFieldSubsetType_InterpolationType();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.FieldSubsetType#getAxisSubset <em>Axis Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axis Subset</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.FieldSubsetType#getAxisSubset()
	 * @see #getFieldSubsetType()
	 * @generated
	 */
	EReference getFieldSubsetType_AxisSubset();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.FieldType
	 * @generated
	 */
	EClass getFieldType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.FieldType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.FieldType#getIdentifier()
	 * @see #getFieldType()
	 * @generated
	 */
	EAttribute getFieldType_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.FieldType#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.FieldType#getDefinition()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_Definition();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.FieldType#getNullValue <em>Null Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null Value</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.FieldType#getNullValue()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_NullValue();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.FieldType#getInterpolationMethods <em>Interpolation Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interpolation Methods</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.FieldType#getInterpolationMethods()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_InterpolationMethods();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.FieldType#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Axis</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.FieldType#getAxis()
	 * @see #getFieldType()
	 * @generated
	 */
	EReference getFieldType_Axis();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.GetCapabilitiesType <em>Get Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Capabilities Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GetCapabilitiesType
	 * @generated
	 */
	EClass getGetCapabilitiesType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.GetCapabilitiesType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GetCapabilitiesType#getService()
	 * @see #getGetCapabilitiesType()
	 * @generated
	 */
	EAttribute getGetCapabilitiesType_Service();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.GetCoverageType <em>Get Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Coverage Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GetCoverageType
	 * @generated
	 */
	EClass getGetCoverageType();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.GetCoverageType#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifier</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GetCoverageType#getIdentifier()
	 * @see #getGetCoverageType()
	 * @generated
	 */
	EReference getGetCoverageType_Identifier();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.GetCoverageType#getDomainSubset <em>Domain Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain Subset</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GetCoverageType#getDomainSubset()
	 * @see #getGetCoverageType()
	 * @generated
	 */
	EReference getGetCoverageType_DomainSubset();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.GetCoverageType#getRangeSubset <em>Range Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range Subset</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GetCoverageType#getRangeSubset()
	 * @see #getGetCoverageType()
	 * @generated
	 */
	EReference getGetCoverageType_RangeSubset();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.GetCoverageType#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GetCoverageType#getOutput()
	 * @see #getGetCoverageType()
	 * @generated
	 */
	EReference getGetCoverageType_Output();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.GridCrsType <em>Grid Crs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Crs Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GridCrsType
	 * @generated
	 */
	EClass getGridCrsType();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.GridCrsType#getSrsName <em>Srs Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Srs Name</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GridCrsType#getSrsName()
	 * @see #getGridCrsType()
	 * @generated
	 */
	EReference getGridCrsType_SrsName();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.GridCrsType#getGridBaseCRS <em>Grid Base CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Base CRS</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GridCrsType#getGridBaseCRS()
	 * @see #getGridCrsType()
	 * @generated
	 */
	EAttribute getGridCrsType_GridBaseCRS();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.GridCrsType#getGridType <em>Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GridCrsType#getGridType()
	 * @see #getGridCrsType()
	 * @generated
	 */
	EAttribute getGridCrsType_GridType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.GridCrsType#getGridOrigin <em>Grid Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Origin</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GridCrsType#getGridOrigin()
	 * @see #getGridCrsType()
	 * @generated
	 */
	EAttribute getGridCrsType_GridOrigin();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.GridCrsType#getGridOffsets <em>Grid Offsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Offsets</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GridCrsType#getGridOffsets()
	 * @see #getGridCrsType()
	 * @generated
	 */
	EAttribute getGridCrsType_GridOffsets();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.GridCrsType#getGridCS <em>Grid CS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid CS</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GridCrsType#getGridCS()
	 * @see #getGridCrsType()
	 * @generated
	 */
	EAttribute getGridCrsType_GridCS();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.GridCrsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.GridCrsType#getId()
	 * @see #getGridCrsType()
	 * @generated
	 */
	EAttribute getGridCrsType_Id();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.ImageCRSRefType <em>Image CRS Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image CRS Ref Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ImageCRSRefType
	 * @generated
	 */
	EClass getImageCRSRefType();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getImageCRS <em>Image CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image CRS</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getImageCRS()
	 * @see #getImageCRSRefType()
	 * @generated
	 */
	EReference getImageCRSRefType_ImageCRS();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getActuate()
	 * @see #getImageCRSRefType()
	 * @generated
	 */
	EAttribute getImageCRSRefType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getArcrole()
	 * @see #getImageCRSRefType()
	 * @generated
	 */
	EAttribute getImageCRSRefType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getHref()
	 * @see #getImageCRSRefType()
	 * @generated
	 */
	EAttribute getImageCRSRefType_Href();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getRemoteSchema <em>Remote Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote Schema</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getRemoteSchema()
	 * @see #getImageCRSRefType()
	 * @generated
	 */
	EAttribute getImageCRSRefType_RemoteSchema();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getRole()
	 * @see #getImageCRSRefType()
	 * @generated
	 */
	EAttribute getImageCRSRefType_Role();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getShow()
	 * @see #getImageCRSRefType()
	 * @generated
	 */
	EAttribute getImageCRSRefType_Show();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getTitle()
	 * @see #getImageCRSRefType()
	 * @generated
	 */
	EAttribute getImageCRSRefType_Title();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.ImageCRSRefType#getType()
	 * @see #getImageCRSRefType()
	 * @generated
	 */
	EAttribute getImageCRSRefType_Type();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.InterpolationMethodBaseType <em>Interpolation Method Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpolation Method Base Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.InterpolationMethodBaseType
	 * @generated
	 */
	EClass getInterpolationMethodBaseType();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.InterpolationMethodsType <em>Interpolation Methods Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpolation Methods Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.InterpolationMethodsType
	 * @generated
	 */
	EClass getInterpolationMethodsType();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.InterpolationMethodsType#getInterpolationMethod <em>Interpolation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interpolation Method</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.InterpolationMethodsType#getInterpolationMethod()
	 * @see #getInterpolationMethodsType()
	 * @generated
	 */
	EReference getInterpolationMethodsType_InterpolationMethod();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.InterpolationMethodsType#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.InterpolationMethodsType#getDefault()
	 * @see #getInterpolationMethodsType()
	 * @generated
	 */
	EAttribute getInterpolationMethodsType_Default();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.InterpolationMethodType <em>Interpolation Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interpolation Method Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.InterpolationMethodType
	 * @generated
	 */
	EClass getInterpolationMethodType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.InterpolationMethodType#getNullResistance <em>Null Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Null Resistance</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.InterpolationMethodType#getNullResistance()
	 * @see #getInterpolationMethodType()
	 * @generated
	 */
	EAttribute getInterpolationMethodType_NullResistance();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.OutputType
	 * @generated
	 */
	EClass getOutputType();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.OutputType#getGridCRS <em>Grid CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid CRS</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.OutputType#getGridCRS()
	 * @see #getOutputType()
	 * @generated
	 */
	EReference getOutputType_GridCRS();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.OutputType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.OutputType#getFormat()
	 * @see #getOutputType()
	 * @generated
	 */
	EAttribute getOutputType_Format();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.OutputType#isStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.OutputType#isStore()
	 * @see #getOutputType()
	 * @generated
	 */
	EAttribute getOutputType_Store();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.RangeSubsetType <em>Range Subset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Subset Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.RangeSubsetType
	 * @generated
	 */
	EClass getRangeSubsetType();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.RangeSubsetType#getFieldSubset <em>Field Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field Subset</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.RangeSubsetType#getFieldSubset()
	 * @see #getRangeSubsetType()
	 * @generated
	 */
	EReference getRangeSubsetType_FieldSubset();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.RangeType <em>Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.RangeType
	 * @generated
	 */
	EClass getRangeType();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.RangeType#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.RangeType#getField()
	 * @see #getRangeType()
	 * @generated
	 */
	EReference getRangeType_Field();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.RequestBaseType <em>Request Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Request Base Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.RequestBaseType
	 * @generated
	 */
	EClass getRequestBaseType();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.RequestBaseType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.RequestBaseType#getService()
	 * @see #getRequestBaseType()
	 * @generated
	 */
	EAttribute getRequestBaseType_Service();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.RequestBaseType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.RequestBaseType#getVersion()
	 * @see #getRequestBaseType()
	 * @generated
	 */
	EAttribute getRequestBaseType_Version();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.SpatialDomainType <em>Spatial Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Domain Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.SpatialDomainType
	 * @generated
	 */
	EClass getSpatialDomainType();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.SpatialDomainType#getBoundingBoxGroup <em>Bounding Box Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bounding Box Group</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.SpatialDomainType#getBoundingBoxGroup()
	 * @see #getSpatialDomainType()
	 * @generated
	 */
	EAttribute getSpatialDomainType_BoundingBoxGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.SpatialDomainType#getBoundingBox <em>Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bounding Box</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.SpatialDomainType#getBoundingBox()
	 * @see #getSpatialDomainType()
	 * @generated
	 */
	EReference getSpatialDomainType_BoundingBox();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.SpatialDomainType#getGridCRS <em>Grid CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid CRS</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.SpatialDomainType#getGridCRS()
	 * @see #getSpatialDomainType()
	 * @generated
	 */
	EReference getSpatialDomainType_GridCRS();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.SpatialDomainType#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.SpatialDomainType#getTransformation()
	 * @see #getSpatialDomainType()
	 * @generated
	 */
	EReference getSpatialDomainType_Transformation();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.SpatialDomainType#getImageCRS <em>Image CRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image CRS</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.SpatialDomainType#getImageCRS()
	 * @see #getSpatialDomainType()
	 * @generated
	 */
	EReference getSpatialDomainType_ImageCRS();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.SpatialDomainType#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.SpatialDomainType#getPolygon()
	 * @see #getSpatialDomainType()
	 * @generated
	 */
	EReference getSpatialDomainType_Polygon();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.TimePeriodType <em>Time Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Period Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.TimePeriodType
	 * @generated
	 */
	EClass getTimePeriodType();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.TimePeriodType#getBeginPosition <em>Begin Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Begin Position</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.TimePeriodType#getBeginPosition()
	 * @see #getTimePeriodType()
	 * @generated
	 */
	EReference getTimePeriodType_BeginPosition();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.glam.wcsclient.wcs111.TimePeriodType#getEndPosition <em>End Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Position</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.TimePeriodType#getEndPosition()
	 * @see #getTimePeriodType()
	 * @generated
	 */
	EReference getTimePeriodType_EndPosition();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.TimePeriodType#getTimeResolution <em>Time Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Resolution</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.TimePeriodType#getTimeResolution()
	 * @see #getTimePeriodType()
	 * @generated
	 */
	EAttribute getTimePeriodType_TimeResolution();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.glam.wcsclient.wcs111.TimePeriodType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.TimePeriodType#getFrame()
	 * @see #getTimePeriodType()
	 * @generated
	 */
	EAttribute getTimePeriodType_Frame();

	/**
	 * Returns the meta object for class '{@link uk.ac.glam.wcsclient.wcs111.TimeSequenceType <em>Time Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Sequence Type</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.TimeSequenceType
	 * @generated
	 */
	EClass getTimeSequenceType();

	/**
	 * Returns the meta object for the attribute list '{@link uk.ac.glam.wcsclient.wcs111.TimeSequenceType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.TimeSequenceType#getGroup()
	 * @see #getTimeSequenceType()
	 * @generated
	 */
	EAttribute getTimeSequenceType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.TimeSequenceType#getTimePosition <em>Time Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Position</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.TimeSequenceType#getTimePosition()
	 * @see #getTimeSequenceType()
	 * @generated
	 */
	EReference getTimeSequenceType_TimePosition();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.glam.wcsclient.wcs111.TimeSequenceType#getTimePeriod <em>Time Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Period</em>'.
	 * @see uk.ac.glam.wcsclient.wcs111.TimeSequenceType#getTimePeriod()
	 * @see #getTimeSequenceType()
	 * @generated
	 */
	EReference getTimeSequenceType_TimePeriod();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='IdentifierType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='.+'"
	 * @generated
	 */
	EDataType getIdentifierType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Interpolation Method Base Type Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Interpolation Method Base Type Base</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='InterpolationMethodBaseType_._base' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getInterpolationMethodBaseTypeBase();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Time Duration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Duration Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='TimeDurationType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#duration http://www.eclipse.org/emf/2003/XMLType#decimal'"
	 * @generated
	 */
	EDataType getTimeDurationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Wcs111Factory getWcs111Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.AvailableKeysTypeImpl <em>Available Keys Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.AvailableKeysTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getAvailableKeysType()
		 * @generated
		 */
		EClass AVAILABLE_KEYS_TYPE = eINSTANCE.getAvailableKeysType();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABLE_KEYS_TYPE__KEY = eINSTANCE.getAvailableKeysType_Key();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.AxisSubsetTypeImpl <em>Axis Subset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.AxisSubsetTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getAxisSubsetType()
		 * @generated
		 */
		EClass AXIS_SUBSET_TYPE = eINSTANCE.getAxisSubsetType();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_SUBSET_TYPE__IDENTIFIER = eINSTANCE.getAxisSubsetType_Identifier();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_SUBSET_TYPE__KEY = eINSTANCE.getAxisSubsetType_Key();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.AxisTypeImpl <em>Axis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.AxisTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getAxisType()
		 * @generated
		 */
		EClass AXIS_TYPE = eINSTANCE.getAxisType();

		/**
		 * The meta object literal for the '<em><b>Available Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_TYPE__AVAILABLE_KEYS = eINSTANCE.getAxisType_AvailableKeys();

		/**
		 * The meta object literal for the '<em><b>Meaning</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_TYPE__MEANING = eINSTANCE.getAxisType_Meaning();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_TYPE__DATA_TYPE = eINSTANCE.getAxisType_DataType();

		/**
		 * The meta object literal for the '<em><b>UOM</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_TYPE__UOM = eINSTANCE.getAxisType_UOM();

		/**
		 * The meta object literal for the '<em><b>Reference System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_TYPE__REFERENCE_SYSTEM = eINSTANCE.getAxisType_ReferenceSystem();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AXIS_TYPE__METADATA = eINSTANCE.getAxisType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AXIS_TYPE__IDENTIFIER = eINSTANCE.getAxisType_Identifier();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.CapabilitiesTypeImpl <em>Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.CapabilitiesTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getCapabilitiesType()
		 * @generated
		 */
		EClass CAPABILITIES_TYPE = eINSTANCE.getCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAPABILITIES_TYPE__CONTENTS = eINSTANCE.getCapabilitiesType_Contents();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.ContentsTypeImpl <em>Contents Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.ContentsTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getContentsType()
		 * @generated
		 */
		EClass CONTENTS_TYPE = eINSTANCE.getContentsType();

		/**
		 * The meta object literal for the '<em><b>Coverage Summary</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTS_TYPE__COVERAGE_SUMMARY = eINSTANCE.getContentsType_CoverageSummary();

		/**
		 * The meta object literal for the '<em><b>Supported CRS</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENTS_TYPE__SUPPORTED_CRS = eINSTANCE.getContentsType_SupportedCRS();

		/**
		 * The meta object literal for the '<em><b>Supported Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENTS_TYPE__SUPPORTED_FORMAT = eINSTANCE.getContentsType_SupportedFormat();

		/**
		 * The meta object literal for the '<em><b>Other Source</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENTS_TYPE__OTHER_SOURCE = eINSTANCE.getContentsType_OtherSource();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageDescriptionsTypeImpl <em>Coverage Descriptions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.CoverageDescriptionsTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getCoverageDescriptionsType()
		 * @generated
		 */
		EClass COVERAGE_DESCRIPTIONS_TYPE = eINSTANCE.getCoverageDescriptionsType();

		/**
		 * The meta object literal for the '<em><b>Coverage Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE_DESCRIPTIONS_TYPE__COVERAGE_DESCRIPTION = eINSTANCE.getCoverageDescriptionsType_CoverageDescription();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageDescriptionTypeImpl <em>Coverage Description Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.CoverageDescriptionTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getCoverageDescriptionType()
		 * @generated
		 */
		EClass COVERAGE_DESCRIPTION_TYPE = eINSTANCE.getCoverageDescriptionType();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERAGE_DESCRIPTION_TYPE__IDENTIFIER = eINSTANCE.getCoverageDescriptionType_Identifier();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE_DESCRIPTION_TYPE__METADATA = eINSTANCE.getCoverageDescriptionType_Metadata();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE_DESCRIPTION_TYPE__DOMAIN = eINSTANCE.getCoverageDescriptionType_Domain();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE_DESCRIPTION_TYPE__RANGE = eINSTANCE.getCoverageDescriptionType_Range();

		/**
		 * The meta object literal for the '<em><b>Supported CRS</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERAGE_DESCRIPTION_TYPE__SUPPORTED_CRS = eINSTANCE.getCoverageDescriptionType_SupportedCRS();

		/**
		 * The meta object literal for the '<em><b>Supported Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERAGE_DESCRIPTION_TYPE__SUPPORTED_FORMAT = eINSTANCE.getCoverageDescriptionType_SupportedFormat();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageDomainTypeImpl <em>Coverage Domain Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.CoverageDomainTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getCoverageDomainType()
		 * @generated
		 */
		EClass COVERAGE_DOMAIN_TYPE = eINSTANCE.getCoverageDomainType();

		/**
		 * The meta object literal for the '<em><b>Spatial Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE_DOMAIN_TYPE__SPATIAL_DOMAIN = eINSTANCE.getCoverageDomainType_SpatialDomain();

		/**
		 * The meta object literal for the '<em><b>Temporal Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE_DOMAIN_TYPE__TEMPORAL_DOMAIN = eINSTANCE.getCoverageDomainType_TemporalDomain();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.CoveragesTypeImpl <em>Coverages Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.CoveragesTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getCoveragesType()
		 * @generated
		 */
		EClass COVERAGES_TYPE = eINSTANCE.getCoveragesType();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGES_TYPE__COVERAGE = eINSTANCE.getCoveragesType_Coverage();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.CoverageSummaryTypeImpl <em>Coverage Summary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.CoverageSummaryTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getCoverageSummaryType()
		 * @generated
		 */
		EClass COVERAGE_SUMMARY_TYPE = eINSTANCE.getCoverageSummaryType();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE_SUMMARY_TYPE__METADATA = eINSTANCE.getCoverageSummaryType_Metadata();

		/**
		 * The meta object literal for the '<em><b>WGS84 Bounding Box</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE_SUMMARY_TYPE__WGS84_BOUNDING_BOX = eINSTANCE.getCoverageSummaryType_WGS84BoundingBox();

		/**
		 * The meta object literal for the '<em><b>Supported CRS</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERAGE_SUMMARY_TYPE__SUPPORTED_CRS = eINSTANCE.getCoverageSummaryType_SupportedCRS();

		/**
		 * The meta object literal for the '<em><b>Supported Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERAGE_SUMMARY_TYPE__SUPPORTED_FORMAT = eINSTANCE.getCoverageSummaryType_SupportedFormat();

		/**
		 * The meta object literal for the '<em><b>Coverage Summary</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COVERAGE_SUMMARY_TYPE__COVERAGE_SUMMARY = eINSTANCE.getCoverageSummaryType_CoverageSummary();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERAGE_SUMMARY_TYPE__IDENTIFIER = eINSTANCE.getCoverageSummaryType_Identifier();

		/**
		 * The meta object literal for the '<em><b>Identifier1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COVERAGE_SUMMARY_TYPE__IDENTIFIER1 = eINSTANCE.getCoverageSummaryType_Identifier1();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.DescribeCoverageTypeImpl <em>Describe Coverage Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.DescribeCoverageTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getDescribeCoverageType()
		 * @generated
		 */
		EClass DESCRIBE_COVERAGE_TYPE = eINSTANCE.getDescribeCoverageType();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBE_COVERAGE_TYPE__IDENTIFIER = eINSTANCE.getDescribeCoverageType_Identifier();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.DocumentRootImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Available Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AVAILABLE_KEYS = eINSTANCE.getDocumentRoot_AvailableKeys();

		/**
		 * The meta object literal for the '<em><b>Axis Subset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AXIS_SUBSET = eINSTANCE.getDocumentRoot_AxisSubset();

		/**
		 * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CAPABILITIES = eINSTANCE.getDocumentRoot_Capabilities();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTENTS = eINSTANCE.getDocumentRoot_Contents();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COVERAGE = eINSTANCE.getDocumentRoot_Coverage();

		/**
		 * The meta object literal for the '<em><b>Coverage Descriptions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COVERAGE_DESCRIPTIONS = eINSTANCE.getDocumentRoot_CoverageDescriptions();

		/**
		 * The meta object literal for the '<em><b>Coverages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COVERAGES = eINSTANCE.getDocumentRoot_Coverages();

		/**
		 * The meta object literal for the '<em><b>Coverage Summary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COVERAGE_SUMMARY = eINSTANCE.getDocumentRoot_CoverageSummary();

		/**
		 * The meta object literal for the '<em><b>Describe Coverage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIBE_COVERAGE = eINSTANCE.getDocumentRoot_DescribeCoverage();

		/**
		 * The meta object literal for the '<em><b>Get Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_CAPABILITIES = eINSTANCE.getDocumentRoot_GetCapabilities();

		/**
		 * The meta object literal for the '<em><b>Get Coverage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_COVERAGE = eINSTANCE.getDocumentRoot_GetCoverage();

		/**
		 * The meta object literal for the '<em><b>Grid Base CRS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GRID_BASE_CRS = eINSTANCE.getDocumentRoot_GridBaseCRS();

		/**
		 * The meta object literal for the '<em><b>Grid CRS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GRID_CRS = eINSTANCE.getDocumentRoot_GridCRS();

		/**
		 * The meta object literal for the '<em><b>Grid CS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GRID_CS = eINSTANCE.getDocumentRoot_GridCS();

		/**
		 * The meta object literal for the '<em><b>Grid Offsets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GRID_OFFSETS = eINSTANCE.getDocumentRoot_GridOffsets();

		/**
		 * The meta object literal for the '<em><b>Grid Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GRID_ORIGIN = eINSTANCE.getDocumentRoot_GridOrigin();

		/**
		 * The meta object literal for the '<em><b>Grid Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__GRID_TYPE = eINSTANCE.getDocumentRoot_GridType();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__IDENTIFIER = eINSTANCE.getDocumentRoot_Identifier();

		/**
		 * The meta object literal for the '<em><b>Interpolation Methods</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERPOLATION_METHODS = eINSTANCE.getDocumentRoot_InterpolationMethods();

		/**
		 * The meta object literal for the '<em><b>Temporal Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEMPORAL_DOMAIN = eINSTANCE.getDocumentRoot_TemporalDomain();

		/**
		 * The meta object literal for the '<em><b>Temporal Subset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TEMPORAL_SUBSET = eINSTANCE.getDocumentRoot_TemporalSubset();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.DomainSubsetTypeImpl <em>Domain Subset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.DomainSubsetTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getDomainSubsetType()
		 * @generated
		 */
		EClass DOMAIN_SUBSET_TYPE = eINSTANCE.getDomainSubsetType();

		/**
		 * The meta object literal for the '<em><b>Bounding Box Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_SUBSET_TYPE__BOUNDING_BOX_GROUP = eINSTANCE.getDomainSubsetType_BoundingBoxGroup();

		/**
		 * The meta object literal for the '<em><b>Bounding Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SUBSET_TYPE__BOUNDING_BOX = eINSTANCE.getDomainSubsetType_BoundingBox();

		/**
		 * The meta object literal for the '<em><b>Temporal Subset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_SUBSET_TYPE__TEMPORAL_SUBSET = eINSTANCE.getDomainSubsetType_TemporalSubset();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.FieldSubsetTypeImpl <em>Field Subset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.FieldSubsetTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getFieldSubsetType()
		 * @generated
		 */
		EClass FIELD_SUBSET_TYPE = eINSTANCE.getFieldSubsetType();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_SUBSET_TYPE__IDENTIFIER = eINSTANCE.getFieldSubsetType_Identifier();

		/**
		 * The meta object literal for the '<em><b>Interpolation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_SUBSET_TYPE__INTERPOLATION_TYPE = eINSTANCE.getFieldSubsetType_InterpolationType();

		/**
		 * The meta object literal for the '<em><b>Axis Subset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_SUBSET_TYPE__AXIS_SUBSET = eINSTANCE.getFieldSubsetType_AxisSubset();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.FieldTypeImpl <em>Field Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.FieldTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getFieldType()
		 * @generated
		 */
		EClass FIELD_TYPE = eINSTANCE.getFieldType();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_TYPE__IDENTIFIER = eINSTANCE.getFieldType_Identifier();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__DEFINITION = eINSTANCE.getFieldType_Definition();

		/**
		 * The meta object literal for the '<em><b>Null Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__NULL_VALUE = eINSTANCE.getFieldType_NullValue();

		/**
		 * The meta object literal for the '<em><b>Interpolation Methods</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__INTERPOLATION_METHODS = eINSTANCE.getFieldType_InterpolationMethods();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE__AXIS = eINSTANCE.getFieldType_Axis();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.GetCapabilitiesTypeImpl <em>Get Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.GetCapabilitiesTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getGetCapabilitiesType()
		 * @generated
		 */
		EClass GET_CAPABILITIES_TYPE = eINSTANCE.getGetCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CAPABILITIES_TYPE__SERVICE = eINSTANCE.getGetCapabilitiesType_Service();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.GetCoverageTypeImpl <em>Get Coverage Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.GetCoverageTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getGetCoverageType()
		 * @generated
		 */
		EClass GET_COVERAGE_TYPE = eINSTANCE.getGetCoverageType();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_COVERAGE_TYPE__IDENTIFIER = eINSTANCE.getGetCoverageType_Identifier();

		/**
		 * The meta object literal for the '<em><b>Domain Subset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_COVERAGE_TYPE__DOMAIN_SUBSET = eINSTANCE.getGetCoverageType_DomainSubset();

		/**
		 * The meta object literal for the '<em><b>Range Subset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_COVERAGE_TYPE__RANGE_SUBSET = eINSTANCE.getGetCoverageType_RangeSubset();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_COVERAGE_TYPE__OUTPUT = eINSTANCE.getGetCoverageType_Output();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.GridCrsTypeImpl <em>Grid Crs Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.GridCrsTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getGridCrsType()
		 * @generated
		 */
		EClass GRID_CRS_TYPE = eINSTANCE.getGridCrsType();

		/**
		 * The meta object literal for the '<em><b>Srs Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID_CRS_TYPE__SRS_NAME = eINSTANCE.getGridCrsType_SrsName();

		/**
		 * The meta object literal for the '<em><b>Grid Base CRS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_CRS_TYPE__GRID_BASE_CRS = eINSTANCE.getGridCrsType_GridBaseCRS();

		/**
		 * The meta object literal for the '<em><b>Grid Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_CRS_TYPE__GRID_TYPE = eINSTANCE.getGridCrsType_GridType();

		/**
		 * The meta object literal for the '<em><b>Grid Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_CRS_TYPE__GRID_ORIGIN = eINSTANCE.getGridCrsType_GridOrigin();

		/**
		 * The meta object literal for the '<em><b>Grid Offsets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_CRS_TYPE__GRID_OFFSETS = eINSTANCE.getGridCrsType_GridOffsets();

		/**
		 * The meta object literal for the '<em><b>Grid CS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_CRS_TYPE__GRID_CS = eINSTANCE.getGridCrsType_GridCS();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_CRS_TYPE__ID = eINSTANCE.getGridCrsType_Id();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.ImageCRSRefTypeImpl <em>Image CRS Ref Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.ImageCRSRefTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getImageCRSRefType()
		 * @generated
		 */
		EClass IMAGE_CRS_REF_TYPE = eINSTANCE.getImageCRSRefType();

		/**
		 * The meta object literal for the '<em><b>Image CRS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_CRS_REF_TYPE__IMAGE_CRS = eINSTANCE.getImageCRSRefType_ImageCRS();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CRS_REF_TYPE__ACTUATE = eINSTANCE.getImageCRSRefType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CRS_REF_TYPE__ARCROLE = eINSTANCE.getImageCRSRefType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CRS_REF_TYPE__HREF = eINSTANCE.getImageCRSRefType_Href();

		/**
		 * The meta object literal for the '<em><b>Remote Schema</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CRS_REF_TYPE__REMOTE_SCHEMA = eINSTANCE.getImageCRSRefType_RemoteSchema();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CRS_REF_TYPE__ROLE = eINSTANCE.getImageCRSRefType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CRS_REF_TYPE__SHOW = eINSTANCE.getImageCRSRefType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CRS_REF_TYPE__TITLE = eINSTANCE.getImageCRSRefType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CRS_REF_TYPE__TYPE = eINSTANCE.getImageCRSRefType_Type();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.InterpolationMethodBaseTypeImpl <em>Interpolation Method Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.InterpolationMethodBaseTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getInterpolationMethodBaseType()
		 * @generated
		 */
		EClass INTERPOLATION_METHOD_BASE_TYPE = eINSTANCE.getInterpolationMethodBaseType();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.InterpolationMethodsTypeImpl <em>Interpolation Methods Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.InterpolationMethodsTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getInterpolationMethodsType()
		 * @generated
		 */
		EClass INTERPOLATION_METHODS_TYPE = eINSTANCE.getInterpolationMethodsType();

		/**
		 * The meta object literal for the '<em><b>Interpolation Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERPOLATION_METHODS_TYPE__INTERPOLATION_METHOD = eINSTANCE.getInterpolationMethodsType_InterpolationMethod();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERPOLATION_METHODS_TYPE__DEFAULT = eINSTANCE.getInterpolationMethodsType_Default();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.InterpolationMethodTypeImpl <em>Interpolation Method Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.InterpolationMethodTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getInterpolationMethodType()
		 * @generated
		 */
		EClass INTERPOLATION_METHOD_TYPE = eINSTANCE.getInterpolationMethodType();

		/**
		 * The meta object literal for the '<em><b>Null Resistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERPOLATION_METHOD_TYPE__NULL_RESISTANCE = eINSTANCE.getInterpolationMethodType_NullResistance();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.OutputTypeImpl <em>Output Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.OutputTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getOutputType()
		 * @generated
		 */
		EClass OUTPUT_TYPE = eINSTANCE.getOutputType();

		/**
		 * The meta object literal for the '<em><b>Grid CRS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_TYPE__GRID_CRS = eINSTANCE.getOutputType_GridCRS();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_TYPE__FORMAT = eINSTANCE.getOutputType_Format();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_TYPE__STORE = eINSTANCE.getOutputType_Store();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.RangeSubsetTypeImpl <em>Range Subset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.RangeSubsetTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getRangeSubsetType()
		 * @generated
		 */
		EClass RANGE_SUBSET_TYPE = eINSTANCE.getRangeSubsetType();

		/**
		 * The meta object literal for the '<em><b>Field Subset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_SUBSET_TYPE__FIELD_SUBSET = eINSTANCE.getRangeSubsetType_FieldSubset();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.RangeTypeImpl <em>Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.RangeTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getRangeType()
		 * @generated
		 */
		EClass RANGE_TYPE = eINSTANCE.getRangeType();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_TYPE__FIELD = eINSTANCE.getRangeType_Field();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.RequestBaseTypeImpl <em>Request Base Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.RequestBaseTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getRequestBaseType()
		 * @generated
		 */
		EClass REQUEST_BASE_TYPE = eINSTANCE.getRequestBaseType();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_BASE_TYPE__SERVICE = eINSTANCE.getRequestBaseType_Service();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUEST_BASE_TYPE__VERSION = eINSTANCE.getRequestBaseType_Version();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.SpatialDomainTypeImpl <em>Spatial Domain Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.SpatialDomainTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getSpatialDomainType()
		 * @generated
		 */
		EClass SPATIAL_DOMAIN_TYPE = eINSTANCE.getSpatialDomainType();

		/**
		 * The meta object literal for the '<em><b>Bounding Box Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_DOMAIN_TYPE__BOUNDING_BOX_GROUP = eINSTANCE.getSpatialDomainType_BoundingBoxGroup();

		/**
		 * The meta object literal for the '<em><b>Bounding Box</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_DOMAIN_TYPE__BOUNDING_BOX = eINSTANCE.getSpatialDomainType_BoundingBox();

		/**
		 * The meta object literal for the '<em><b>Grid CRS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_DOMAIN_TYPE__GRID_CRS = eINSTANCE.getSpatialDomainType_GridCRS();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_DOMAIN_TYPE__TRANSFORMATION = eINSTANCE.getSpatialDomainType_Transformation();

		/**
		 * The meta object literal for the '<em><b>Image CRS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_DOMAIN_TYPE__IMAGE_CRS = eINSTANCE.getSpatialDomainType_ImageCRS();

		/**
		 * The meta object literal for the '<em><b>Polygon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_DOMAIN_TYPE__POLYGON = eINSTANCE.getSpatialDomainType_Polygon();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.TimePeriodTypeImpl <em>Time Period Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.TimePeriodTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getTimePeriodType()
		 * @generated
		 */
		EClass TIME_PERIOD_TYPE = eINSTANCE.getTimePeriodType();

		/**
		 * The meta object literal for the '<em><b>Begin Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PERIOD_TYPE__BEGIN_POSITION = eINSTANCE.getTimePeriodType_BeginPosition();

		/**
		 * The meta object literal for the '<em><b>End Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_PERIOD_TYPE__END_POSITION = eINSTANCE.getTimePeriodType_EndPosition();

		/**
		 * The meta object literal for the '<em><b>Time Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_TYPE__TIME_RESOLUTION = eINSTANCE.getTimePeriodType_TimeResolution();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_PERIOD_TYPE__FRAME = eINSTANCE.getTimePeriodType_Frame();

		/**
		 * The meta object literal for the '{@link uk.ac.glam.wcsclient.wcs111.impl.TimeSequenceTypeImpl <em>Time Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.glam.wcsclient.wcs111.impl.TimeSequenceTypeImpl
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getTimeSequenceType()
		 * @generated
		 */
		EClass TIME_SEQUENCE_TYPE = eINSTANCE.getTimeSequenceType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_SEQUENCE_TYPE__GROUP = eINSTANCE.getTimeSequenceType_Group();

		/**
		 * The meta object literal for the '<em><b>Time Position</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SEQUENCE_TYPE__TIME_POSITION = eINSTANCE.getTimeSequenceType_TimePosition();

		/**
		 * The meta object literal for the '<em><b>Time Period</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_SEQUENCE_TYPE__TIME_PERIOD = eINSTANCE.getTimeSequenceType_TimePeriod();

		/**
		 * The meta object literal for the '<em>Identifier Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getIdentifierType()
		 * @generated
		 */
		EDataType IDENTIFIER_TYPE = eINSTANCE.getIdentifierType();

		/**
		 * The meta object literal for the '<em>Interpolation Method Base Type Base</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getInterpolationMethodBaseTypeBase()
		 * @generated
		 */
		EDataType INTERPOLATION_METHOD_BASE_TYPE_BASE = eINSTANCE.getInterpolationMethodBaseTypeBase();

		/**
		 * The meta object literal for the '<em>Time Duration Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see uk.ac.glam.wcsclient.wcs111.impl.Wcs111PackageImpl#getTimeDurationType()
		 * @generated
		 */
		EDataType TIME_DURATION_TYPE = eINSTANCE.getTimeDurationType();

	}

} //Wcs111Package
