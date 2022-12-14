/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos2;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author fer
 */
public class Empresa {
    
    private String cif;
    private String nombre;
    
    private CatalogoAlquileres CatalagoA;
    private CatalogoClientes CatalogoC;
    private CatalogoVehiculos VehiculoV;

    public Empresa(String cif, String nombre, CatalogoAlquileres CatalagoA, CatalogoClientes CatalogoC, CatalogoVehiculos VehiculoV) {
        this.cif =  RandomStringUtils.randomAlphabetic(1) + RandomStringUtils.randomNumeric(7) + RandomStringUtils.randomAlphabetic(1);
        this.nombre = RandomStringUtils.randomAlphabetic(5);
        this.CatalagoA = CatalagoA;
        this.CatalogoC = CatalogoC;
        this.VehiculoV = VehiculoV;
    }

    

    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public CatalogoAlquileres getCatalagoA() {
        return CatalagoA;
    }

    public CatalogoClientes getCatalogoC() {
        return CatalogoC;
    }

    public CatalogoVehiculos getVehiculoV() {
        return VehiculoV;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" + "cif=" + cif + ", nombre=" + nombre + ", CatalagoA=" + CatalagoA + ", CatalogoC=" + CatalogoC + ", VehiculoV=" + VehiculoV + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.cif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.cif, other.cif);
    }
    
    
    
    
    
    
    
    
}
