
import java.awt.*;
import javax.swing.*;

public class ZhuoQiu1 extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/qiu.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/zhuo.jpg");
	
	double x = 100;		//С�������
	double y = 100;		//С��������
	boolean right = true;	//����
	//������
	public void paint(Graphics g) {
		System.out.println("���ڱ����»���һ��");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball,(int)x,(int)y, null);
		
		if(right) {
			x = x + 10;
		}else {
			x = x - 10;
		}
		
		if(x>856-40-30) {	//40�����ӿ�30��С��ֱ��
			right = false;
		}
		if(x<40) {
			right = true;
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
		ZhuoQiu1 game = new ZhuoQiu1();
		game.launchFrame();
	}
}
