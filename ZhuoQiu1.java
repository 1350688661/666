
import java.awt.*;
import javax.swing.*;

public class ZhuoQiu1 extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/qiu.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/zhuo.jpg");
	
	double x = 100;		//小球横坐标
	double y = 100;		//小球纵坐标
	boolean right = true;	//方向
	//画窗口
	public void paint(Graphics g) {
		System.out.println("窗口被重新画了一次");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball,(int)x,(int)y, null);
		
		if(right) {
			x = x + 10;
		}else {
			x = x - 10;
		}
		
		if(x>856-40-30) {	//40是桌子宽，30是小球直径
			right = false;
		}
		if(x<40) {
			right = true;
		}
	
	}
	
	//窗口加载
	void launchFrame() {
		setSize(856,500);		//窗口大小
		setLocation(50,50);		//窗口位置
		setVisible(true);
		
		//重画窗口
		while(true) {
			repaint();
			try {
				Thread.sleep(40);	//40ms，大约一秒20次
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("hello world");
		ZhuoQiu1 game = new ZhuoQiu1();
		game.launchFrame();
	}
}
