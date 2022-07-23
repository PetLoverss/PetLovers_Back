package petlovers.app.models;

import petlovers.app.dtos.UserDTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="usuario")
@Entity
public class User {
    @Id
    @Column(name="cedula",nullable = false)
    private int cedula;
    @Column(name="nombre",nullable = false)
    private String nombre ;
    @Column(name="email",nullable = false)
    private String email;
    @Column(name="direccion",nullable = false)
    private String direccion;
    @Column(name="tipoUsuario",nullable=false)
    private String tipoUsuario;

    public User(UserDTO userDTO){
        this.cedula=userDTO.getCedula();
        this.nombre= userDTO.getNombre();
        this.direccion= userDTO.getDireccion();
        this.email= userDTO.getEmail();
        this.tipoUsuario= userDTO.getTipoUsuario();
    }

    public User() {
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
