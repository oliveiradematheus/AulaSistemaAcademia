/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.Aluno;

/**
 *
 * @author aluno
 */
public class AlunoController {

    public void ControleIdade() {
        Scanner s = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Insira sua idade: ");
        aluno.setIdade(s.nextInt());
        //int idade = s.nextInt();

        if (aluno.getIdade() >= 18 && aluno.getIdade() < 64) {
            System.out.println("Pode estudar");
        } else if (aluno.getIdade() < 18) {
            System.out.println("Não pode estudar");
        } else if (aluno.getIdade() >= 64) {
            System.out.println("Idoso");

        }

    }

    public void ControleNome() {
        Scanner s = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Insira seu nome: ");
        aluno.setNome(s.next());
        System.out.println("Olá, " + aluno.getNome());
    }
    
    public void CalculoDeNotas() {
        Scanner s = new Scanner (System.in);
        Aluno aluno = new Aluno ();
        System.out.println("Insira a primeira nota: ");
        double Nota1 = s.nextDouble();
        System.out.println("Insira a segunda nota: ");
        double Nota2 = s.nextDouble();
        System.out.println("Insira a terceira nota: ");
        double Nota3 = s.nextDouble();
        System.out.println("Insira a quarta nota: ");
        double Nota4 = s.nextDouble();
        
        double media = (Nota1 + Nota2 + Nota3 + Nota4) / 4;
        aluno.setMedia(media);
        
        System.out.println("Média: " +media);
        if (media < 3) {
            System.out.println("Você foi reprovado :(");
        } else if (media < 6) {
            System.out.println("Final :|");
        } else if (media >= 6) {
            System.out.println("Você foi aprovado :)");
        }
    }
}
