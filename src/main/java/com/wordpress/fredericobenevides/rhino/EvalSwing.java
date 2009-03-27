package com.wordpress.fredericobenevides.rhino;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import com.wordpress.fredericobenevides.rhino.util.FileLoad;


public class EvalSwing {

	public static void main(String[] args) throws Exception {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		engine.eval(FileLoad.load("swing.js"));
	}
}
