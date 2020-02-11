package code.clean.system.example1;

import java.util.logging.Logger;

public class DefaultService implements Service {
	private static final Logger logger = Logger.getGlobal();

	@Override
	public void execute() {
		logger.info("executing Default Service");
	}
}