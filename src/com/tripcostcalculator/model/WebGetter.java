package com.tripcostcalculator.model;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Connects to web-service to retrieve information from the internet
 * 
 * @author Tyler Leskanic (tyler47)
 * 
 */
public class WebGetter {
	private String url;
	private String xmlTag;

	/**
	 * Constructor for WebGetter
	 * 
	 * @param dest
	 *            Destination URL
	 * @param Xtag
	 *            XML Tag you wish to retrieve
	 */
	public WebGetter(String dest, String Xtag) 
	{
		url = dest;
		xmlTag = Xtag;
	}

	public NodeList getGas() throws ParserConfigurationException, MalformedURLException, SAXException, IOException 
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new URL(url).openStream());
		NodeList resultList = doc.getElementsByTagName(xmlTag);

		return resultList;
	}
	
	public NodeList getMPG(String vehicleId) throws ParserConfigurationException, MalformedURLException, SAXException, IOException
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new URL(url+vehicleId).openStream());
		NodeList resultList = doc.getElementsByTagName(xmlTag);

		return resultList;
		
	}
}
