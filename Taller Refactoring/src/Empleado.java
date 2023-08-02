public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private Departamento departamento;
    private String genero;

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, String genero) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
        this.genero = genero;
    }

    public double calcularSalario() {
        //Applied Replace Nested Conditionals with Guard Clauses
        if (salarioBase<0) throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        if (horasTrabajadas < 0) throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        
        double salarioTotal = salarioBase + departamento.getDepartmentBonus();
        if (horasTrabajadas > 40) {
            return salarioTotal + (horasTrabajadas - 40) * 50; // Pago de horas extra
             
        }
        return salarioTotal;
     
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

   

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Más metodos
}
