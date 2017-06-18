import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TestImage extends JFrame{
TestImage(){
	setSize(500,500);
	setVisible(true);
	setLayout(null);
	ImageIcon ic=new ImageIcon(TestImage.class.getResource("/ºì±ø.png"));
	JButton jb=new JButton(ic);
	add(jb);
	jb.setBounds(0,0,ic.getIconWidth(),ic.getIconHeight());
	jb.setOpaque(true);
	jb.setBorderPainted(false);
	
}
public static void main(String[] args) {
	new TestImage();
}
}
