package code.clean.system.example1;

import java.util.logging.Logger;

public class Controller {
	private static final Logger logger = Logger.getGlobal();
	private Service service;

	public Controller(Service service) {
		this.service = service;
	}

	public void doAction() {
		logger.info("doAction in Controller");
		service.execute();
	}
}
