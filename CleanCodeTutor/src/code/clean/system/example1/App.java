package code.clean.system.example1;

import code.clean.system.example1.Controller;

public class App {

	public static void main(String[] args) {
		Service service = new DefaultService();
		Controller controller = new Controller(service);
		controller.doAction();
	}
}