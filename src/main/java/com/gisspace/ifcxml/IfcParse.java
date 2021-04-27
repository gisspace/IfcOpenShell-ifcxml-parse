package com.gisspace.ifcxml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.gisspace.domain.Ifc;
import com.gisspace.domain.Ifc.Decomposition;
import com.gisspace.domain.Ifc.Groups;
import com.gisspace.domain.Ifc.Header;
import com.gisspace.domain.Ifc.Layers;
import com.gisspace.domain.Ifc.Materials;
import com.gisspace.domain.Ifc.Properties;
import com.gisspace.domain.Ifc.Quantities;
import com.gisspace.domain.Ifc.Types;
import com.gisspace.domain.Ifc.Units;

/**
 * ifcxml 解析
 *
 */
@SuppressWarnings("restriction")
public class IfcParse {

	private static IfcParse instance = null;

	/**
	 * 1.构造方法私有化，外部不能new
	 */
	private IfcParse() {

	}

	public static IfcParse getInstance() {
		if (instance == null) {
			instance = new IfcParse();
		}
		return instance;
	}

	/**
	 * 返回ifc对象
	 * @param ifcxml 文件路径
	 * @return
	 */
	public Ifc getIfc(String ifcxml) {
		try {
			final JAXBContext jc = JAXBContext.newInstance("com.gisspace.domain");
			final Unmarshaller u = jc.createUnmarshaller();
			File f = new File(ifcxml);
			final InputStream is = new FileInputStream(f);
			Ifc ifc = (Ifc) u.unmarshal(is);
			is.close();
			return ifc;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public IfcProperty getIfcProperty(String ifcxml) {
		IfcProperty ifcproperty = new IfcProperty();
		Ifc ifc =  getIfc(ifcxml);
		for (final Object o : ifc.getIfcProperty()) {
			  if (o instanceof Header)
              {
                  final Header header = (Header) o;
                  ifcproperty.setHeader(header);
              }
			  if (o instanceof Units)
              {
                  final Units units = (Units) o;
                  ifcproperty.setUnits(units);
              }
			  if (o instanceof Properties)
              {
                  final Properties properties = (Properties) o;
                  ifcproperty.setProperties(properties);
              }
			  if (o instanceof Quantities)
              {
                  final Quantities quantities = (Quantities) o;
                  ifcproperty.setQuantities(quantities);
              }
			  if (o instanceof Types)
              {
                  final Types types = (Types) o;
                  ifcproperty.setTypes(types);
              }
			  if (o instanceof Layers)
              {
                  final Layers layers = (Layers) o;
                  ifcproperty.setLayers(layers);
              }
			  if (o instanceof Groups)
              {
                  final Groups groups = (Groups) o;
                  ifcproperty.setGroups(groups);
              }
			  if (o instanceof Materials)
              {
                  final Materials materials = (Materials) o;
                  ifcproperty.setMaterials(materials);
              }
			  if (o instanceof Decomposition)
              {
                  final Decomposition decomposition = (Decomposition) o;
                  ifcproperty.setDecomposition(decomposition);
              }
		}
		return ifcproperty;
	}
	public static void main(String[] args) {
		IfcParse.getInstance().getIfcProperty("ifcxml.xml");
	}
}
