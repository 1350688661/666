
import java.awt.*;
import javax.swing.*;

public class ZhuoQiu2 extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/qiu.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/zhuo.jpg");
	
	double x = 100;		//С�������
	double y = 100;		//С��������
	double degree = 3.14/3;	//���ȣ���60��
	
	//������
	public void paint(Graphics g) {
		System.out.println("���ڱ����»���һ��");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball,(int)x,(int)y, null);
		
		x = x + 10 *Math.cos(degree);
		y = y + 10 *Math.sin(degree);
		
		if(y>500-40-30||y<40+40) {
			degree = -degree;
		}
		
		//�������ұ߽�
		if(x<40||x>856-40-30) {
			degree = 3.14 - degree;
		}
		
	}
	
	//���ڼ���
	void launchFrame() {
		setSize(856,500);		//���ڴ�С
		setLocation(50,50);		//����λ��
		setVisible(true);
		
		//�ػ�����
		while(true) {
			repaint();
			try {
				Thread.sleep(40);	//40ms����Լһ��20��
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
