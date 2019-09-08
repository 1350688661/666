
import java.awt.*;
import javax.swing.*;

public class ZhuoQiu2 extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/qiu.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/zhuo.jpg");
	
	double x = 100;		//小球横坐标
	double y = 100;		//小球纵坐标
	double degree = 3.14/3;	//弧度，即60度
	
	//画窗口
	public void paint(Graphics g) {
		System.out.println("窗口被重新画了一次");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball,(int)x,(int)y, null);
		
		x = x + 10 *Math.cos(degree);
		y = y + 10 *Math.sin(degree);
		
		if(y>500-40-30||y<40+40) {
			degree = -degree;
		}
		
		//碰到左右边界
		if(x<40||x>856-40-30) {
			degree = 3.14 - degree;
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
		ZhuoQiu2 game = new ZhuoQiu2();
		game.launchFrame();
	}
}
