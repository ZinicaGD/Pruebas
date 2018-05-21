import javax.swing.*;
import java.awt.*;

public class Variables {
    public static void main(String[] args) {
        miMarco marco1=new miMarco();
        MarcoCentrado marco2=new MarcoCentrado();
        marco2.setVisible(true);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class miMarco extends JFrame {
    public miMarco(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500,300,500,300);
        setVisible(true);
        //setResizable(false);
        setTitle("Mi ventana");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }


}
class MarcoCentrado extends  JFrame{
    public MarcoCentrado(){
        Toolkit miPantalla=Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla=miPantalla.getScreenSize();
        int anchoPantalla=tamanoPantalla.width;
        int altoPantalla=tamanoPantalla.height;
        setSize(anchoPantalla/2,altoPantalla/2);
        setLocation(anchoPantalla/4,altoPantalla/4);

    }

}