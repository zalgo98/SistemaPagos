package com.Proyect.UserService.model;

public class User {
    
    private int Id;
    private String Nombre;
    private String Username;
    private String Contraseña;

    public User(int Id, String Nombre, String Username, String Contraseña){
        this.Id=Id;
        this.Nombre=Nombre;
        this.Username=Username;
        this.Contraseña=Contraseña;

    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

}
