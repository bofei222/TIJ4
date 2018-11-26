package com.xml;

import java.util.ArrayList;

import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Elements;

/**
 * {Requires: nu.xom.Node; You must install
 * the XOM library from http://www.xom.nu }
 * {RunFirst: Person}
 * @author bofei
 *
 */
public class People extends ArrayList<Person> {
    public People(String fileName) throws Exception {
        Document doc = new Builder().build(fileName);
        Elements elements =
            doc.getRootElement().getChildElements();
        for (int i = 0; i < elements.size(); i++)
            add(new Person(elements.get(i)));
    }
    public static void main(String[] args) throws Exception{
        People p = new People("People.xml");
        System.out.println(p);
    }
}