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
	 int media_art_val1 = scanner.nextInt();

	 System.out.print("O Segundo valor: "); 
	 int media_art_val2 = scanner.nextInt();
	 
	 double media_art_result = (double) (media_art_val1 + media_art_val2) / 2.0;
	 System.out.println("A media fico como: " + media_art_result);
	

         /******************************************************************************************************************************/
         /**************************************************** Atividade 02 ************************************************************/
	
	 System.out.println("\r\nLeia dois numeros inteiros, calcule a media aritmetica ponderada entre eles, considerando os pesos 2.5 e "+
         "3.5,  respectivamente e exiba o valor");

	 System.out.print("O primeiro valor (peso 2.5): ");
	 double media_art_pon_val1 = scanner.nextDouble();

	 System.out.print("O segundo valor (peso 3.5): ");
	 double media_art_pon_val2 = scanner.nextDouble();

	 double media_art_pon_result = ((media_art_pon_val1 * 2.5) + (media_art_pon_val2*3.5)) / (2.5 + 3.5);

	 System.out.print("O resultado é: " + media_art_pon_result);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 03 ************************************************************/

	 System.out.println("\r\nLeia o salario base de um vendador e o valor total de suas vendas no mes. Calcule o salario final, sabendo " +
		"que e igual ao valor do salario base adicionado de uma comissao de 15% sobre o valor total de suas vendas");

	 System.out.print("Digite o salario base do vendedor: ");
	 double salario_vendedor_fixo = scanner.nextDouble();

	 System.out.print("Digite o total de vendas no mes desse vendedor");
	 int vendas_vendedor = scanner.nextInt();

	 double salario_vendedor_total = (vendas_vendedor * (3.0 / 20)) + salario_vendedor_fixo;
	 System.out.println("O salario final foi: " + salario_vendedor_total);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 04 ************************************************************/

	 System.out.println("\r\nUm motorista dirigiu uma distancia, em quilometros, durante um periodo de alguns minutos. Escreva um " + 
		 "algoritmo que solicite esses dois valores e calcule a velocidade media do deslocamento em km/h");

	 System.out.print("A distancia percorriada, em quilometros: ");
	 double quilometros_motorista = scanner.nextDouble();

	 System.out.print("A quantidade de minutos gastos nesse trajeto: ");
	 double minutos_motorista = scanner.nextDouble();

	 double horas_motorita = minutos_motorista / 60;
	 double velocidade_motorista = quilometros_motorista / horas_motorita;
	 System.out.println("A velocidade, em km/h, e de: " + velocidade_motorista);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 05 ************************************************************/

	 System.out.println("\r\nUm ciclista precidsa percorrer uma distancia, em quilometros, e sabe qual velocidade media vai empreender "+ 
		"nesse trecho. Escreva um algoritmo que solicite esses dois valores e calcule o tempo necessario (em horas) para esse " +
		"deslocamento.");

	 System.out.print("Digite a velocidade media em km/h: ");
	 double km_h_ciclista = scanner.nextDouble();

	 System.out.print("Digite a quantidade de quilometros que serao percorridos: ");
	 double km_per_ciclista = scanner.nextDouble();

	 double horas_nescessarias = km_per_ciclista / km_h_ciclista;
	 System.out.println("A quantidade de horas que o trajeto demora sera: " + horas_nescessarias);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 06 ************************************************************/

	 System.out.println("\r\nUma patrulha de escoteiros anda numa trilha com uma velocidade aproximadamente constante durante um dado "+
		 "intervalo de tempo. Escreva um algoritmo que, conhecendo a veloidade e o tempo, calcule a distancia percorrida pela "+
		 "patrulha.");

	 System.out.print("Digite a velocidade media dessa patrulha (em km/h): ");
	 double vel_media_patrulha = scanner.nextDouble();

	 System.out.print("Digite o tempo usado nessa patrulha (em horas): ");
	 double horas_patrulha = scanner.nextDouble();

	 double caminhos_percorrido_patrulha = (vel_media_patrulha * horas_patrulha);
	 System.out.println("A distancia percorrida foi de (km): " + caminhos_percorrido_patrulha);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 07 ************************************************************/
	
	 System.out.println("\r\nUm motorista de onibus sabe a distancia total, em quilometros, do techo que deve percorrer durante a " +
		 "viagem. Ele tambem conhece a velocidade media prevista que deve utilizar durante a viagem. Quando realizoua a " +
		 "primeira parada para lanche, "+
		 "ele verificou o intervalo de tempo que ja viajou. Escreva um algoritmo que leia a distancia total da viagem, a " +
		 "velocidade media prevista, o intervalo (em minutos) da primeira etapa da viagem. Em seguida, calcule e exiba:" +
		 "\r\na) O tempo prevista para completar toda a viagem, considerando a distancia total e a velocidade media prevista;" +
		 "\r\nb) A distancia efetiva percorrida na primeira etapa, considerando o intervalo informado e a velocidade media prevista;" +
		 "\r\nc) A distancia restante que ainda falta percorrer;" +
		 "\r\nd) O tempo necessario para percorrer a distancia restante;");

	 System.out.print("Distancia total da viagem (em km): ");
	 double viagem_km = scanner.nextDouble();

	 System.out.print("Velocidade media da viagem (em km/h): ");
	 double viagem_velocidade = scanner.nextDouble();

	 System.out.print("O intervalo (em minutos) da primeira etapa da viagem: ");
	 double viagem_etp1_min = scanner.nextDouble();

	 double viagem_horas = viagem_km / viagem_velocidade;
	 System.out.println("a) A viagem levara, em horas: " + viagem_horas);

	 double viagem_etp1_horas = (viagem_etp1_min / 60);
	 double viagem_etp1_km = (viagem_etp1_horas * viagem_velocidade);
	 System.out.println("b) Na primeira etapa da viagem foram feitos, em quilometros: " + viagem_etp1_km);

	 System.out.println("c) A distancia restante, desconsiderando a primeira etapa, em quilometros: " + (viagem_km - viagem_etp1_km));

	 System.out.println("d) O tempo que falta ainda é, em horas: " + (viagem_horas - viagem_etp1_horas));

         /******************************************************************************************************************************/
         /**************************************************** Atividade 08 ************************************************************/

	 System.out.println("\r\nO sistema de metro de uma cidade possui diversas linhas com trajeto fixo. Os trens do metro são automaticos " +
	 	"e podem ser configurados com uma velocidade media padrao. Em algumas situacoes, e preciso alterar essa velocidade padrao"+
		", seja por questoes de seguranca, trafego inteso ou reducao no numero de viagens. Escreva um algoritmo que leia a " +
		"extensao total do trajeto de uma linha, a velocidade media padrao para essas linha e a velocidade media ajustada "+
		"(quando ocorrem as alteracoes mencionadas). Em seguida calcule e exiba:" +
		"\r\na) O tempo previsto para completar a viagem, considerando a extensao total e a velocidade media padrao;" +
		"\r\nb) O tempo efetivo para completar a viagem, considerando a extensao total e a velocidade media ajustada;" +
		"\r\nc) A diferenca de tempo entra as duas situacoes;" +
		"\r\nd) A distancia que e possivel percorrer considerando a velocidade media ajustada e o tempo previsto original;");

		System.out.print("A extensao total do trajeto (em km): ");
		double trajeto_km = scanner.nextDouble();

		System.out.print("A velocidade media padrao desse trajeto (km/h): ");
		double trajeto_velocidade = scanner.nextDouble();
		
		System.out.print("A velocidade media ajustada desse trajeto (km/h): ");
		double trajeto_velocidade_ajustada = scanner.nextDouble();

		double tempo_previsto_ideal = trajeto_km / trajeto_velocidade;
		System.out.println("a) O trajeto e previsto de demorar (horas): " + tempo_previsto_ideal);

		double tempo_efetivo_medio = trajeto_km / trajeto_velocidade_ajustada;
		System.out.println("b) O tempo efetivo e de (horas): " + tempo_efetivo_medio);
	
		System.out.println("c) A diferenca de tempo entre as duas situacoes (horas): " + (Math.abs(tempo_previsto_ideal - tempo_efetivo_medio)));
		
		double CANSEI_DE_NOMEAR_PEQUENO_VOU_MUDAR_TUDO_AGORA = tempo_previsto_ideal * trajeto_velocidade_ajustada;
		System.out.println("d) Leia o que tem ai em cima: " + CANSEI_DE_NOMEAR_PEQUENO_VOU_MUDAR_TUDO_AGORA);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 09 ************************************************************/

	 System.out.println("\r\nO piloto de uma aeronave conduz os passageiros e tripulantes por uma rota fixa cuja distancia e sabida. "+
		"Quando o aviao esta em controle manual, o piloto define a velocidade media de cruzeiro e a mantem aproximadamente "+
		"constante. Eventualmente, durante uma parte da viagem (em geral no inicio), ele coloca o sistema no piloto automatico, "+
		"o qual estabelece uma velocidade media automatica, durante um invervalo de tempo fixo. Escreva um algoritmo que leia a "+
		"extesao da rota, a velocidade media de cruzeiro, a velocidade media automatica e o intevalo de piloto automatico. Em "+
		"seguida calcule:" +
		"\r\na) O tempo previsto para completar a viagem, considerando a extensao da rota e a velocidade media de cruzeiro;" +
		"\r\nb) A extensao do trecho voado em piloto automatico, considerando a velocidade media e o intervalo informado;" +
		"\r\nc) A diferenca entre a extensao da rota e a extensao do trecho de piloto automatico;" +
		"\r\nd) O tempo restante de viagem, considerando o tempo previsto e o intervalo em piloto automatico;" +
		"\r\ne) A velocidade media necessaria para completar a extensao do trecho que ainda falta, dentro do tempo restante previsto;");
	
	/* 
	* De agora em diante e so diversao com uma pitada de insanidade, ja estou cansado, entao vou fazendo o que posso para me manter
	* saudavel mentalmente (to estressado porque fui querer praticar teclado, mas adivinha so, olha O TAMANHO DO TEXTAO... o que nao
	* é ruim, ja deu para dar uma praticada hoje, hummmmmmm, nao sei porque eu tava brabo nao... kkkkkaskasohiwefóihwepnosvfdspogv)
	*/

	 System.out.print("A extensao da rota (km): ");
	 double rotatata189_ = scanner.nextDouble();

	 System.out.print("A velocidade media de cruzeiro (km/h): ");
	 double otowow = scanner.nextDouble();

	 System.out.print("A velocidade media enquanto em piloto automatico (km/h):");
	 double ooo1 = scanner.nextDouble();

	 System.out.print("A quantidade de tempo que o piloto automatico foi usado (horas): ");
	 double que_BUXA = scanner.nextDouble();


	 double tempo___QUE_TEMPO_HOME = rotatata189_ / otowow;
	 System.out.println("a) O tempo previsto, em horas, sem considerar a questao do piloto automatico: " + tempo___QUE_TEMPO_HOME);

	 double MeE__CeEeBrO_dOi__pOnTo_cOm = que_BUXA * ooo1;
	 System.out.println("b)FALTA TAO POUCO!!! Enfim, o resultado da 'b' deu (horas): " + MeE__CeEeBrO_dOi__pOnTo_cOm);

	 double vai_ter_que_usar = (rotatata189_ - MeE__CeEeBrO_dOi__pOnTo_cOm);
	 System.out.print("c) A diferenca ficou, em quilometragem a estilo nacional: " + vai_ter_que_usar); 
	
	 // Coloca no ponto morto que pelo menos desce a ladeira mais rapido o carro (nao aconselhavel)

	double ahhh_esse_tb = (tempo___QUE_TEMPO_HOME  - que_BUXA);
	 System.out.print("d) O tempo previsto, retirando o que foi gasto em piloto automatico (horas): " + ahhh_esse_tb);

	 double ha___hahha____HAHAHAHAHAHAAH_HAHSDNLASDLNK = vai_ter_que_usar / ahhh_esse_tb; 
	 System.out.println("e) A velocidade media que tera que se manter para chegar na hora prevista e de: "+ ha___hahha____HAHAHAHAHAHAAH_HAHSDNLASDLNK );

         /******************************************************************************************************************************/
         /**************************************************** Atividade 10 ************************************************************/
	
	 // FINALMENTE!
	System.out.println("\r\nJosevaldo divide seu salario sempre em 11 partes iaguas, e a primeira despesa que paga e o alugues de seu "+
		"apartamente, Escreva um algoritmo que solicite o valor do salario de Josevaldo(em reais) e quantas partes usa para pagar "+
		"o aluguel num dado mes. Em seguida calcule:" +
		"\r\na) O valor pago (em reais) pelo alugue;" +
		"\r\nb) O percentual de seu salario utilizado para pagar o aluguel;");

		System.out.print("Salario do nosso maravilhoso Josevaldo: ");
		double josevaldo_salario_hehe = scanner.nextDouble();

		System.out.print("Quantas partes, das 11, sao destinadas ao aluguel (inteiro): ");
		int josevaldo_parte_poque_home = scanner.nextInt();
		
		double josevaldo_porcentagem = josevaldo_parte_poque_home / 11.0;

		double josevaldo_aluguel = josevaldo_salario_hehe * josevaldo_porcentagem;

		System.out.println("\r\nVamos por partes, hahahahaha");
		System.out.println("a) O valor pago de aluguel, em reais: " + josevaldo_aluguel);
		System.out.println("b) A porcentagem gasta do salario em alguel: " + (100 * josevaldo_porcentagem) + "%");

         /******************************************************************************************************************************/
         /**************************************************** Atividade 11 ************************************************************/

	 // Quase me esqueci desse kkkkk, quase fui dormir sem fazer......... ;-; não sei se queria ter lembrado nao

	System.out.println("\r\nNeusimaria comprou uma certa quantidade de carne para fazer um churrasco com a familia. Contudo, ela "+
		"esqueceu de verificar o preco do quilograma, e sabe apensa o quanto pagou pelo total da quantidade comprada. Escreva "+
		"um algoritmo que solicite a quantidade (em quilogramas) comprada, e o valor pago, informando qual e o valor por quilo");

	// EASY PEACEI (é assim que se escreve, confia)

	System.out.print("Digite a quantidade de quilogramas de caaaaaaaaaarrne... yum!... compradas: ");
	double carnezinha_faz_tchan_kg = scanner.nextDouble();

	System.out.print("Digite o quanto que foi gasto, em reais, por todos esses quilos de caaaaaaaaarne.... ok, parei. Escreve ai: ");
	double com_dinheiro_nao_brinca = scanner.nextDouble();


	double respostinha_na_manga = com_dinheiro_nao_brinca / carnezinha_faz_tchan_kg ;
	double heheheheha = 1 / respostinha_na_manga; // Pode perder um pouco de precisao, mas e bem mais interessante, kkkkkkkkkk
	System.out.println("MEU chapa, com toda a  facilidade do universo, digo-lhe que o custo de cada quilograma de carne que "+
		"foi comprado e de (em reais ainda): " + heheheheha );

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
                   +"\r\nCustará: R$" + custo_total_baldes);
           
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
	
	 System.out.println("\r\nVladislau quer calcular o frete de uma encomenda, apos informar o valor total comprado. Se o valor for inferior a R$120,00, o frete sera "+ 
	"igual a R$15,00; do contrario, esta isento do valor do frete. Informe o valor total a ser cobrado, incluindo o frete.");
	System.out.print("Insira o valor total comprado: ");
	double valor_total_sem_frete = scanner.nextDouble();
	

	double valor_total_c_frete = valor_total_sem_frete + ((valor_total_sem_frete >=120) ? (15) : (0));
	System.out.println("O valor total, com frete, é: R$" + valor_total_c_frete);

         /******************************************************************************************************************************/
         /**************************************************** Atividade 19 e 20 ************************************************************/

	System.out.println("\r\nEscreva um algoritmo que solicite a digitacao de um ano. Com base nessa informacao, deve-se usar a regra simples para indicar se o ano e vissexto: seja divisivel po 4. Informe ao dinal se o ano e ou nao bissexto.");

	System.out.print("Digite o ano que se deseja ver se e bissexto: ");
	int ano_input_nome_longo_sem_motivo = scanner.nextInt();

	bool se_e_bissexto_true = ((ano_input_nome_longo_sem_motivo % 4 == 0) && !(ano_input_nome_longo_sem_motivo % 25 == 0)) || (ano_input_nome_longo_sem_motivo % 16 == 0);

	System.out.println("O ano digitado e Bissexto? A resposta e: " + (se_e_bissexto_true ? "verdade" : "falso"));

         /******************************************************************************************************************************/
         /**************************************************** Atividade 21 ************************************************************/

	System.out.println("Leia um valor inteiro, que e o tempo de duracao em segundos de um determinado evento em um laboratorio, e informe-o expresso no formato dias-horas:minutos:segundos.");
	
	System.out.print("Digite a quantidade de segundos: ");
	int quantidade_de_segundos = scanner.nextInt();

	int tempo_segundos = (quantidade_de_segundos % 60);
	int tempo_minutos = (quantidade_de_segundos % 3600) / 60;
	int tempo_horas = (quantidade_de_segundos % (60*60*24) / 3600;
	int tempo_dias = quantidade_de_segundos / (3600 * 24);
	
	

    }
}
