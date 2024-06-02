package views;

import java.util.Scanner;

public class EvaluationView {
    private Scanner scanner;
    public EvaluationView() {
        scanner = new Scanner(System.in);
    }
    public void evaluationsChoice(){
        System.out.println("------------------------------------------------------");
        System.out.println("                   Option Evaluation                  ");
        System.out.println("------------------------------------------------------");
        System.out.println("1. Ajouter une evaluation");
        System.out.println("2. Modifier une evaluation");
        System.out.println("3. Supprimer une evaluation");
        System.out.println("4. Afficher les evaluation");
        System.out.println("5. Afficher le classement");
        System.out.println("0. Retour au menu");
        System.out.println(" ");

    }

}
