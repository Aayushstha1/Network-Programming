import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;   // ✅ added
import java.net.Socket;
import javax.swing.*;

public class whoisGui extends JFrame {

    JTextArea textArea;
    JTextField DomainField;
    JButton searchButton;

    public whoisGui() {
        setTitle("who is lookup");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel();
        JLabel domainLabel = new JLabel("Domain:");
        DomainField = new JTextField(20);
        searchButton = new JButton("Search");

        topPanel.add(domainLabel);
        topPanel.add(DomainField);
        topPanel.add(searchButton);
        add(topPanel, "North");

        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, "Center");

        searchButton.addActionListener(e -> lookUP());
    }

    public void lookUP() {
        String domain = DomainField.getText().trim();
        if (domain.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a domain name.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        textArea.setText("Looking up WHOIS information for " + domain + "...\n");

        try {
            Socket socket = new Socket("whois.verisign-grs.com", 43);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            String line;
            out.println(domain);

            while ((line = in.readLine()) != null) {
                textArea.append(line + "\n");
            }
        } catch (Exception e) {
            textArea.append("Error: " + e.getMessage() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            whoisGui gui = new whoisGui();
            gui.setVisible(true);
        });
    }
}
