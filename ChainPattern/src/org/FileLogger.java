package org;

public class FileLogger extends AbstactLogger {

	public FileLogger(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("File logger: " + message);
	}

}
