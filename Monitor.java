package monitor;

public class Monitor {
	
	public boolean isOn;
	public String brand;
 
	//default constructor
	public Monitor() {
		isOn = false;
		brand = "";
	}
	//parameterised constructor
	public Monitor(boolean On, String monitorBrand) {
		isOn = false;
		brand = monitorBrand;
	}
	public void start() {
		isOn = true;
	}

	public void shutdown() {
		isOn = false;
	}
}
