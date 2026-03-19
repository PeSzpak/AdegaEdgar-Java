package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Adega {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Vinho> vinhos = new ArrayList<>();
		ArrayList<Espumante> espumantes = new ArrayList<>();
		int opcao;

		do {
			System.out.println("=-=-=-=-=-= Adega POO =-=-=-=-=-=");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Servir");
			System.out.println("4 - Buscar por nome");
			System.out.println("5 - Remover");
			System.out.println("6 - Listar todos os produtos");
			System.out.println("7 - Valor total da adega");
			System.out.println("8 - Produto mais caro");
			System.out.println("0 - Sair");
			System.out.print("Escolha: ");
			System.out.println();
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			opcao = ler.nextInt();
			ler.nextLine();

			switch (opcao) {

			case 1:
				System.out.println("1 - Vinho  |  2 - Espumante");
				System.out.print("Escolha: ");
				int tipoCad = ler.nextInt();
				ler.nextLine();

				System.out.print("Nome: ");
				String nomeC = ler.nextLine();
				System.out.print("Tipo: ");
				String tipoC = ler.nextLine();
				System.out.print("Uva: ");
				String uvaC = ler.nextLine();
				System.out.print("Regiao: ");
				String regiaoC = ler.nextLine();
				System.out.print("Quantidade: ");
				int qntdC = ler.nextInt();
				System.out.print("Preco: ");
				double precoC = ler.nextDouble();
				ler.nextLine();

				if (tipoCad == 1) {
					vinhos.add(new Vinho(nomeC, tipoC, uvaC, regiaoC, qntdC, precoC));
					System.out.println("Vinho cadastrado com sucesso!");
				} else if (tipoCad == 2) {
					espumantes.add(new Espumante(nomeC, tipoC, uvaC, regiaoC, qntdC, precoC));
					System.out.println("Espumante cadastrado com sucesso!");
				} else {
					System.out.println("Opcao invalida.");
				}
				break;

			case 2:
				System.out.println("1 - Vinhos  |  2 - Espumantes");
				System.out.print("Escolha: ");
				int tipoList = ler.nextInt();
				ler.nextLine();

				if (tipoList == 1) {
					if (vinhos.isEmpty()) {
						System.out.println("Nenhum vinho cadastrado.");
					} else {
						for (int i = 0; i < vinhos.size(); i++) {
							System.out.print(i + " - ");
							vinhos.get(i).exibir();
						}
					}
				} else if (tipoList == 2) {
					if (espumantes.isEmpty()) {
						System.out.println("Nenhum espumante cadastrado.");
					} else {
						for (int i = 0; i < espumantes.size(); i++) {
							System.out.print(i + " - ");
							espumantes.get(i).exibir();
						}
					}
				} else {
					System.out.println("Opcao invalida.");
				}
				break;

			case 3:
				System.out.println("1 - Vinho  |  2 - Espumante");
				System.out.print("Escolha: ");
				int tipoServ = ler.nextInt();
				ler.nextLine();

				if (tipoServ == 1) {
					if (vinhos.isEmpty()) {
						System.out.println("Nenhum vinho cadastrado.");
					} else {
						for (int i = 0; i < vinhos.size(); i++) {
							System.out.print(i + " - ");
							vinhos.get(i).exibir();
						}
						System.out.print("Indice: ");
						int iV = ler.nextInt();
						ler.nextLine();
						if (iV >= 0 && iV < vinhos.size()) {
							vinhos.get(iV).servir();
						} else {
							System.out.println("Indice invalido.");
						}
					}
				} else if (tipoServ == 2) {
					if (espumantes.isEmpty()) {
						System.out.println("Nenhum espumante cadastrado.");
					} else {
						for (int i = 0; i < espumantes.size(); i++) {
							System.out.print(i + " - ");
							espumantes.get(i).exibir();
						}
						System.out.print("Indice: ");
						int iE = ler.nextInt();
						ler.nextLine();
						if (iE >= 0 && iE < espumantes.size()) {
							espumantes.get(iE).servir();
						} else {
							System.out.println("Indice invalido.");
						}
					}
				} else {
					System.out.println("Opcao invalida.");
				}
				break;

			case 4:
				System.out.println("1 - Vinho  |  2 - Espumante");
				System.out.print("Escolha: ");
				int tipoBusca = ler.nextInt();
				ler.nextLine();
				System.out.print("Nome: ");
				String nomeBusca = ler.nextLine().toLowerCase();
				boolean encontrado = false;

				if (tipoBusca == 1) {
					for (Vinho v : vinhos) {
						if (v.getNome().toLowerCase().contains(nomeBusca)) {
							v.exibir();
							encontrado = true;
						}
					}
				} else if (tipoBusca == 2) {
					for (Espumante e : espumantes) {
						if (e.getNome().toLowerCase().contains(nomeBusca)) {
							e.exibir();
							encontrado = true;
						}
					}
				} else {
					System.out.println("Opcao invalida.");
					break;
				}

				if (!encontrado) {
					System.out.println("Nenhum produto encontrado com esse nome.");
				}
				break;

			case 5:
				System.out.println("1 - Vinho  |  2 - Espumante");
				System.out.print("Escolha: ");
				int tipoRem = ler.nextInt();
				ler.nextLine();

				if (tipoRem == 1) {
					if (vinhos.isEmpty()) {
						System.out.println("Nenhum vinho cadastrado.");
					} else {
						for (int i = 0; i < vinhos.size(); i++) {
							System.out.print(i + " - ");
							vinhos.get(i).exibir();
						}
						System.out.print("Indice para remover: ");
						int iRV = ler.nextInt();
						ler.nextLine();
						if (iRV >= 0 && iRV < vinhos.size()) {
							System.out.println(vinhos.get(iRV).getNome() + " removido.");
							vinhos.remove(iRV);
						} else {
							System.out.println("Indice invalido.");
						}
					}
				} else if (tipoRem == 2) {
					if (espumantes.isEmpty()) {
						System.out.println("Nenhum espumante cadastrado.");
					} else {
						for (int i = 0; i < espumantes.size(); i++) {
							System.out.print(i + " - ");
							espumantes.get(i).exibir();
						}
						System.out.print("Indice para remover: ");
						int iRE = ler.nextInt();
						ler.nextLine();
						if (iRE >= 0 && iRE < espumantes.size()) {
							System.out.println(espumantes.get(iRE).getNome() + " removido.");
							espumantes.remove(iRE);
						} else {
							System.out.println("Indice invalido.");
						}
					}
				} else {
					System.out.println("Opcao invalida.");
				}
				break;

			case 6:
				if (vinhos.isEmpty() && espumantes.isEmpty()) {
					System.out.println("A adega esta vazia.");
				} else {
					System.out.println("--- Vinhos ---");
					if (vinhos.isEmpty()) {
						System.out.println("Nenhum vinho cadastrado.");
					} else {
						for (Vinho v : vinhos)
							v.exibir();
					}
					System.out.println("--- Espumantes ---");
					if (espumantes.isEmpty()) {
						System.out.println("Nenhum espumante cadastrado.");
					} else {
						for (Espumante e : espumantes)
							e.exibir();
					}
				}
				break;

			case 7:
				double total = 0;
				for (Vinho v : vinhos)
					total += v.getPreco() * v.getQntd();
				for (Espumante e : espumantes)
					total += e.getPreco() * e.getQntd();
				System.out.println("Valor total da adega: R$ " + String.format("%.2f", total));
				break;

			case 8:
				String maisCaro = "Nenhum produto cadastrado.";
				double maiorPreco = -1;

				for (Vinho v : vinhos) {
					if (v.getPreco() > maiorPreco) {
						maiorPreco = v.getPreco();
						maisCaro = "Vinho: " + v.getNome() + " | Preco: R$ " + v.getPreco();
					}
				}
				for (Espumante e : espumantes) {
					if (e.getPreco() > maiorPreco) {
						maiorPreco = e.getPreco();
						maisCaro = "Espumante: " + e.getNome() + " | Preco: R$ " + e.getPreco();
					}
				}
				System.out.println("Produto mais caro: " + maisCaro);
				break;

			case 0:
				System.out.println("Encerrando sistema...");
				break;

			default:
				System.out.println("Opcao invalida.");
			}

		} while (opcao != 0);

		ler.close();
	}
}