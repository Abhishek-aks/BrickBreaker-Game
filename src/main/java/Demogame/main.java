/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demogame;

import javax.swing.JFrame;

/**
 *
 * @author everg
 */
public class main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
	obj.setBounds(0,0,700,600);
	obj.setTitle("Brick Breaker");
	obj.setResizable(false);
	obj.setVisible(true);
	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        GamePlay gameplay = new GamePlay();     // declare the object of class
	obj.add(gameplay); //error shows 
        // ERROR - becoz container class object is not gameplay theus need to extend JPANEL in gameplay
        // & EXTENDS JPANEL - bcoz it is the subclass of containier class
            
    }
} 
    

