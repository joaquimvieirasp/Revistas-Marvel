package Titulos;

public class Principal {

	public static void main(String[] args) {
		
		Revistas revista = new Revistas();
		
		revista.Revista = "Homem Aranha";
		revista.Titulo = "O que aconteceria se a namorada do Homem Aranha não tivesse morrido";
		revista.Editora = "Editora Abril";
		revista.número = 10;
		revista.data = 1984;
		
		System.out.printf("O ano de publicação da revista %s numero %s é %s", revista.Revista, revista.número, revista.data);
		
	

	}

}
