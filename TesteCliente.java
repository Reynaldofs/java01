package aula01;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente(1, "Maria Alice", "a.a@mail.com", "1111-1111", "Rua mar, 123");
		cliente1.visualizar();
		
        Cliente cliente2 = new Cliente(2, "Aparecida", "cio@mail.com", "2222-2222", "Rua cachoeira, 456");
        cliente2.visualizar();
		
		//Cliente cliente1 = new Cliente(1, "João Silva", "joao.silva@gmail.com", "Rua das Flores, 123", "(11) 98765-4321", 30);
      //  Cliente cliente2 = new Cliente("Maria Santos", "maria.santos@gmail.com", "Avenida das Árvores, 456", "(11) 91234-5678", 25);
        
       
       
	}

}
