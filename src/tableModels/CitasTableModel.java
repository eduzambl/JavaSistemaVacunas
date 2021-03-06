package tableModels;

import ds.Cola;
import ds.ListaSimple;
import javax.swing.table.AbstractTableModel;
import models.Cita;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ez
 */
public class CitasTableModel extends AbstractTableModel {
    private String[] columnNames = {
        "Tipo de Vacuna",
        "Fecha Cita",
        "Cedula",
        "Nombre"
    };
    private static Cola<Cita> citas;
    
    public CitasTableModel(Cola<Cita> citas) {
       this.citas = citas;
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }
    
    public int getRowCount() {
        return citas.getSize();
    }
    
    public Object getValueAt(int row, int col) {
        System.out.println("row: " + row);
        Cita citaEncontrada = citas.getValueAt(row + 1);
        
        if (citaEncontrada != null) { 
            if (col == 0) {
                return citaEncontrada.getTipoDeVacuna();
            }

            if (col == 1) {
                return citaEncontrada.getFechaDeCita();
            }

            if (col == 2) {
                return citaEncontrada.getCedulaPaciente();
            }

            if (col == 3) {
                return citaEncontrada.getNombrePaciente();
            }
        }
        
        return citaEncontrada;
    }
    
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    public Class getColumnClass(int col) {
        return String.class;
    }
}
