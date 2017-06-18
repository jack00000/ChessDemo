import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

public class TestChess extends JFrame{
protected JLayeredPane jlp;
protected JFrame jf=new JFrame("Chess");
private ImageIcon nextstep=new ImageIcon(TestChess.class.getResource("OO.GIF"));
private ImageIcon settled=new ImageIcon(TestChess.class.getResource("OOS.GIF"));
private ImageIcon rsoldier=new ImageIcon(TestChess.class.getResource("RP.GIF")),rssoldier=new ImageIcon(TestChess.class.getResource("RPS.GIF"));
private ImageIcon bsoldier=new ImageIcon(TestChess.class.getResource("BP.GIF")),bssoldier=new ImageIcon(TestChess.class.getResource("BPS.GIF"));;
private ImageIcon rgeneral=new ImageIcon(TestChess.class.getResource("RK.GIF")),rsgeneral=new ImageIcon(TestChess.class.getResource("RKS.GIF"));
private ImageIcon bgeneral=new ImageIcon(TestChess.class.getResource("BK.GIF")),bsgeneral=new ImageIcon(TestChess.class.getResource("BKS.GIF"));
private ImageIcon relephant=new ImageIcon(TestChess.class.getResource("RB.GIF")),rselephant=new ImageIcon(TestChess.class.getResource("RBS.GIF"));
private ImageIcon belephant=new ImageIcon(TestChess.class.getResource("BB.GIF")),bselephant=new ImageIcon(TestChess.class.getResource("BBS.GIF"));
private ImageIcon rguard=new ImageIcon(TestChess.class.getResource("RA.GIF")),rsguard=new ImageIcon(TestChess.class.getResource("RAS.GIF"));
private ImageIcon bguard=new ImageIcon(TestChess.class.getResource("BA.GIF")),bsguard=new ImageIcon(TestChess.class.getResource("BAS.GIF"));
private ImageIcon rhorse=new ImageIcon(TestChess.class.getResource("RN.GIF")),rshorse=new ImageIcon(TestChess.class.getResource("RNS.GIF"));
private ImageIcon bhorse=new ImageIcon(TestChess.class.getResource("BN.GIF")),bshorse=new ImageIcon(TestChess.class.getResource("BNS.GIF"));
private ImageIcon rcar=new ImageIcon(TestChess.class.getResource("RR.GIF")),rscar=new ImageIcon(TestChess.class.getResource("RRS.GIF"));
private ImageIcon bcar=new ImageIcon(TestChess.class.getResource("BR.GIF")),bscar=new ImageIcon(TestChess.class.getResource("BRS.GIF"));
private ImageIcon rcannon=new ImageIcon(TestChess.class.getResource("RC.GIF")),rscannon=new ImageIcon(TestChess.class.getResource("RCS.GIF"));
private ImageIcon bcannon=new ImageIcon(TestChess.class.getResource("BC.GIF")),bscannon=new ImageIcon(TestChess.class.getResource("BCS.GIF"));
protected Soldier nextcursor;
protected Soldier rsoldier1,rsoldier2,rsoldier3,rsoldier4,rsoldier5;
protected Soldier bsoldier1,bsoldier2,bsoldier3,bsoldier4,bsoldier5;
protected Soldier redgeneral,blackgeneral;
protected Soldier redelephant1,redelephant2,blackelephant1,blackelephant2;
protected Soldier redguard1,redguard2,blackguard1,blackguard2;
protected Soldier redhorse1,redhorse2,blackhorse1,blackhorse2;
protected Soldier redcar1,redcar2,blackcar1,blackcar2;
protected Soldier redcannon1,redcannon2,blackcannon1,blackcannon2;			 
public TestChess(){
	initiate();
	addSoldiers();
	addGenerals();
	addElephants();
	addGuards();
	addHorses();
	addCars();
	addCannons();
	setBlackPieces();
	boolean turn=true;
	while(true){
		RedmakeMoveandEat(turn);
	}
}
void initiate(){
	jlp=new JLayeredPane();
	ImageIcon ic=new ImageIcon(TestChess.class.getResource("/chess.jpg"));
	JLabel jl=new JLabel(ic);
	jl.setSize(ic.getIconWidth(), ic.getIconHeight());
	jlp.add(jl, JLayeredPane.DEFAULT_LAYER);
	jf.setSize(ic.getIconWidth()+15, ic.getIconHeight()+15);
	jf.setVisible(true);
	jf.setLayeredPane(jlp);
}
void addSoldiers(){
	rsoldier1=new Soldier(rsoldier,rssoldier);
	jlp.add(rsoldier1, JLayeredPane.PALETTE_LAYER);
	rsoldier1.setLocation(30,200);
	rsoldier2=new Soldier(rsoldier,rssoldier);
	jlp.add(rsoldier2, JLayeredPane.PALETTE_LAYER);
	rsoldier2.setLocation(145,200);
	rsoldier3=new Soldier(rsoldier,rssoldier);
	jlp.add(rsoldier3, JLayeredPane.PALETTE_LAYER);
	rsoldier3.setLocation(255,200);
	rsoldier4=new Soldier(rsoldier,rssoldier);
	jlp.add(rsoldier4, JLayeredPane.PALETTE_LAYER);
	rsoldier4.setLocation(365,200);
	rsoldier5=new Soldier(rsoldier,rssoldier);
	jlp.add(rsoldier5, JLayeredPane.PALETTE_LAYER);
	rsoldier5.setLocation(475,200);
	bsoldier1=new Soldier(bsoldier,bssoldier);
	jlp.add(bsoldier1, JLayeredPane.PALETTE_LAYER);
	bsoldier1.setLocation(30,360);
	bsoldier2=new Soldier(bsoldier,bssoldier);
	jlp.add(bsoldier2, JLayeredPane.PALETTE_LAYER);
	bsoldier2.setLocation(145,360);
	bsoldier3=new Soldier(bsoldier,bssoldier);
	jlp.add(bsoldier3, JLayeredPane.PALETTE_LAYER);
	bsoldier3.setLocation(255,360);
	bsoldier4=new Soldier(bsoldier,bssoldier);
	jlp.add(bsoldier4, JLayeredPane.PALETTE_LAYER);
	bsoldier4.setLocation(365,360);
	bsoldier5=new Soldier(bsoldier,bssoldier);
	jlp.add(bsoldier5, JLayeredPane.PALETTE_LAYER);
	bsoldier5.setLocation(475,360);
}

void addElephants(){
	redelephant1=new Soldier(relephant,rselephant);
	jlp.add(redelephant1, JLayeredPane.PALETTE_LAYER);
	redelephant1.setLocation(145,35);
	redelephant2=new Soldier(relephant,rselephant);
	jlp.add(redelephant2, JLayeredPane.PALETTE_LAYER);
	redelephant2.setLocation(365,35);
	blackelephant1=new Soldier(belephant,bselephant);
	jlp.add(blackelephant1, JLayeredPane.PALETTE_LAYER);
	blackelephant1.setLocation(145,525);
	blackelephant2=new Soldier(belephant,bselephant);
	jlp.add(blackelephant2, JLayeredPane.PALETTE_LAYER);
	blackelephant2.setLocation(365,525);
}
void addGuards(){
	redguard1=new Soldier(rguard,rsguard);
	jlp.add(redguard1, JLayeredPane.PALETTE_LAYER);
	redguard1.setLocation(200,35);
	redguard2=new Soldier(rguard,rsguard);
	jlp.add(redguard2, JLayeredPane.PALETTE_LAYER);
	redguard2.setLocation(310,35);
	blackguard1=new Soldier(bguard,bsguard);
	jlp.add(blackguard1, JLayeredPane.PALETTE_LAYER);
	blackguard1.setLocation(200,525);
	blackguard2=new Soldier(bguard,bsguard);
	jlp.add(blackguard2, JLayeredPane.PALETTE_LAYER);
	blackguard2.setLocation(310,525);
}
void addHorses(){
	redhorse1=new Soldier(rhorse,rshorse);
	jlp.add(redhorse1, JLayeredPane.PALETTE_LAYER);
	redhorse1.setLocation(90,35);
	redhorse2=new Soldier(rhorse,rshorse);
	jlp.add(redhorse2, JLayeredPane.PALETTE_LAYER);
	redhorse2.setLocation(420,35);
	blackhorse1=new Soldier(bhorse,bshorse);
	jlp.add(blackhorse1, JLayeredPane.PALETTE_LAYER);
	blackhorse1.setLocation(90,525);
	blackhorse2=new Soldier(bhorse,bshorse);
	jlp.add(blackhorse2, JLayeredPane.PALETTE_LAYER);
	blackhorse2.setLocation(420,525);
}
void addCars(){
	redcar1=new Soldier(rcar,rscar);
	jlp.add(redcar1, JLayeredPane.PALETTE_LAYER);
	redcar1.setLocation(30,35);
	redcar2=new Soldier(rcar,rscar);
	jlp.add(redcar2, JLayeredPane.PALETTE_LAYER);
	redcar2.setLocation(475,35);
	blackcar1=new Soldier(bcar,bscar);
	jlp.add(blackcar1, JLayeredPane.PALETTE_LAYER);
	blackcar1.setLocation(30,525);
	blackcar2=new Soldier(bcar,bscar);
	jlp.add(blackcar2, JLayeredPane.PALETTE_LAYER);
	blackcar2.setLocation(475,525);
}
void addCannons(){
	redcannon1=new Soldier(rcannon,rscannon);
	jlp.add(redcannon1, JLayeredPane.PALETTE_LAYER);
	redcannon1.setLocation(90,145);
	redcannon2=new Soldier(rcannon,rscannon);
	jlp.add(redcannon2, JLayeredPane.PALETTE_LAYER);
	redcannon2.setLocation(420,145);
	blackcannon1=new Soldier(bcannon,bscannon);
	jlp.add(blackcannon1, JLayeredPane.PALETTE_LAYER);
	blackcannon1.setLocation(90,415);
	blackcannon2=new Soldier(bcannon,bscannon);
	jlp.add(blackcannon2, JLayeredPane.PALETTE_LAYER);
	blackcannon2.setLocation(420,415);
}
void addGenerals(){
	redgeneral=new Soldier(rgeneral,rsgeneral);
	jlp.add(redgeneral, JLayeredPane.PALETTE_LAYER);
	redgeneral.setLocation(255,35);
	blackgeneral=new Soldier(bgeneral,bsgeneral);
	jlp.add(blackgeneral, JLayeredPane.PALETTE_LAYER);
	blackgeneral.setLocation(255,525);
}
void RedmakeMoveandEat(boolean b){
	Point [][]p={{new Point(30,35),new Point(90,35),new Point(145,35),new Point(200,35),new Point(255,35),new Point(310,35),new Point(365,35),new Point(420,35),new Point(475,35)},
            {new Point(30,85),new Point(90,85),new Point(145,85),new Point(200,85),new Point(255,85),new Point(310,85),new Point(365,85),new Point(420,85),new Point(475,85)},
            {new Point(30,145),new Point(90,145),new Point(145,145),new Point(200,145),new Point(255,145),new Point(310,145),new Point(365,145),new Point(420,145),new Point(475,145)},
            {new Point(30,200),new Point(90,200),new Point(145,200),new Point(200,200),new Point(255,200),new Point(310,200),new Point(365,200),new Point(420,200),new Point(475,200)},
            {new Point(30,250),new Point(90,250),new Point(145,250),new Point(200,250),new Point(255,250),new Point(310,250),new Point(365,250),new Point(420,250),new Point(475,250)},
            {new Point(30,305),new Point(90,305),new Point(145,305),new Point(200,305),new Point(255,305),new Point(310,305),new Point(365,305),new Point(420,305),new Point(475,305)},
            {new Point(30,360),new Point(90,360),new Point(145,360),new Point(200,360),new Point(255,360),new Point(310,360),new Point(365,360),new Point(420,360),new Point(475,360)},
            {new Point(30,415),new Point(90,415),new Point(145,415),new Point(200,415),new Point(255,415),new Point(310,415),new Point(365,415),new Point(420,415),new Point(475,415)},
            {new Point(30,470),new Point(90,475),new Point(145,470),new Point(200,470),new Point(255,470),new Point(310,470),new Point(365,470),new Point(420,470),new Point(475,470)},
            {new Point(30,525),new Point(90,525),new Point(145,525),new Point(200,525),new Point(255,525),new Point(310,525),new Point(365,525),new Point(420,525),new Point(475,525)}};
	Soldier []allPieces={rsoldier1,rsoldier2,rsoldier3,rsoldier4,rsoldier5,bsoldier1,bsoldier2,bsoldier3,bsoldier4,bsoldier5,redgeneral,blackgeneral,redelephant1,redelephant2,blackelephant1,blackelephant2,
			redguard1,redguard2,blackguard1,blackguard2,redhorse1,redhorse2,blackhorse1,blackhorse2,redcar1,redcar2,blackcar1,blackcar2,redcannon1,redcannon2,blackcannon1,blackcannon2};
	Soldier []redPieces={rsoldier1,rsoldier2,rsoldier3,rsoldier4,rsoldier5,redgeneral,redguard1,redguard2,redhorse1,redhorse2,redcar1,redcar2,redcannon1,redcannon2,redelephant1,redelephant2};
	Soldier []blackPieces={bsoldier1,bsoldier2,bsoldier3,bsoldier4,bsoldier5,blackguard1,blackguard2,blackhorse1,blackhorse2,blackcar1,blackcar2,blackcannon1,blackcannon2,blackgeneral,blackelephant1,blackelephant2};
	if(b){
	for(int i=0;i<32;i++)
		if(allPieces[i].isSettled==false&&allPieces[i].isAlive)
			for(int j=0;j<10;j++)
				for(int k=0;k<9;k++)
					if(allPieces[i].movePiece(p[j][k]))
						for(int m=0;m<32;m++)
							if(allPieces[m].getX()==p[j][k].getX()&&allPieces[m].getY()==p[j][k].getY()&&allPieces[m].isAlive){
								eatPiece(allPieces[i], allPieces[m]);}}
								
}
void setBlackPieces(){
	Soldier []blackPieces={bsoldier1,bsoldier2,bsoldier3,bsoldier4,bsoldier5,blackelephant1,blackelephant2,blackhorse1,blackhorse2,blackguard1,blackguard2,blackcar1,blackcar2,blackcannon1,blackcannon2,blackgeneral};
	for(int i=0;i<16;i++)
		blackPieces[i].isRed=false;
}
boolean eatPiece(Soldier s1,Soldier s2){
	if(s1.isRed!=s2.isRed&&s2.getLocation().x==blackgeneral.getLocation().x&&s2.getLocation().y==blackgeneral.getLocation().y){
		JOptionPane.showMessageDialog(null, "Red Win!");
		jf.dispose();
	}
	if(s1.isRed!=s2.isRed&&s2.getLocation().x==redgeneral.getLocation().x&&s2.getLocation().y==redgeneral.getLocation().y){
		JOptionPane.showMessageDialog(null, "Black Win!");
		jf.dispose();
	}
	if(s1.isRed!=s2.isRed&&s1.isAlive&&s2.isAlive&&s1.isSettled==false&&s2.isSettled){
		s1.setLocation(s2.getLocation());
		s2.isAlive=false;
		s2.setVisible(false);
		return true;}
	else
		return false;
}
public static void main(String[] args) {
	new TestChess();
}
}
