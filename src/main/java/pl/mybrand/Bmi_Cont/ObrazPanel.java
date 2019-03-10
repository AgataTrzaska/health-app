package pl.mybrand.Bmi_Cont;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ObrazPanel extends JPanel {

    private BufferedImage image;

    public ObrazPanel() {
        super();

        File imageFile = new File("http://brzuchobrzucho.pl/wp-content/uploads/2017/08/wychudzenie-dolegliwosci-mogace-sie-pojawic-kazdym-wieku-678x381.jpghttp://brzuchobrzucho.pl/wp-content/uploads/2017/08/wychudzenie-dolegliwosci-mogace-sie-pojawic-kazdym-wieku-678x381.jpg");
        try {
            image = ImageIO.read(imageFile);
        } catch (IOException e) {
            System.err.println("Blad odczytu obrazka");
            e.printStackTrace();
        }

        Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
        setPreferredSize(dimension);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, 0, 0, this);
    }
}