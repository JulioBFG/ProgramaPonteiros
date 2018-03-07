package anguloponteiros;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class CalculaAnguloPonteiro {
    public long retornaAnguloRelogio(GregorianCalendar horario){
        int hora = horario.get(Calendar.HOUR_OF_DAY);
        int minuto = horario.get(Calendar.MINUTE);
        
        int hora_base_12 = hora %12;
        int anguloHora = 360 / 12 * hora_base_12;
        int anguloMinuto = 360 / 60 * minuto;
        int resultado = Math.abs(anguloMinuto - anguloHora);
        if (resultado > 180){
          return 360 - resultado;
        }
         return resultado; 
    }        
}
