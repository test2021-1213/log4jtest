package lab19;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyGreatApp {
	private static final Logger logger = LogManager.getLogger(MyGreatApp.class);

	public static void main(String[] args) {
		try {
			System.out.println(args[-1]);
		} catch (Exception e) {
			logger.error("oh...", e);
		}
	}
}
