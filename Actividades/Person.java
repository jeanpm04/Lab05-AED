import java.util.Objects;

public class Person {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Person(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	/*@Override
	public int hashCode() {
		return Objects.hash(apellido, edad, nombre);
	}*/

	// Sobrecargando el método "equals()"
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(apellido, other.apellido) && edad == other.edad && Objects.equals(nombre, other.nombre);
	}
	
	
}
