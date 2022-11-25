package Atendimento_Medico;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Calendar;

public class ExData1 {

	public static void main(String[] args) {
//		Date hj = new Date();
//		System.out.println(hj);
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 24);
		calendario.set(Calendar.MONTH, 3);
		calendario.set(Calendar.YEAR, 1978);
		calendario.set(Calendar.HOUR_OF_DAY, 12);
		calendario.set(Calendar.MINUTE, 30);
		calendario.set(Calendar.SECOND, 55);
		
		Date dt = calendario.getTime();
		System.out.println("Rodriguinho nasceu em: " + dt);
		
		
		List<Date> lista = Data.diasDoMesAno(1, 2001);
		for(Iterator iter = lista.iterator(); iter.hasNext();) {
			Date element = (Date) iter.next();
			System.out.println(element);
		}
		
		
		
		
	}

}
