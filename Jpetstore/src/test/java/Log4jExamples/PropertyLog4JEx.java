package Log4jExamples;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class PropertyLog4JEx {
	static Logger l =  Logger.getLogger(PropertyLog4JEx.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("C:\\Users\\PD20313015\\eclipse-workspace\\Jpetstore\\log4j.properties");
		l.debug("This is Debug");
		l.info("This is Info");
		l.warn("This is Warn");
		l.error("This is Error");
		l.fatal("This is Fatal");
		

	}

}
