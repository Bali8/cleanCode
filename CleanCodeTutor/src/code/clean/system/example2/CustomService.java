package code.clean.system.example2;

import java.util.logging.Logger;

public class CustomService implements Service {

	private static final Logger logger = Logger.getGlobal();

	@Override
	public void execute() {
		logger.info("executing Custom Service");
	}
}
