/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anguloponteiros;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Opteron
 */
public class CalculaAnguloPonteiroTest {
    
    public CalculaAnguloPonteiroTest() {
    }
    
    @Test
     public void testRetornaAnguloRelogio() {
        System.out.println("retornaAnguloRelogio");
        GregorianCalendar horario = new GregorianCalendar();
        
        
        CalculaAnguloPonteiro instance = new CalculaAnguloPonteiro();
        
        horario.set(Calendar.HOUR_OF_DAY, 12);
        horario.set(Calendar.MINUTE, 0);
        
        assertEquals(0, instance.retornaAnguloRelogio(horario));
        
        horario.set(Calendar.MINUTE, 15);
        assertEquals(90, instance.retornaAnguloRelogio(horario));
        
        horario.set(Calendar.HOUR_OF_DAY, 15);
        horario.set(Calendar.MINUTE, 15);
        
        assertEquals(0, instance.retornaAnguloRelogio(horario));
        
        horario.set(Calendar.HOUR_OF_DAY, 0);
        horario.set(Calendar.MINUTE, 0);
        
        assertEquals(0, instance.retornaAnguloRelogio(horario));
        
        horario.set(Calendar.HOUR_OF_DAY, 11);
        horario.set(Calendar.MINUTE, 00);
        
        assertEquals(30, instance.retornaAnguloRelogio(horario));
        
    }
    
}
