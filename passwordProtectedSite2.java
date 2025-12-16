import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class passwordProtectedSite2 {

    public static void main(String[] args) {
        Authenticator.setDefault(new DialogAuthenticator());
        System.out.println("Authenticator set successfully");
    }
}

class DialogAuthenticator extends Authenticator {

    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    private PasswordAuthentication authentication;

    public DialogAuthenticator() {

        Dialog dialog = new Dialog((Frame) null, "Authentication Required", true);
        dialog.setLayout(new GridLayout(3, 2));

        dialog.add(new Label("Username:"));
        dialog.add(username);
        dialog.add(new Label("Password:")     );
        dialog.add(password);

        Button ok = new Button("OK");
        dialog.add(ok);

        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                authentication = new PasswordAuthentication(
                        username.getText(),
                        password.getPassword()
                );
                dialog.setVisible(false);
            }
        });

        dialog.setSize(300, 150);
        dialog.setVisible(true);
    }

    protected PasswordAuthentication getPasswordAuthentication() {
        return authentication;
    }
}
