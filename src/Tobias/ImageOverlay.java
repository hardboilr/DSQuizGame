/**
 * @author Tobias
 */

package Tobias;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
//test
public class ImageOverlay {

    public static BufferedImage overlayImages (BufferedImage bgImage, BufferedImage fgImage) 
    {
        if (fgImage.getHeight() > bgImage.getHeight() || fgImage.getWidth() > bgImage.getWidth()) 
        {
            JOptionPane.showMessageDialog(null, "Foreground image is bigger in one dimension or two dimensions"
                                           + "\nCannot proceed with overlay."
                                           + "\n\n Please use smaller image for foreground");
        return null;
        }
        
        Graphics2D g = bgImage.createGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(bgImage, 0, 0, null);
        g.drawImage(fgImage, 0, 0, null);
        g.dispose();
        return bgImage;
    }
    
    public static BufferedImage readImage (String fileLocation) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(fileLocation));
        } catch (IOException e) {
        }
        return img;
    }
    
    public void overlay()  {
        try {

    // load source images
    BufferedImage image = ImageIO.read(new File("./art/images/holger.jpg"));
    BufferedImage overlay = ImageIO.read(new File("./art/images/holgerOverlay.png"));
    // create the new image, canvas size is the max. of both image sizes
    int w = Math.max(image.getWidth(), overlay.getWidth());
    int h = Math.max(image.getHeight(), overlay.getHeight());
    BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
    Graphics g = combined.getGraphics();
    g.drawImage(image, 0, 0, null);
    g.drawImage(overlay, 55, 480, null);
    // Save as new image
    ImageIO.write(combined, "PNG", new File("./art/images/holgerCombined.png"));
        }
        catch (IOException e) {
            throw new RuntimeException("Sound: Input/Output Error: " + e);
                }
    

    // paint both images, preserving the alpha channels
    

    
    }
    
    
}

