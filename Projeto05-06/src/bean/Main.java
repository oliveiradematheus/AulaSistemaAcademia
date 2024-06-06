/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bean;


import controller.AlunoController;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        AlunoController alunocontroller = new AlunoController();
        alunocontroller.ControleNome();
        alunocontroller.ControleIdade();
        alunocontroller.CalculoDeNotas();
        
    }
    
}
