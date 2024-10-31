
package santiagoromero.hotellasmargaritas;


// *
// * santiago Romero Alzate

public class Huesped {
    private String nombre;
    private String dni;
    private String telefono;

    public Huesped(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }


    public String getDni() {
        return dni;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Huésped: " + nombre +  ", DNI: " + dni + ", Teléfono: " + telefono;
    }
}//FinCalse
    




   

