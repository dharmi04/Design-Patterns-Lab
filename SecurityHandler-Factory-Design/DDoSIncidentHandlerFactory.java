// DDoSIncidentHandlerFactory.java
public class DDoSIncidentHandlerFactory implements SecurityHandlerFactory {
    public SecurityHandler createIncidentHandler() {
        return new DDoSIncidentHandler();
    }
}