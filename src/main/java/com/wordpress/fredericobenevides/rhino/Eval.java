package com.wordpress.fredericobenevides.rhino;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Eval {

	public static void main(String[] args) throws Exception {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		engine.eval("println('JavaScript Executando')");
	}
}
