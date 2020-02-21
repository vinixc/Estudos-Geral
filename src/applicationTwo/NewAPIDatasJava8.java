package applicationTwo;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

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
		
		ZoneId fusoHorarioDeSaoPauloo = ZoneId.of("America/Sao_Paulo");
		ZoneId fusoHorarioDeNovaYork = ZoneId.of("America/New_York");
		
		LocalDateTime saidaDeSaoPauloSemFusoHorario = 
				LocalDateTime.of(2020, Month.APRIL, 4, 22, 30);
		LocalDateTime chegadaEmNovaYorkSemFusoHorario =
				LocalDateTime.of(2020, Month.APRIL, 5, 7, 10);
		
		ZonedDateTime saidaDeSaoPauloComFusoHorario = ZonedDateTime.of(saidaDeSaoPauloSemFusoHorario,
				fusoHorarioDeSaoPauloo);
		System.out.println(saidaDeSaoPauloComFusoHorario);

		ZonedDateTime chegadaEmNovaYorkComFusoHorario = ZonedDateTime.of(chegadaEmNovaYorkSemFusoHorario,
				fusoHorarioDeNovaYork);
		System.out.println(chegadaEmNovaYorkComFusoHorario);
		
		Duration duracaoDoVoo = Duration.between(saidaDeSaoPauloComFusoHorario, chegadaEmNovaYorkComFusoHorario);
		System.out.println(duracaoDoVoo);
		
		/**
		 * Se calcularmos de maneira ingênua a duração do voo,
		 * teríamos 8:40. Porém, como há uma diferença entre os fusos horários de São Paulo
		 * e Nova York, a duração correta é 9:40. Repare que a API já faz o tratamento
		 * de fusos horários distintos.
		 */
		
		/**
		 * Outro cuidado importante que devemos ter é em relação ao horário de verão.
		 * No fim do horário de verão, por exemplo, a mesma hora existe duas vezes!
		 */
		
		LocalDateTime fimDoHorarioDeVerao2020SemFusoHorario =
				LocalDateTime.of(2020, Month.FEBRUARY, 15, 23,00);
		
		ZonedDateTime fimDoHorarioDeVerao2020ComFusoHOrario = 
				fimDoHorarioDeVerao2020SemFusoHorario.atZone(fusoHorarioDeSaoPauloo);
		System.out.println(fimDoHorarioDeVerao2020ComFusoHOrario);
		
		ZonedDateTime maisUmaHora = fimDoHorarioDeVerao2020ComFusoHOrario.plusHours(1);
		System.out.println(maisUmaHora);
		
		
		/**
		 * Existem também as classes MonthDay, que deve ser utilizada para
		 * representar datas importantes que se repetem todos os anos,
		 * e YearMonth, que deve ser utilizada para representar um mês
		 * inteiro de um ano específico.
		 */
		
		MonthDay natal = MonthDay.of(Month.DECEMBER, 25);
		YearMonth copaDoMundo2014 = YearMonth.of(2014, Month.JUNE);
		
		System.out.println(natal + "\n" + copaDoMundo2014);
		
		/**
		 * O toString padrão das classes da API utiliza o formato ISO-8601.
		 * Se quisermos definir o formato de apresentação da data,
		 * devemos utilizar o método format, passando um DateTimeFormatter.
		 */
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		hoje.format(formatador);
		
		/**
		 * O enum FormatStyle possui alguns formatos pré-definidos,
		 * que podem ser combinados com um Locale.
		 */
		
		LocalDateTime agoraaa = LocalDateTime.now();
		formatador = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("pt", "br"));
		System.out.println(agoraaa.format(formatador));
		
		/**
		 * Todas as classes mencionadas possuem diversos métodos que permitem manipular as medidas de tempo.
		 * Por exemplo, podemos usar o método plusDays da classe LocalDate para aumentarmos um dia:
		 */
		
		LocalDate hojee = LocalDate.now();
		LocalDate amanha = hoje.plusDays(1);
		System.out.println(hojee);
		System.out.println(amanha);
		
		/**
		 * Outro cálculo interessante é o número de medidas de tempo
		 * até uma determinada data, que podemos fazer através do método until. Para
		 * descobrir o número de dias até uma data, por exemplo,
		 * devemos passar ChronoUnit.DAYS como parâmetro.
		 */
		LocalDate natalDesseAno = natal.atYear(Year.now().getValue());
		long diasAteONatal = LocalDate.now().until(natalDesseAno, ChronoUnit.DAYS);
		System.out.println(diasAteONatal);
		
		/**
		 * Ajustando pra proxima sexta como exemplo:
		 */
		TemporalAdjuster ajustadorParaProximaSexta = TemporalAdjusters.next(DayOfWeek.FRIDAY);
		LocalDate proximaSexta = LocalDate.now().with(ajustadorParaProximaSexta);
		System.out.println(proximaSexta);
		
		
	}
	
	public static void contaAteUmMilhao() {
		
		for(int i = 0; i < 1; i++) {
			System.out.println(i);
		}
	}

}
