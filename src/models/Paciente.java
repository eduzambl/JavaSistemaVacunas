/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author ez
 */
public class Paciente {
  private String name;
  private String status;
  private String grupo_riesgo;
  private int id;
  
  public Paciente() {
  }
  
  public Paciente(String name) {
      this.name = name;
  }
  
  public String getName() {
      return name;
  }
  
  public void setName(String name) {
      this.name = name;
  }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGrupo_riesgo() {
        return grupo_riesgo;
    }

    public void setGrupo_riesgo(String grupo_riesgo) {
        this.grupo_riesgo = grupo_riesgo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
  
  
}
