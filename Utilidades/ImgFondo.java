package Utilidades;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import java.awt.image.BufferedImage;

import java.io.IOException;

import java.net.URL;

import javax.imageio.ImageIO;

import javax.swing.border.Border;

public class ImgFondo implements Border{
    
    private BufferedImage imagen = null;
    
    public ImgFondo(BufferedImage img) throws IOException {
        if(img!=null){
            imagen=img;
        }
        else{
            throw new IOException("No Hay Imagen");
        }
    }
    
    public ImgFondo(URL path) throws IOException{
        imagen=ImageIO.read(path);
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if(imagen!=null){
             g.drawImage(imagen, 0, 0,width,height,null);
        }
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }

    @Override
    public boolean isBorderOpaque() {
        return true;
    }
}
