package code.clean.system.example;

import java.util.logging.Logger;

public class Controller {
	private static final Logger logger = Logger.getGlobal();
	private Service service;

	public void doAction() {
		logger.info("doAction in Controller");
		getService().execute();
	}

	public Service getService() {
		if (service == null) {
			service = new DefaultService();
		}
		return service;
	}
}
