
package santiagoromero.hotellasmargaritas;


// *
// * santiago Romero Alzate

public class huespedes {
    
    private String nombre;
    private String apellido;
    private String documento;
    
   
    public huespedes(String nombre, String apellido, String documento){
        
       this.nombre=nombre;
       this.apellido=apellido;
       this.documento=documento;
        
    }
 
    
    
    public String getNombre(){
        return nombre;
   }
    
    public String getApellido(){
        return apellido;
   }
    
     public String getDocumento(){
        return documento;
   }
    
   public String tostring(){
    
       
       return "Huesped " + nombre + " " +  apellido + " " + documento;
       
   }
    
    
}//FinCalse
    




   

