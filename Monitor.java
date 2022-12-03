package monitor;

public class Monitor {
	public boolean isOn;
	public String brand;
 
	public Monitor() {
		isOn = false;
		brand = "";
	}
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
