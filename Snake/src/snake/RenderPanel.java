package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RenderPanel extends JPanel {

	
	public static Color blue = new Color(3394815);
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(blue);
		g.fillRect(0, 0, 800, 700);
		Snake snake = Snake.snake;
		g.setColor(Color.BLACK);
		for (Point point : snake.snakeParts)
		{
	    g.fillRect(point.x * Snake.SCALE, point.y * Snake.SCALE,
					Snake.SCALE, Snake.SCALE);
			}
		g.fillRect(snake.head.x * Snake.SCALE, snake.head.y * Snake.SCALE,
				Snake.SCALE, Snake.SCALE);
		g.setColor(Color.RED);
		g.fillRect(snake.cherry.x * Snake.SCALE, snake.cherry.y * Snake.SCALE,
				Snake.SCALE, Snake.SCALE);
		String string = "Score: " + snake.score + ", Lenght: " + snake.tailLenght + ", Time: " + snake.time / 20;
		g.setColor(Color.white);
		g.drawString(string, (int) (getWidth() / 2 - string.length() * 2.5f), 10);
		
		String legenda = "Legenda: CRVENO = Malina, Plen, Toribar. CRNO = Predator, Zmija, Strabonji kralj." ;
		g.setColor(Color.white);
		g.drawString(legenda, (int) (getWidth() / 2 - string.length() * 8.3f), 650);
		
		String kontrole = "Kontrola: W=GORE S=DOLE A=LEVO D=DESNO SPACE=PAUZA, RESTART" ;
		g.setColor(Color.white);
		g.drawString(kontrole, (int) (getWidth() / 2 - string.length() * 7.6f), 665);
	}
}
