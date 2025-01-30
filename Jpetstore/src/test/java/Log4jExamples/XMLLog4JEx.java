package Log4jExamples;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLLog4JEx {
	

static Logger l =  Logger.getLogger(XMLLog4JEx.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DOMConfigurator.configure("C:\\Users\\PD20313015\\eclipse-workspace\\Jpetstore\\log4j.xml");
		l.debug("This is Debug");
		l.info("This is Info");
		l.warn("This is Warn");
		l.error("This is Error");
		l.fatal("This is Fatal");
	}
}
