package anguloponteiros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;


public class AnguloPonteiros {

  
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Digite um horário no formato : HH:mm");
        String horaMinuto = br.readLine();
        String[] splitHoraMinuto = horaMinuto.split(":");
        int hora = Integer.parseInt(splitHoraMinuto[0]);
        int minuto = Integer.parseInt(splitHoraMinuto[1]);
          
        GregorianCalendar horario = new GregorianCalendar(2018, 0, 1, hora, minuto);
        CalculaAnguloPonteiro cap = new CalculaAnguloPonteiro();
        long resultado = cap.retornaAnguloRelogio(horario);
        System.out.println(resultado );

    }
    
    
    
}

