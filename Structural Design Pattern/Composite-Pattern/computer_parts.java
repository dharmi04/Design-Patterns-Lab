public class computer_parts {
    public static void main(String[] args) {
        Component hd= new Leaf(4000,"HDD");
        Component mouse= new Leaf(4005,"Mouse");
        Component monitor= new Leaf(4400,"Monitor");
        Component Ram= new Leaf(3000,"Ram");
        Component cpu= new Leaf(4500,"CPU");
        

        Composite ph = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("Mother Board");
        Composite computer = new Composite("Computer");
        

        mb.addComponent(cpu);
        mb.addComponent(Ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hd);  
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);

        computer.showPrice();


    }
}