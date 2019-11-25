/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prouctmanager;

import javax.swing.JFrame;

/**
 *
 * @author Mahmoud
 */
public class ProuctManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AddNewProduct a = new AddNewProduct();
        a.getConnection();
        Main m = new Main();
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m.setLocationRelativeTo(null);
    }
    
}
