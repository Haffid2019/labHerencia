
package herencia;

import javax.swing.JOptionPane;

public class Estudiante extends Persona{
    private String noCarnet;
    private double promNotas;
    private int materias;
    private double def; 
public Estudiante(){
}   
public Estudiante(String nombre,String apellido, int edad, int peso, String noCarnet,double promNotas, int materias,double def){
     
      super(nombre, apellido, edad, peso);
  
      this.noCarnet= noCarnet;
      this.promNotas= promNotas;
      this.materias= materias;
      this.def= def;
}
    public void setNoCarnet(String noCarnet) {
        this.noCarnet = noCarnet;
    }
    public String getNoCarnet() {
        return noCarnet;
    }
    public void setPromNotas(double promNotas) {
        this.promNotas = promNotas;
    }
    public double getPromNotas() {
        return promNotas;
    }
    public void setDef(double definitiva){
    this.def= def;
    }
    public double getDef(){
    return promNotas;}
    public void setMaterias(int materias){
    this.materias= materias;
    }
    public int getMaterias(){
    return materias;}
    
    public double calcularPromedio(int materias,double nota){
    double prom;
    prom =nota/materias;
        return prom;
    }
    double nota = 0;
    public double notas(double calif){
        int i=0;
        
       while(i<calif){
           nota=Double.parseDouble(JOptionPane.showInputDialog("digite la calificacion que obtuvo"));
           setPromNotas(nota);
           nota=nota+getPromNotas(); 
           i++;
    } 
        return nota;
    }
   public Estudiante datosDelEstudiante(){
    Estudiante estudiante1 =new Estudiante();
    nombre=leerDatoTipoCadena("Ingrese el nombre del estudiante ");
    apellido=leerDatoTipoCadena("Ingrese el apellido del estudiante ");
    edad =leerDatoTipoEntero("Ingrese la edad del estudiante ");
    peso = leerDatoTipoReal("Ingrese el peso del estudiante ");
    materias=leerDatoTipoEntero("Ingrese el numero de materias");
    
    double suma=notas(materias);
   
    def=calcularPromedio(materias, suma);
    
    estudiante1.setNombre(nombre);
    estudiante1.setApellido(apellido);
    estudiante1.setEdad(edad);
    estudiante1.setPeso(peso);
    estudiante1.setDef(def);
    estudiante1.setMaterias(materias);
    return estudiante1;
}
    public void imprimirCalificaciones(){
    
    imprimirDatosPersona();
    JOptionPane.showConfirmDialog(null,"numero de materias: "+materias+" promedio: "+ def );
    }
}

