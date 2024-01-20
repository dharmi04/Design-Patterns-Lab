public class Phone_Builder {
    private String os;
    private int ram;
    private String processor;
    private int battery;

	// public String getOs() {
	// 	return this.os;
	// }

	public Phone_Builder setOs(String os) {
		this.os = os;
        return this;
	}

	// public int getRam() {
	// 	return this.ram;
	// }

	public Phone_Builder setRam(int ram) {
		this.ram = ram;
        return this;
	}

	// public String getProcessor() {
	// 	return this.processor;
	// }

	public Phone_Builder setProcessor(String processor) {
		this.processor = processor;
        return this;
	}

	// public int getBattery() {
	// 	return this.battery;
	// }

	public Phone_Builder setBattery(int battery) {
		this.battery = battery;
        return this;
	}
    public phone getPhone(){
        return new phone(os,ram,processor,battery);
    }


    
}
