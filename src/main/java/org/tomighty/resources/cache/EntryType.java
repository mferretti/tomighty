package org.tomighty.resources.cache;

import java.io.File;
import java.io.IOException;

public interface EntryType {

	String name();

	Object read(File file) throws IOException;
	
	void write(Object item, File file) throws IOException;

}
