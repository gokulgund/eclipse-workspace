package com.javaprogram;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main(String[] args )
    {
		String message = "Hello, java";
		LOG.debug(message + "  Will Be Printed On Debug Level");
		LOG.info(message +   "   Will Be Printed On Info Level");
		LOG.warn(message +   "   Will Be Printed On Warn Level");
		LOG.error(message +   "   Will Be Printed On Error Level");
		LOG.fatal(message +   "   Will Be Printed On Fatal Level");
		LOG.info("Appending String: {}." , message);
        System.out.println( message );
    }
}
