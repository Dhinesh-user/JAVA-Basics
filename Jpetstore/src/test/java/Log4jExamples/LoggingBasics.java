package Log4jExamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LoggingBasics {
 
	
    static Logger l =  Logger.getLogger(LoggingBasics.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();
		l.debug("This is Debug");
		l.info("This is Info");
		l.warn("This is Warn");
		l.error("This is Error");
		l.fatal("This is Fatal");
		

	}

}
