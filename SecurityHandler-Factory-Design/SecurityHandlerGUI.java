import javax.swing.*;

public class SecurityHandlerGUI extends JFrame {
    private JButton malwareButton, ddosButton;

    public SecurityHandlerGUI() {
        initializeComponents();
        setupLayout();
        setListeners();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initializeComponents() {
        malwareButton = new JButton("Handle Malware Incident");
        ddosButton = new JButton("Handle DDoS Incident");
    }

    private void setupLayout() {
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(malwareButton);
        add(ddosButton);
    }

    private void setListeners() {
        malwareButton.addActionListener(e -> handleSecurityIncident(new MalwareIncidentHandlerFactory()));
        ddosButton.addActionListener(e -> handleSecurityIncident(new DDoSIncidentHandlerFactory()));
    }

    private Object handleSecurityIncident(DDoSIncidentHandlerFactory dDoSIncidentHandlerFactory) {
        throw new UnsupportedOperationException("Unimplemented method 'handleSecurityIncident'");
    }

    private void handleSecurityIncident(MalwareIncidentHandlerFactory malwareIncidentHandlerFactory) {
        SecurityHandler handler = ((SecurityHandlerFactory) malwareIncidentHandlerFactory).createIncidentHandler();
        handler.handleIncident();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SecurityHandlerGUI());
    }
}
