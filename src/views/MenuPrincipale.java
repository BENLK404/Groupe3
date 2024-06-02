package views;

import java.util.Scanner;

public class MenuPrincipale {
    private Scanner scanner;
    public MenuPrincipale() {
        scanner = new Scanner(System.in);
    }
    public void afficherMenuPrincipale() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                                                                                         ");
        System.out.println("                           GESTIONNAIRE D'EVALUATION À ESIBA                             ");
        System.out.println("                                                                                         ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.println("1. Gestion des etudiants");
        System.out.println("2. Gestion des classes");
        System.out.println("3. Gestion des evaluations");
        System.out.println("4. Gestion des enseignents");
        System.out.println("5. Gestion des notes");
        System.out.println("6. Gestion des matières");
        System.out.println("7. Quitter");
        System.out.println(" ");
        lireChoix();

    }

    public int lireChoix() {
        int option = 0;
        try {
            System.out.print("Choisissez une option: ");
             option = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Choisissez un option valide");
            lireChoix();
        }
        return option;
    }
    public void etudiantsChoice(){
        System.out.println("1. Ajouter un etudiant");
        System.out.println("2. Modifier un etudiant");
        System.out.println("3. Supprimer un etudiant");
        System.out.println("4. Afficher un etudiant");
        System.out.println("5. Retour au menu");
    }
    public void enseignantsChoice(){
        System.out.println("1. Ajouter un enseignent");
        System.out.println("2. Modifier un enseignent");
        System.out.println("3. Supprimer un enseignent");
        System.out.println("4. Afficher un enseignent");
        System.out.println("5. Retour au menu");
    }
    public void classeChoice(){
        System.out.println("1. Ajouter une classe");
        System.out.println("2. Modifier une classe");
        System.out.println("3. Supprimer une classe");
        System.out.println("4. Afficher une classe");
        System.out.println("5. Retour au menu");
    }
    public void notesChoice(){
            System.out.println("1. Ajouter une note");
            System.out.println("2. Modifier une note");
            System.out.println("3. Supprimer une note");
            System.out.println("4. Afficher une note");
            System.out.println("5. Retour au menu");

    }
    public void matiereChoice(){
        System.out.println("1. Ajouter une matiere");
        System.out.println("2. Modifier une matiere");
        System.out.println("3. Supprimer une matiere");
        System.out.println("4. Afficher une matiere");
        System.out.println("5. Retour au menu");
    }
    public void evaluationsChoice(){
        System.out.println("1. Ajouter une evaluation");
        System.out.println("2. Modifier une evaluation");
        System.out.println("3. Supprimer une evaluation");
        System.out.println("4. Afficher une evaluation");
        System.out.println("5. Retour au menu");
    }
    public String[] demanderInformationsEtudiant(){
        System.out.print("Nom: ");
        String nom = scanner.nextLine();
        System.out.print("Prénom: ");
        String prenom = scanner.nextLine();
        System.out.print("Sexe(M/F): ");
        String sexe = scanner.nextLine();
        System.out.print("Date de naissance (YYYY-MM-DD): ");
        String dateDeNaissance = scanner.nextLine();
        System.out.print("Adresse: ");
        String adresse = scanner.nextLine();
        System.out.print("Telephone: ");
        String telephone = scanner.nextLine();
        System.out.print("Email(...@gmail.com): ");
        String email = scanner.nextLine();
        return new String[]{nom, sexe, dateDeNaissance, adresse, telephone, email};

    }
}
