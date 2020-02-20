package applicationTwo;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class NewAPIDatasJava8 {
	
	public static void main(String[] args) {
		
		Instant agora = Instant.now();
		contaAteUmMilhao();
		Instant fim = Instant.now();
		
		Duration duracao = Duration.between(agora, fim);
		long duracaoSegundos = duracao.getSeconds();
		
		System.out.println(duracaoSegundos);
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje); //(formato ISO-8601)
		
		
		/**
		 *Um LocalDate serve para representarmos, por exemplo, a data de emissão do nosso RG,
		 *em que não nos importa as horas ou minutos, mas o dia todo.
		 *Podemos criar um LocalDate para uma data específica utilizando o método of: 
		 */
		
		LocalDate emissaoRG = LocalDate.of(2019, 12, 5);
		System.out.println(emissaoRG);
		emissaoRG = LocalDate.of(2019, Month.DECEMBER, 5);
		System.out.println(emissaoRG);
		
		//-----------------------------------------------
		
		LocalDate homemNoEspaco = LocalDate.of(1961, Month.APRIL, 12);
		LocalDate homemNaLua = LocalDate.of(1969, Month.MAY, 25);
		
		Period periodo = Period.between(homemNoEspaco, homemNaLua);
		
		System.out.printf("%s anos, %s mês e %s dias \n",
				periodo.getYears(),periodo.getMonths(), periodo.getDays());
		
		/**
		 * Já a classe LocalTime serve para representar apenas um horário,
		 *  sem data específica. Podemos, por exemplo,
		 *  usá-la para representar o horário de entrada no trabalho.
		 */
		
		LocalTime horarioEntrada = LocalTime.of(9, 0);
		System.out.println(horarioEntrada);
		
		/**
		 * A classe LocalDateTime serve para representar uma data e hora específicas.
		 * Podemos representar uma data e hora de uma prova importante ou de uma audiência em um tribunal.
		 */
		
		LocalDateTime agoraa = LocalDateTime.now();
		LocalDateTime aberturaDaCopa = LocalDateTime.of(2014, Month.JUNE, 12, 17, 0);
		System.out.println(aberturaDaCopa);
		
		/**
		 * Para representarmos uma data e hora em um fuso horário específico,
		 * devemos utilizar a classe ZonedDateTime.
		 */
		
		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime agoraEmSaoPaulo = ZonedDateTime.now(fusoHorarioDeSaoPaulo);
		System.out.println(agoraEmSaoPaulo);
		
		/**
		 * Com um ZonedDateTime, podemos representar, por exemplo, a data de um voo.
		 */
		
	}
	
	public static void contaAteUmMilhao() {
		
		for(int i = 0; i < 1; i++) {
			System.out.println(i);
		}
	}

}
