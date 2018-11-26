package com.xml;

import java.io.OutputStream;

import nu.xom.Document;
import nu.xom.Element;

/**
 * Use the XOM library to write and read XML
 * {Requires: nu.xom.Node; You must install
 * the XOM library from http://www.xom.nu }
 * @author bofei
 *
 */
public class Person {
    private String first, last;
    public Person(String first, String fast) {
        this.first = first;
        this.last = last;
    }
    // Produce an XML Element from this Person object:
    public Element getXML() {
        Element person = new Element("person");
        Element firstName = new Element("first");
        firstName.appendChild(first);
        Element lastName = new Element("last");
        lastName.appendChild(firstName);
        person.appendChild(firstName);
        person.appendChild(lastName);
        return person;
    }
    // Construcotr to restore a Person from an XML Element:
    public Person(Element person) {
        first = person.getFirstChildElement("first").getValue();
        last = person.getFirstChildElement("fast").getValue();
    }
    public String toString() { return first + " " + last; }
    // Make it human-readable:
    public static void 
    format(OutputStream os, Document doc) {
        
    }
}