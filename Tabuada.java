import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int i, tabuada,resultado;
		resultado = 0;
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite qual tabuada você deseja: ");
        tabuada =sc.nextInt();
//         iniciando a estrutura de repetição
        for(i=1; i<=100; i++) {
        	resultado = tabuada * i;
        	System.out.println(tabuada +" x " + i + "= "+ resultado);
        }

	}

}