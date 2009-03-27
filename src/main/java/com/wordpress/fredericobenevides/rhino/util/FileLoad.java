package com.wordpress.fredericobenevides.rhino.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileLoad {

	public static Reader load(String file) throws FileNotFoundException {
		return new FileReader(FileLoad.class.getResource("/" + file).getPath());
	}
}
