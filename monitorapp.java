package monitor;

public class monitorapp {

	public static void main(String[] args) {

		Monitor monitor1 = new Monitor();
		Monitor monitor2 = new Monitor(true, "Asus");

		monitor1.start();

//		System.out.println(monitor2.isOn);

		if (monitor1.isOn) {
			System.out.println("Monitor1 is on");
		}
		if (monitor2.isOn) {
			System.out.println("Monitor2 is on");
		} else {
			System.out.println("Monitor2 is off");
		}
		    System.out.println(monitor1.brand);
		    System.out.println(monitor2.brand);
		
	}
}

