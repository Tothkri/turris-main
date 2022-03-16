package model;

import javax.swing.ImageIcon;

public class Selectable extends Sprite {
    public Selectable(int x, int y, int height, int width){
        super(x,y,height,width,new ImageIcon("src/res/selected.png").getImage());
    }
}
