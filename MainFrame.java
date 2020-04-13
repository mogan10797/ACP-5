import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.event.*;
import java.awt.ActionEvent;

public class MainFrame extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JLabel jlb = new JLabel("^V^");
    private Container cp;
    private JButton jbtn = new JButton("Push");
    private JButton jbtn2 = new JButton("Sub");
    private int a = 0;

    public MainFrame() {
        init();
    }

    private void init() {
        this.setSize(400, 300);
        this.setLocation(100, 100);
        this.setTitle("window");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(null);
        jlb.setBounds(670, 200, 100, 100);
        cp.add(jlb);
        jbtn.setBounds(500, 300, 150, 150);
        cp.add(jbtn);
        jbtn2.setBounds(700, 300, 150, 150);
        cp.add(jbtn2);
        jbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                a++;
                jlb.setText(Integer.toString(a));
            }
        });
        jbtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                a--;
                jlb.setText(Integer.toString(a));
            }
        });
    }
}