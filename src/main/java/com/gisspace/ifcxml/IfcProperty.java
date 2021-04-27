package com.gisspace.ifcxml;

import com.gisspace.domain.Ifc.Decomposition;
import com.gisspace.domain.Ifc.Groups;
import com.gisspace.domain.Ifc.Header;
import com.gisspace.domain.Ifc.Layers;
import com.gisspace.domain.Ifc.Materials;
import com.gisspace.domain.Ifc.Properties;
import com.gisspace.domain.Ifc.Quantities;
import com.gisspace.domain.Ifc.Types;
import com.gisspace.domain.Ifc.Units;

public class IfcProperty {
	 private Header header;
     private Units units;
     private Properties properties;
     private Quantities quantities;
     private Types types;
     private Layers layers;
     private Groups groups;
     private Materials materials;
     private Decomposition decomposition;
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public Units getUnits() {
		return units;
	}
	public void setUnits(Units units) {
		this.units = units;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Quantities getQuantities() {
		return quantities;
	}
	public void setQuantities(Quantities quantities) {
		this.quantities = quantities;
	}
	public Types getTypes() {
		return types;
	}
	public void setTypes(Types types) {
		this.types = types;
	}
	public Layers getLayers() {
		return layers;
	}
	public void setLayers(Layers layers) {
		this.layers = layers;
	}
	public Groups getGroups() {
		return groups;
	}
	public void setGroups(Groups groups) {
		this.groups = groups;
	}
	public Materials getMaterials() {
		return materials;
	}
	public void setMaterials(Materials materials) {
		this.materials = materials;
	}
	public Decomposition getDecomposition() {
		return decomposition;
	}
	public void setDecomposition(Decomposition decomposition) {
		this.decomposition = decomposition;
	}
     
}