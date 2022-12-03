/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demogame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author chinm
 */
public class MapGenerator {     //
    public int map[][];
    public int bricksWidth;
    public int bricksHeight;
    
    public MapGenerator(int row , int col){
        map = new int[row][col];                //  2D matrix
        
         for (int[] map1 : map) {               // assigning all row
             for (int j = 0; j < map[0].length; j++) { //   bricks count at 0 index 
                 map1[j] = 1;            // every brick value is 1.so 1 is stored in place of each brick.
             }
         }
    //size of the brick /dimention of single brick
        bricksWidth = 540/col;
        bricksHeight = 150/row;
    }
    
     public void setBricksValue(int value,int row,int col)
    {
        map[row][col] = value;

    }
    
    //  logic Part to hit the brick;
    // if hit brick brick value turn to 0,
    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {          // its a row length(depth)
            for (int j = 0; j < map[0].length; j++) {      // column length(width of totalbrick)
                if (map[i][j] > 0) {
                // ALL MATRIX VALUES ARE 1, SO ALL BRICK WIL TURNED RED
                    g.setColor(Color.red);
                    g.fillRect(j*bricksWidth + 80, i*bricksHeight + 60, bricksWidth, bricksHeight);
                    
        // A full matrix shown BY NOW in form of a rectangle, to make it brick bordering with black needed- as follows below
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.black);
                    g.drawRect(j*bricksWidth + 80, i*bricksHeight + 60, bricksWidth, bricksHeight);
                    // border designed using drawRect this draw a rectangle but not fill the color inside reactangle
                }
            }

        }
    }
   
    
}
