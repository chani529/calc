package paintBrush;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class paint extends JFrame{
	

	private JFrame frame;
	boolean tf = false;
	Color selectedColor;


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					paint window = new paint();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public paint() {
		initialize();
	}

	  int thickness = 10; // �� ������ �׷����� ���� ���⸦ �����Ҷ� ���氪�� ����Ǵ� ����
	    int startX; // ���콺Ŭ�������� X��ǥ���� ����� ����
	    int startY; // ���콺Ŭ�������� Y��ǥ���� ����� ����
	    int endX; // ���콺Ŭ�������� X��ǥ���� ����� ����
	    int endY; // ���콺Ŭ�������� Y��ǥ���� ����� ����
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("�׸���");
		frame.setLocationRelativeTo(null);
		
		Graphics graphics;
	    Graphics2D g;
	    
	    
	    
	   
		
		

		
		
		JPanel panel = new JPanel();
		panel.setBounds(112, 20, 472, 341);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
        panel.setBackground(Color.white);
        panel.setLayout(null); 
		
		JButton btnNewButton = new JButton("����");
		btnNewButton.setBounds(0, 24, 99, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("���찳");
		btnNewButton_1.setBounds(0, 76, 97, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton color = new JButton("color");
		color.setBounds(0, 299, 97, 23);
		color.setBackground(Color.PINK);
		frame.getContentPane().add(color);
		
		JLabel lblNewLabel = new JLabel("11111111111111111111111111111111111111");
		lblNewLabel.setBounds(0, 0, 584, 23);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		 graphics = getGraphics(); // �׷����ʱ�ȭ
	        g = (Graphics2D)graphics; 
	        // ������ graphics������ Graphics2D�� ��ȯ�� Graphics2D�� �ʱ�ȭ
	        // �Ϲ����� Graphics�� �ƴ� Graphics2D�� ����� ������ ���� ����� ���õ� �����
	        //�����ϱ� ���Ͽ� Graphics2D Ŭ������ ��üȭ��
	        g.setColor(selectedColor); 
		
		panel.addMouseListener(new MouseListener() { 
            // paint_panel������ MouseListener �̺�Ʈ ó��
            public void mousePressed(MouseEvent e) { 
            // paint_panel�� ���콺 ������ �׼��� ������ �� �޼ҵ� ����
            	startX = e.getX(); // ���콺�� �������� �׶��� X��ǥ������ �ʱ�ȭ
                startY = e.getY(); // ���콺�� �������� �׶��� Y��ǥ������ �ʱ�ȭ
            }
            public void mouseClicked(MouseEvent e) {} // Ŭ���̺�Ʈ ó��
            public void mouseEntered(MouseEvent e) {} // paint_panel���� ���� ���Խ� �̺�Ʈ ó��
            public void mouseExited(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            

	});
		color.addActionListener(new ActionListener() {
	          // �������ư �׼�ó���� �͸�Ŭ������ �ۼ�
	            public void actionPerformed(ActionEvent e) { // �������̵�
	                tf = true; // ������ ���� ������ �����Ƿ� ��ŵ..
	                JColorChooser chooser = new JColorChooser(); // JColorChooser Ŭ������üȭ
	                selectedColor = chooser.showDialog(null, "Color", Color.ORANGE); 
	                // selectedColor�� ���õȻ����� �ʱ�ȭ
	                g.setColor(selectedColor);
	                        // �׷����� ���� ������ selectedColor�� �Ű������� �Ͽ� ����
	            }
	        });

}
}

