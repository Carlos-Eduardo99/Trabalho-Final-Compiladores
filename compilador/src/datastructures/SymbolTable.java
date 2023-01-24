package datastructures;

import java.util.HashMap;

public class SymbolTable {
	
	private HashMap<String, Variable> map;
	
	public SymbolTable() {
		map = new HashMap<String, Variable>();
	}
	
	public void add(Variable variable) {
		map.put(variable.getName(),variable);
	}
	public boolean exists(String symbolName) {
		return map.get(symbolName) != null;
	}
	public Variable get(String symbolName) {
		return map.get(symbolName);
	}
	public void mudarValor(String id, Variable variable) {
		map.replace(id, variable);
		}
	
	public String getValue(String symbolName) {
		Variable variable = map.get(symbolName);
		return variable.getValue();
	}
	
	public int getTipo(String symbolName) {
		Variable variable = map.get(symbolName);
		return variable.getType();
	}
}
