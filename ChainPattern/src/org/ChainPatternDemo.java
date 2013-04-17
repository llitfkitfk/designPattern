package org;

public class ChainPatternDemo {
	
	
	private static AbstactLogger getChainLoggers() {
		AbstactLogger errorLogger = new ErrorLogger(AbstactLogger.ERROR);
		AbstactLogger fileLogger = new FileLogger(AbstactLogger.DEBUG);
		AbstactLogger consoleLogger = new ConsoleLogger(AbstactLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		
		return errorLogger;
		
	}
	
	public static void main(String[] args) {
		AbstactLogger loggerChain = getChainLoggers();
		
		loggerChain.logMessage(AbstactLogger.INFO, "This is an information");
		
		loggerChain.logMessage(AbstactLogger.DEBUG, "This is debug");
		
		loggerChain.logMessage(AbstactLogger.ERROR, "this is error information");
	}
}
