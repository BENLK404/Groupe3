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
    }

    public int lireChoix() {
        int option = 0;
        boolean validInput = false;


        while (!validInput) {
            System.out.print("Choisissez une option: ");
            try {
                option = Integer.parseInt(scanner.nextLine());
                validInput = true;  // input is valid, exit the loop
            } catch (NumberFormatException e) {
                System.out.println("Choisissez un option valide");
            }
        }
        return option;
    }

    public void enseignantsChoice(){
        System.out.println("------------------------------------------------------");
        System.out.println("                   Option Enseignant                  ");
        System.out.println("------------------------------------------------------");
        System.out.println("1. Ajouter un enseignent");
        System.out.println("2. Modifier un enseignent");
        System.out.println("3. Supprimer un enseignent");
        System.out.println("4. Afficher les enseignent");
        System.out.println("0. Retour au menu");
    }
    public void classeChoice(){
        System.out.println("------------------------------------------------------");
        System.out.println("                   Option Classe                      ");
        System.out.println("------------------------------------------------------");
        System.out.println("1. Ajouter une classe");
        System.out.println("2. Modifier une classe");
        System.out.println("3. Supprimer une classe");
        System.out.println("4. Afficher les classe");
        System.out.println("0. Retour au menu");
        System.out.println(" ");
    }
    public void notesChoice(){
        System.out.println("------------------------------------------------------");
        System.out.println("                   Option Note                        ");
        System.out.println("------------------------------------------------------");
        System.out.println("1. Ajouter une note");
        System.out.println("2. Modifier une note");
        System.out.println("3. Supprimer une note");
        System.out.println("4. Afficher les note");
        System.out.println("0. Retour au menu");
        System.out.println(" ");

    }
    public void matiereChoice(){
        System.out.println("------------------------------------------------------");
        System.out.println("                   Option Matiere                     ");
        System.out.println("------------------------------------------------------");
        System.out.println("1. Ajouter une matiere");
        System.out.println("2. Modifier une matiere");
        System.out.println("3. Supprimer une matiere");
        System.out.println("4. Afficher les matiere");
        System.out.println("0. Retour au menu");
        System.out.println(" ");
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
    public  void etudiantChoice(){
        System.out.println("------------------------------------------------------");
        System.out.println("                   Option Étudiant                    ");
        System.out.println("------------------------------------------------------");

        System.out.println("1. Ajouter un etudiant");
        System.out.println("2. Modifier un etudiant");
        System.out.println("3. Supprimer un etudiant");
        System.out.println("4. Afficher un etudiant");
        System.out.println("5. Afficher les etudiants");
        System.out.println("0. Retour au menu");
        System.out.println(" ");
    }
    public String[] demanderInformationsEtudiant(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                           Information de l'étudiant                            ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("0. Retour");
        System.out.println(" ");
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
        System.out.print("Classe: ");
        String classe = scanner.nextLine();
        return new String[]{nom,prenom, sexe, adresse, email, telephone,dateDeNaissance,classe};

    }
    public String[] demanderInformationsEnseignent(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                          Information de l'enseignent                           ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Nom: ");
        String nom = scanner.nextLine();
        System.out.print("Prénom: ");
        String prenom = scanner.nextLine();
        String telephone = scanner.nextLine();
        System.out.print("Email(...@gmail.com): ");
        String email = scanner.nextLine();
        System.out.print("Matière: ");
        String matiere = scanner.nextLine();
        return new String[]{nom, prenom, telephone, email, matiere};
    }
    public String[] demanderInformationsNote(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                             Information de la note                             ");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.print("Nom de l'étudiant: ");
        String nom = scanner.nextLine();
        System.out.print("Prenom de l'étudiant : ");
        String prenom = scanner.nextLine();
        System.out.print("Evalution: ");
        String evalution = scanner.nextLine();
        System.out.print("Note : ");
        String note = scanner.nextLine();
        return new String[]{nom, prenom,evalution, note};
    }
    public String[] demanderInformationsMatiere(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                           Information de la matiere                            ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Nom: ");
        String nom = scanner.nextLine();
        System.out.print("Description: ");
        String description = scanner.nextLine();
        return new String[]{nom,description};

    }
    public String[] demanderInformationsClasse(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                           Information de la classe                             ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("Nom: ");
        String nom = scanner.nextLine();
        System.out.print("Niveau: ");
        String niveau = scanner.nextLine();
        return new String[]{nom,niveau};
    }
    public String[] demanderInformationsUpdateEtudiant(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("                           Information de l'étudiant                            ");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("0. Retour");
        System.out.println(" ");
        System.out.print("ID de l'étudient: ");
        String id = scanner.nextLine();
        System.out.print("Nouveau Nom: ");
        String nom = scanner.nextLine();
        System.out.print("Nouveau Prénom: ");
        String prenom = scanner.nextLine();
        System.out.print("Nouveau Sexe(M/F): ");
        String sexe = scanner.nextLine();
        System.out.print("Nouvelle Date de naissance (YYYY-MM-DD): ");
        String dateDeNaissance = scanner.nextLine();
        System.out.print("Nouvelle Adresse: ");
        String adresse = scanner.nextLine();
        System.out.print("Nouveau Telephone: ");
        String telephone = scanner.nextLine();
        System.out.print("Nouveau Email(...@gmail.com): ");
        String email = scanner.nextLine();
        System.out.print("Nouvelle Classe: ");
        String classe = scanner.nextLine();
        return new String[]{id,nom,prenom, sexe, adresse, email, telephone,dateDeNaissance,classe};

    }

}
