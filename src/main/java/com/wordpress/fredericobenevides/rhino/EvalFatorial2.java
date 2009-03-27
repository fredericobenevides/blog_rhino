package com.wordpress.fredericobenevides.rhino;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import com.wordpress.fredericobenevides.rhino.util.FileLoad;

public class EvalFatorial2 {
	
	public static void main(String[] args) throws Exception {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		engine.eval(FileLoad.load("fatorial2.js"));
		
		Invocable invocable = (Invocable) engine;
		
		int fatorial = 3;
        Double resultado = (Double) invocable.invokeFunction("fatorial", fatorial );
        System.out.println("O fatorial de " + fatorial + " é: " + resultado.intValue());
	}
}
