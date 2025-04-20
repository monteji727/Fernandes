/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 03559539005
 */

import java.util.Scanner;

public class PrograminhaDosManos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

	 /******************************************************************************************************************************/
         /**************************************************** Atividade 01 ************************************************************/

	 System.out.println("Leia dois numeros inteiros, calcule a media aritmetica simples entre eles e exiba o valor.");

	 System.out.print("O primeiro valor: "); 
	 int media_art_val1 = scanner.nextDouble();

	 System.out.print("O Segundo valor: "); 
	 int media_art_val2 = scanner.nextDouble();
	 
	 double media_art_result = (double) (media_art_val1 + media_art_val2) / 2.0;
	

         /******************************************************************************************************************************/
         /**************************************************** Atividade 02 ************************************************************/
	
	 System.out.println("Leia dois numeros inteiros, calcule a media aritmetica ponderada entre eles, considerando os pesos 2.5 e "+
         "3.5,  respectivamente e exiba o valor");

	 System.out.print("O primeiro valor (peso 2.5): ");
	 double media_art_pon_val1 = scanner.nextDouble();

	 System.out.print("O segundo valor (peso 3.5): ");
	 double media_art_pon_val2 = scanner.nextDouble();

	 double media_art_pon_result = ((media_art_pon_val1 * 2.5) + (media_art_pon_val2*3.5)) / (2.5 + 3.5);

	 System.out.print("O resultado é: " + media_art_pon_result);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 03 ************************************************************/

	 System.out.println("Leia o salario base de um vendador e o valortotal de suas vendas no mes. Calcule o salario final, sabendo " +
		"que e igual ao valor do salario base adicionado de uma comissao de 15% sobre o valor total de suas vendas");

	 System.out.print("Digite o salario base do vendedor: ");
	 double salario_vendedor_fixo = scanner.nextDouble();

	 System.out.print("Digite o total de vendas no mes desse vendedor");
	 int vendas_vendedor = scanner.nextInt();

	 double salario_vendedor_total = (vendas_vendedor * (3.0 / 20)) + salario_vendedor_fixo;
	 System.out.prinln("O salario final foi: " + salario_vendedor_total);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 04 ************************************************************/

	 System.out.println("Um motorista dirigiu uma distancia, em quilometros, durante um periodo de alguns minutos. Escreva um " + 
		 "algoritmo que solicite esses dois valores e calcule a velocidade media do deslocamento em km/h");

	 System.out.print("A distancia percorriada, em quilometros: ");
	 double quilometros_motorista = scanner.nextDouble();

	 System.out.print("A quantidade de minutos gastos nesse trajeto: ");
	 double minutos_motorista = scanner.nextDouble();

	 double horas_motorita = minutos_motorista / 60;
	 double velocidade_motorista = quilometros_motorista / horas_motorista;
	 System.out.println("A velocidade, em km/h, e de: " + velocidade_motorista);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 05 ************************************************************/

	 System.out.println("Um ciclista precidsa percorrer uma distancia, em quilometros, e sabe qual velocidade media vai empreender "+ 
		"nesse trecho. Escreva um algoritmo que solicite esses dois valores e calcule o tempo necessario (em horas) para esse " +
		"deslocamento.");

	 System.out.print("Digite a velocidade media em km/h: ");
	 double km_h_ciclista = scanner.nextDouble();

	 System.out.print("Digite a quantidade de quilometros que serao percorridos: ");
	 double km_per_ciclista = scanner.nextDouble();

	 double horas_nescessarias = km_per_ciclista / km_h_ciclista;
	 System.out.println("A quantidade de horas que o trajeto demora sera: " + horas_necessarias);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 06 ************************************************************/

	 System.out.println("Uma patrulha de escoteiros anda numa trilha com uma velocidade aproximadamente constante durante um dado "+
		 "intervalo de tempo. Escreva um algoritmo que, conhecendo a veloidade e o tempo, calcule a distancia percorrida pela "+
		 "patrulha.");

	 System.out.print("Digite a velocidade media dessa patrulha (em km/h): ");
	 double vel_media_patrulha = scanner.nextDouble();

	 System.out.print("Digite o tempo usado nessa patrulha (em horas): ");
	 double horas_patrulha = scanner.nextDouble();

	 double caminhos_percorrido_patrulha = (vel_media_patrulha * horas_patrulha);
	 System.out.println("O tempo gasto foi de (em horas): " + horas_patrulha);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 07 ************************************************************/
	
	System.out.println("Veja no PDF, não vou escrever tudo isso não, pelo amor de Deus.");
	

         /******************************************************************************************************************************/
         /**************************************************** Atividade 12 ************************************************************/
        
         System.out.println("""
                    Uma empresa de produtos esportivos realizar\u00e1 uma a\u00e7\u00e3o de marketing que consiste em
                    instalar  uma tirolesa entre os dois pr\u00e9dios do centro da cidade. Conhecendo a altura (em metros) dos
                    pr\u00e9dios e a dist\u00e2ncia entre eles, escreva um algoritmo para calcular a extens\u00e3o da tirolesa.
                    (\u00c9 poss\u00edvel resolver utilizando o teorema de Pit\u00e1goras. Na linguagem Java, a raiz quadrada
                    \u00e9 calculada utilizando uma fun\u00e7\u00e3o: Math.sqrt(valor) )"""
          );
        
         System.out.print("Digite a altura, em metros, de diferença entre os dois prédios: ");
         double altura_diferenca_predios =  scanner.nextDouble();
         System.out.print("Distância absoluta entre os dois prédios");
         double distancia_prédios = scanner.nextDouble(); 

         double tamanho_cabo_min =                                                           // hipotenusa
                  Math.sqrt(
                          altura_diferenca_predios * altura_diferenca_predios  		     // cateto1^2 +
                          + distancia_prédios * distancia_prédios                            // cateto2^2
                  
                    );
         System.out.println("O cabo instalado será de exatamente(hahahaha), na medida do possível: " + tamanho_cabo_min);
         
         /******************************************************************************************************************************/
         /**************************************************** Atividade 13 ************************************************************/        
         
         System.out.print("""
                    Um barqueiro navega diariamente entre dois p\u00ederes (considerando a penas a viagem de ida) e
                    sabe a extens\u00e3o do trajeto linear que o barco faz. Ele tamb\u00e9m conhece a dist\u00e2ncia relativa entre
                    os dois p\u00ederes. Com essas informa\u00e7\u00f5es, ele gostaria de ter um algoritmo para calcular a largura
                    do rio."""
         );
         
         System.out.print("Escreva a distancia entre os dois pires (a hipotenusa): ");
         double distancia_total_pires = scanner.nextDouble();
         
         System.out.print("Escreva a distancia entre os dois pires (o catato que não é a extencao do rio): ");
         double distancia_relativa_pires = scanner.nextDouble();
         
       
         double largura_rio =                                                                       //cateto2 =
                 Math.sqrt(
                    distancia_total_pires*distancia_total_pires                         // hipotenusa^2  -
                     - (distancia_relativa_pires*distancia_relativa_pires)          // cateto1^2
                 );
         
         System.out.println("Largura do rio é, na medida do possível: " + largura_rio);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 14 ************************************************************/
         
         
         System.out.println("""
                    Um top\u00f3grafo precisa calcular a altura real de um edif\u00edcio. Ele define a dist\u00e2ncia do teodolito
                    ao edif\u00edcio, e o teodolito tem uma altura de 1,70 m. A cada medida, o teodolito informa o \u00e2ngulo
                    (em graus) de observa\u00e7\u00e3o da extremidade superior do edif\u00edcio. Escreva um algoritmo que, 
                    conhecendo a dist\u00e2ncia do teodolito e o \u00e2ngulo de observa\u00e7\u00e3o, calcule a altura do
                    edif\u00edcio. (\u00c9 poss\u00edvel resolver conhecendo as rela\u00e7\u00f5es trigonom\u00e9tricas. Na 
                    linguagem Java, o seno, ocosseno e a tangente s\u00e3o calculados, respectivamente, pelas 
                    fun\u00e7\u00f5es Math.sin(angulo),Math.cos(angulo) e Math.tan(angulo); mas o \u00e2ngulo deve ser
                    informado em radianos.)"""
         );
         
         final double altura_aparelho = 1.7;
         
         System.out.print("Digite a distancia do teodolito até a extremidade mais perto do predio, em metros: ");
         double distancia_aparelho_predio = scanner.nextDouble();
        
         System.out.print("Digite a quantidade de graus (Ex: 360 graus) observados no aparelho: ");
         double angulo_cos = scanner.nextDouble();
         
         // Basicamente, como "cos(x) = sin(45 - x)", Então o seguite se aplica (convertendo de "cos" para "sin")
         double angulo_radianos_sin = (45 - angulo_cos) * (Math.PI) / 180;
 
         // Como a tangente vai vir inversa, ou seja "tan(45-x) = sin(x)/cos(x)", então é só multiplicar isso pela
         // distancia_aparelho_predio
         
         double altura_predio = altura_aparelho + (distancia_aparelho_predio * Math.tan(angulo_radianos_sin));
         
         System.out.println("A altura do predio é, na medida do possível, em metros: "+ altura_predio);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 15 ************************************************************/
         
           System.out.println("""
                    Vanicl\u00e9ia deseja pintar seu apartamento, e quer um algoritmo que calcule tudo que ela precisa. Ela vai 
                    informar a \u00e1rea total do apartamento (em m2), o pre\u00e7o da lata de tinta (em reais, podendo haver 
                    centavos) e o rendimento de uma lata (em m2). N\u00e3o se preocupe com a altura das paredes (tecnicamente 
                    chamada de \u201cp\u00e9 direito"), pois ela vai considerar uma medida padr\u00e3o que n\u00e3o vem ao 
                    caso. Ela quer saber quantas latas de tinta precisa comprar e quanto vai gastar no total. Note que só é possível 
                    comprar latas inteiras e nunca uma fração de lata)""" 
           );
           
           System.out.print("A quantidade de metros quadrados (m^2) de parede para pintar: ");
           double metros2_parede_pintar = scanner.nextDouble();
           
           System.out.print("A quantidade que um balde de tinta rende em metros quadrados (m^2): ");
           double rendimento_por_balde = scanner.nextDouble();
           
           System.out.print("Quanto que custa um balde de tinta: ");
           double custo_balde_tinta = scanner.nextDouble();
         
           int quantidade_baldes_minimo = (int) Math.ceil(metros2_parede_pintar / rendimento_por_balde);
           double custo_total_baldes = quantidade_baldes_minimo * custo_balde_tinta;
           
           System.out.println("A quantaide de baldes de tinta, no minimo é " + quantidade_baldes_minimo
                   +"\nCustará: R$" + custo_total_baldes);
           
         /******************************************************************************************************************************/
         /**************************************************** Atividade 16 ************************************************************/
         
         System.out.println("""
                    Godofredo ficou muito impressionado com o poder das fun\u00e7\u00f5es exponenciais e deseja fazer um 
                    experimento. Antes de inici\u00e1-lo, ele quer calcular algumas simula\u00e7\u00f5es. A ideia \u00e9 fazer uma 
                    \u201ccorrente do bem\u201d. Ele vai ajudar uma quantidade N de pessoas, sem interesses e sem 
                    retribui\u00e7\u00f5es para si mesmo. A \u00fanica condi\u00e7\u00e3o \u00e9 que, no dia seguinte, cada 
                    pessoa auxiliada deve auxiliar outras N pessoas e \u201crepassar a corrente\u201d. Ele observar\u00e1 o 
                    experimento por 10 dias na sua cidade, sendo que o dia 1 \u00e9 o dia em que ele auxilia as N primeiras 
                    pessoas. Escreva um algoritmo para calcular o total de pessoas auxiliadas, caso o N seja 2, 3 ou 4. Dica: Esse 
                    c\u00e1lculo pode ser realizado com a equa\u00e7\u00e3o abaixo"""
         );
         
         System.out.print("Digite a quantidade de pessoas que são ajudadas por dia por pessoa: ");
          int ajuda_pessoas_dia = scanner.nextInt();
          
          System.out.print("Digite a quantidade de dias que passaram desde o começo do experimento (somente inteiros): ");
          int dias_passados = scanner.nextInt();
          
          int quantidade_total_pessoas = 
                  (int) ((Math.pow(ajuda_pessoas_dia, dias_passados) -  ajuda_pessoas_dia)
                  / ( dias_passados -1));
          
          System.out.println("A quantidade de pessoas ajudadas, no total, foi: " + quantidade_total_pessoas);
          
         /******************************************************************************************************************************/
         /**************************************************** Atividade 17 ************************************************************/
         
         System.out.println("""
                    Um congresso vai emitir certificado para um participante se ele estiver presente pelo menos 75%
                    das horas. O usu\u00e1rio vai informar quantas horas tem o congresso no total e quantas horas o
                    participante compareceu. O n\u00famero de horas \u00e9 sempre inteiro."""
         );
         
         System.out.print("A quantidade de horas total do congresso (somente inteiros): ");
         int horas_total_congresso = scanner.nextInt();
         
         System.out.print("A quantidade de horas que o participante participou: ");
         int horas_participadas = scanner.nextInt();
         
         double porcentagem_participacao = (100 * horas_participadas) / horas_total_congresso;


         /******************************************************************************************************************************/
         /**************************************************** Atividade 18 ************************************************************/
         
         System.out.println("""
                    Um congresso vai emitir certificado para um participante se ele estiver presente pelo menos 75%
                    das horas. O usu\u00e1rio vai informar quantas horas tem o congresso no total e quantas horas o
                    participante compareceu. O n\u00famero de horas \u00e9 sempre inteiro."""
         );
         
         System.out.print("A quantidade de horas total do congresso (somente inteiros): ");
         int horas_total_congresso = scanner.nextInt();
         
         System.out.print("A quantidade de horas que o participante participou: ");
         int horas_participadas = scanner.nextInt();
         
         double porcentagem_participacao = (100 * horas_participadas) / horas_total_congresso;
    }
}
