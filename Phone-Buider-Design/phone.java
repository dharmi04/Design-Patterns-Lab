public class phone {
    private String os;
    private int ram;
    private String processor;
    private int battery;

    public phone(String os, int ram, String processor, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.battery = battery;
    }

    public String toString() {
        return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", battery=" + battery + "]";
    }
}
