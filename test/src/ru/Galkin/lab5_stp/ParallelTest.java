package ru.Galkin.lab5_stp;
import java.io.*;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;


    public class ParallelTest {
	@Test
         public void testType(){
			System.out.println("Тестируем класс Параллелограмм");
			Parallel t = new Parallel(1,1,1,1, "Parallel");
			assertEquals("Parallel",t.name);
		} 
         @Test
	 public void testMethod(){
			System.out.println("Тестируем метод getRadian()");
			Parallel t = new Parallel(2,0,0,60, "Parallel");
			assertEquals(1.05,t.getRadian(),0.01);			
		}
    }
