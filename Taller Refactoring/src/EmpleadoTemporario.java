public class EmpleadoTemporario extends Empleado {
    
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, int mesesContrato, String genero) {
    	super(nombre, salarioBase, horasTrabajadas, 0, departamento, genero);
        this.mesesContrato = mesesContrato;
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Genero: " + super.getGenero());
        System.out.println("Salario: " + super.getsalarioBase);
        System.out.println("Horas trabajadas: " + super.horasTrabajadas);
        System.out.println("Departamento: " + departamento);
        System.out.println("Meses de contrato: " + mesesContrato);
    }

    // Más metodos
}
