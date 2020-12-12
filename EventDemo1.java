import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventDemo1 extends JFrame implements MouseMotionListener
{
	int x,y;
	JLabel position;
	public EventDemo1()
	{
		super("mouse motion event demo");
		position=new JLabel();
		setLayout(new FlowLayout());
		add(position);
		setSize(320,300);
		setVisible(true);
		addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		position.setText("mouse cursor is at "+x+" "+y);
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		position.setText("mouse is dragged at "+x+" "+y);
	}
	public static void main(String[] args)
	{
		EventDemo1 obj=new EventDemo1();
	}
}
