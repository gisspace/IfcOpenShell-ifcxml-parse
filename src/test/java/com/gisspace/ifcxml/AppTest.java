package com.gisspace.ifcxml;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	String rootPath=this.getClass().getResource("/ifcxml.xml").getFile().toString();
    	System.out.println(rootPath);
    	IfcProperty ifc = IfcParse.getInstance().getIfcProperty(rootPath);
    	System.out.println(ifc.getGroups().getIfcSystem().size());
        assertEquals(ifc.getGroups().getIfcGroup().size(), 6);
        assertEquals(ifc.getGroups().getIfcSystem().size(), 28);
    }
}
