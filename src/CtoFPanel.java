import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;


public class CtoFPanel extends JPanel {
	private JTextField txtTempC;
	private JTextField txtAnswer;
	public CtoFPanel() {
		setLayout(null);
		
		JLabel lblC = new JLabel("C\u00BA");
		lblC.setBounds(131, 94, 21, 16);
		add(lblC);
		
		txtTempC = new JTextField();
		txtTempC.setBounds(182, 88, 134, 28);
		add(txtTempC);
		txtTempC.setColumns(10);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		double Ctemp = Double.parseDouble(txtTempC.getText());
		
		double ans = Ctemp;
	
			ans = Ctemp * (1.8) + 32;
		txtAnswer.setText("     F¼" + ans);
		
			}
		});
		btnConvert.setBounds(182, 148, 117, 29);
		add(btnConvert);
		
		JLabel lblNewLabel = new JLabel("Ryan's Temperature Converter");
		lblNewLabel.setBounds(144, 6, 202, 16);
		add(lblNewLabel);
		
		txtAnswer = new JTextField();
		txtAnswer.setBounds(182, 220, 134, 28);
		add(txtAnswer);
		txtAnswer.setColumns(10);
	}
}
