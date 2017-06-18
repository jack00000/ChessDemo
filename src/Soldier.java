import java.awt.Cursor;						
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;						
import javax.swing.event.MouseInputListener;		/*该类需导入的包*/

public class Soldier extends JButton{			//棋子模板类，该类继承自JButton类，可在构造方法中定义该类的属性和方法
	protected Point origin=new Point(this.getLocation());	//Point对象origin用以记录棋子的位置
	protected boolean isRed=true;	//布尔类型变量标记棋子的颜色，值为true时为红子，为false时为黑子
	protected boolean isAlive=true;		//布尔类型变量标识棋子的存活状态，值为true时存活，为false时死亡
	public boolean isSettled=true;		//布尔型变量标识棋子是否正在被移动，值为true时固定，为false时正被移动
	public boolean thisTurn=true;		//布尔型变量标识回合，值为true时红子回合，为false时黑子回合
	public boolean movePiece(Point p){		/*棋子移动方法，可移动时返回true*/
		if(Math.sqrt(Math.pow(getLocation().x-p.x, 2)+Math.pow(getLocation().y-p.y, 2))<40&&isAlive&&isSettled==false){
			setLocation(p);
			return true;}
		else
			return false;
	}
	public Soldier(ImageIcon ic1,ImageIcon ic2){		/*该类的自定义带参构造函数，在类中定义该类的各种属性*/
	super();		//继承父类JButton的所有方法
	setSize(ic1.getIconWidth(),ic1.getIconHeight());	//设置棋子大小的方法
	setIcon(ic1);		//为棋子设置Icon
	setBorderPainted(false);		//去掉棋子边框
	setOpaque(false);		//设置棋子透明度
	setContentAreaFilled(false);		//去掉棋子Icon的原本形状
	setFocusPainted(false);		//设置棋子被选中时不产生效果
	if(isAlive)		//判定并设置棋子存活状态
		setVisible(true);
	else
		setVisible(false);
	if(thisTurn)
	addMouseListener(new MouseListener() {		/*添加鼠标事件监听器*/
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			setIcon(ic1);		// 当光标离开棋子改变Icon
			isSettled=true;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			setIcon(ic2);		// 当光标移动至棋子上，改变棋子Icon
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));		//当光标移动至棋子上，光标形态发生改变
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	if(thisTurn)
	addMouseMotionListener(new MouseInputListener() {		/*添加鼠标动作监听器*/
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {		/*设置棋子拖动效果*/
			// TODO Auto-generated method stub
			isSettled=false;
			Point p=getLocation();
			setLocation((int)(p.x+(e.getX()-origin.getX())-20), (int)(p.y+(e.getY()-origin.getY())-20));
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {		/*设置棋子被拖动时位置的改变*/
			// TODO Auto-generated method stub
			origin.x=e.getX();
			origin.y=e.getY();
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			isSettled=true;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
		
		}
	});
	
}}

