package lombok;

public class UsoPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona();
		p1.setNombre("Varela Claudio");
		p1.setDocumento("22222222");
		
		System.out.println(p1.toString());
		
		System.out.println(p1.hashCode());
		
	}

}
