package main;

import crud.Cliente.crudCliente;
import crud.Sapato.crudSapato;
import crud.Fornecedor.crudFornecedor
import DAO.DAO;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DAO dao = new DAO(scanner);
		crudSapato crudSapato = new crudSapato(dao, scanner);
		crudFornecedor crudFornecedor = new crudFornecedor(dao, scanner);
		int opc;
		do {
			System.out.println("\n= = = Menu Principal = = =");
			System.out.println("1. - Cliente");
			System.out.println("2. - Sapato");
			System.out.println("3. - Fornecedor");
			System.out.println("0. - Sair");
			opc = scanner.nextLine();
			scanner.nextLine();
			switch(opc) {
			case 1 -> crudCliente.menu();
			case 2 -> crudSapato.menu();
			case 3 -> crudFornecedor.menu();
			
			}
		}while(opc != 0);
		scanner.close();

	}
	
}
