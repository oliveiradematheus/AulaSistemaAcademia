/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class AlunoController {
  
    public void ControleIdade () {
        Scanner s = new Scanner (System.in);
        System.out.println("Insira sua idade: ");
        int idade = s.nextInt();
        
        if (idade >= 18) {
            System.out.println("Pode estudar");
        } else if(idade < 18) {
            System.out.println("Não pode estudar");
        } else if (idade > 64) {
            System.out.println("Idoso");
                  
        }
    }
    
    }
    
