package Atendimento_Medico;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Data {
	public static List<Date> diasDoMesAno(int mes, int ano){
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.MONTH, mes);
		calendario.set(Calendar.YEAR, ano);
		
		int qntDias = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
		List<Date> listaDias = new ArrayList<Date>();
		for (int i = 1; i <= qntDias; i++) {
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.DATE, i);
			cal.set(Calendar.MONTH, mes);
			cal.set(Calendar.YEAR, ano);
			
			Date hoje = cal.getTime();
			listaDias.add(hoje);
		}
		
		return listaDias;
		
		
	}
	
	public static long segundosEntreDatas(Date inicio, Date fim){
		long secIn = inicio.getTime();
		long secFi = fim.getTime();
		long dif = (secFi - secIn) / 1000;
		return dif;
		
}
}