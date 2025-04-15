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
        
         /******************************************************************************************************************************/
         /**************************************************** Atividade 12 ************************************************************/
        
        Scanner scanner = new Scanner(System.in);
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

          double tamanho_cabo_min =                                                             // hipotenusa
                  Math.sqrt(
                          altura_diferenca_predios * altura_diferenca_predios        // cateto1^2 +
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
    }
}
