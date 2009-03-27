package com.wordpress.fredericobenevides.rhino;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import com.wordpress.fredericobenevides.rhino.util.FileLoad;

public class EvalEmail {
	
	public static void main(String[] args) throws Exception {
		ScriptEngineManager factory = new ScriptEngineManager();
		ScriptEngine engine = factory.getEngineByName("JavaScript");
		engine.eval(FileLoad.load("email.js"));
		
		Invocable invocable = (Invocable) engine;
		
		String email = "fredbene@gmail.com";
        Boolean resultado = (Boolean) invocable.invokeFunction("validar_email", email);
        System.out.println("O email é válido ? " + resultado);
        
        email = "fredbene";
        resultado = (Boolean) invocable.invokeFunction("validar_email", email);
        System.out.println("O email é válido ? " + resultado); 
	}
}
