/**
 * 
 */
package com.tripcostcalculator.model;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import student.TestCase;

/**
 * @author Tyler
 * 
 */
public class WebGetterTest extends TestCase {
	public void setUp() {
		// nothing
	}

	public void testGetGas() throws MalformedURLException,
			ParserConfigurationException, SAXException, IOException {
		WebGetter test = new WebGetter(
				"http://www.fueleconomy.gov/ws/rest/fuelprices", "regular");
		NodeList testList = test.getGas();
		System.out.println(testList.getLength());
		System.out.println(testList.item(0));
		assertTrue(testList.getLength() > 0);
	}

	public void testGetMPG() throws MalformedURLException,
			ParserConfigurationException, SAXException, IOException {
		WebGetter test = new WebGetter(
				"http://www.fueleconomy.gov//ws/rest/ympg/shared/ympgVehicle/",
				"avgMpg");
		NodeList testList = test.getMPG("10003");
		System.out.println(testList.getLength());
		System.out.println(testList.item(0));
		assertTrue(testList.getLength() > 0);

	}
}
