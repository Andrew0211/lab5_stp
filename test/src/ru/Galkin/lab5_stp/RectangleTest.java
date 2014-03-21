package ru.Galkin.lab5_stp;
import java.io.*;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;


    public class RectangleTest {
	@Test
         public void testType(){
			System.out.println("Тестируем класс Прямоугольник");
			Rectangle t = new Rectangle(1,1,1, "Rectangle");
			assertEquals("Rectangle",t.name);
		} 
         @Test
	 public void testMethod(){
			System.out.println("Тестируем метод getDiagonal()");
			Rectangle t = new Rectangle(2,6,2,"Rectangle");
			assertEquals(6.32,t.getDiagonal(),0.01);			
		}
    }
