import java.awt.Cursor;						
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;						
import javax.swing.event.MouseInputListener;		/*�����赼��İ�*/

public class Soldier extends JButton{			//����ģ���࣬����̳���JButton�࣬���ڹ��췽���ж����������Ժͷ���
	protected Point origin=new Point(this.getLocation());	//Point����origin���Լ�¼���ӵ�λ��
	protected boolean isRed=true;	//�������ͱ���������ӵ���ɫ��ֵΪtrueʱΪ���ӣ�ΪfalseʱΪ����
	protected boolean isAlive=true;		//�������ͱ�����ʶ���ӵĴ��״̬��ֵΪtrueʱ��Ϊfalseʱ����
	public boolean isSettled=true;		//�����ͱ�����ʶ�����Ƿ����ڱ��ƶ���ֵΪtrueʱ�̶���Ϊfalseʱ�����ƶ�
	public boolean thisTurn=true;		//�����ͱ�����ʶ�غϣ�ֵΪtrueʱ���ӻغϣ�Ϊfalseʱ���ӻغ�
	public boolean movePiece(Point p){		/*�����ƶ����������ƶ�ʱ����true*/
		if(Math.sqrt(Math.pow(getLocation().x-p.x, 2)+Math.pow(getLocation().y-p.y, 2))<40&&isAlive&&isSettled==false){
			setLocation(p);
			return true;}
		else
			return false;
	}
	public Soldier(ImageIcon ic1,ImageIcon ic2){		/*������Զ�����ι��캯���������ж������ĸ�������*/
	super();		//�̳и���JButton�����з���
	setSize(ic1.getIconWidth(),ic1.getIconHeight());	//�������Ӵ�С�ķ���
	setIcon(ic1);		//Ϊ��������Icon
	setBorderPainted(false);		//ȥ�����ӱ߿�
	setOpaque(false);		//��������͸����
	setContentAreaFilled(false);		//ȥ������Icon��ԭ����״
	setFocusPainted(false);		//�������ӱ�ѡ��ʱ������Ч��
	if(isAlive)		//�ж����������Ӵ��״̬
		setVisible(true);
	else
		setVisible(false);
	if(thisTurn)
	addMouseListener(new MouseListener() {		/*�������¼�������*/
		
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
			setIcon(ic1);		// ������뿪���Ӹı�Icon
			isSettled=true;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			setIcon(ic2);		// ������ƶ��������ϣ��ı�����Icon
			setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));		//������ƶ��������ϣ������̬�����ı�
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	if(thisTurn)
	addMouseMotionListener(new MouseInputListener() {		/*�����궯��������*/
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {		/*���������϶�Ч��*/
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
		public void mousePressed(MouseEvent e) {		/*�������ӱ��϶�ʱλ�õĸı�*/
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

