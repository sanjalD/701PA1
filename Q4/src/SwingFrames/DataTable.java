/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingFrames;

import Interfaces.Featurable;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;

/**
 *
 * @author admin
 */
public class DataTable implements Featurable {

    public JTable table;
    public DataTable(JTable jtable) {
        this.table = jtable;
    } 
   
    @Override
    public void setForeground(Color fontcolor) {
        this.table.setForeground(fontcolor);
    }

    @Override
    public void setBackground(Color color) {
        this.table.setBackground(color);
    }

    @Override
    public void setFont(Font font) {
        this.table.setFont(font);
    }
}
