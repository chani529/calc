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

	  int thickness = 10; // 현 변수는 그려지는 선의 굴기를 변경할때 변경값이 저장되는 변수
	    int startX; // 마우스클릭시작의 X좌표값이 저장될 변수
	    int startY; // 마우스클릭시작의 Y좌표값이 저장될 변수
	    int endX; // 마우스클릭종료의 X좌표값이 저장될 변수
	    int endY; // 마우스클릭종료의 Y좌표값이 저장될 변수
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("그림판");
		frame.setLocationRelativeTo(null);
		
		Graphics graphics;
	    Graphics2D g;
	    
	    
	    
	   
		
		

		
		
		JPanel panel = new JPanel();
		panel.setBounds(112, 20, 472, 341);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
        panel.setBackground(Color.white);
        panel.setLayout(null); 
		
		JButton btnNewButton = new JButton("연필");
		btnNewButton.setBounds(0, 24, 99, 42);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("지우개");
		btnNewButton_1.setBounds(0, 76, 97, 42);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton color = new JButton("color");
		color.setBounds(0, 299, 97, 23);
		color.setBackground(Color.PINK);
		frame.getContentPane().add(color);
		
		JLabel lblNewLabel = new JLabel("11111111111111111111111111111111111111");
		lblNewLabel.setBounds(0, 0, 584, 23);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		 graphics = getGraphics(); // 그래픽초기화
	        g = (Graphics2D)graphics; 
	        // 기존의 graphics변수를 Graphics2D로 변환후 Graphics2D에 초기화
	        // 일반적인 Graphics가 아닌 Graphics2D를 사용한 이유는 펜의 굴기와 관련된 기능을
	        //수행하기 위하여 Graphics2D 클래스를 객체화함
	        g.setColor(selectedColor); 
		
		panel.addMouseListener(new MouseListener() { 
            // paint_panel에서의 MouseListener 이벤트 처리
            public void mousePressed(MouseEvent e) { 
            // paint_panel에 마우스 눌림의 액션이 있을떄 밑 메소드 실행
            	startX = e.getX(); // 마우스가 눌렸을때 그때의 X좌표값으로 초기화
                startY = e.getY(); // 마우스가 눌렸을때 그때의 Y좌표값으로 초기화
            }
            public void mouseClicked(MouseEvent e) {} // 클릭이벤트 처리
            public void mouseEntered(MouseEvent e) {} // paint_panel범위 내에 진입시 이벤트 처리
            public void mouseExited(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            

	});
		color.addActionListener(new ActionListener() {
	          // 선색상버튼 액션처리를 익명클래스로 작성
	            public void actionPerformed(ActionEvent e) { // 오버라이딩
	                tf = true; // 위에서 변수 설명을 했으므로 스킵..
	                JColorChooser chooser = new JColorChooser(); // JColorChooser 클래스객체화
	                selectedColor = chooser.showDialog(null, "Color", Color.ORANGE); 
	                // selectedColor에 선택된색으로 초기화
	                g.setColor(selectedColor);
	                        // 그려지는 펜의 색상을 selectedColor를 매개변수로 하여 지정
	            }
	        });

}
}

