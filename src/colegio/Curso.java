package colegio;

public class Curso {
    private String codigo;
    private String nombre;
    private int horas;
    private Docente unDocente;

    public Curso(String codigo, String nombre, 
            int horas, Docente unDocente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = horas;
        this.unDocente = unDocente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public Docente getUnDocente() {
        return unDocente;
    }

    public void setUnDocente(Docente unDocente) {
        this.unDocente = unDocente;
    }

    @Override
    public String toString() {
        return this.getNombre();
    }   
}
