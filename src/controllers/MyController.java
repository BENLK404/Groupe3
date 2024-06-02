package controllers;

import models.Etudiant;
import models.LaClasse;
import views.MenuPrincipale;
import models.Etudiant;

import java.sql.SQLException;
import java.time.LocalDate;

public class MyController {
    private MenuPrincipale menuPrincipale;
    public MyController() {
        menuPrincipale = new MenuPrincipale();
    }
    public void run() throws SQLException {
        boolean quitter = false;
        menuPrincipale.afficherMenuPrincipale();
        while (!quitter) {
            int choix = menuPrincipale.lireChoix();
            switch (choix) {
                case 1:
                    menuPrincipale.etudiantChoice();
                    int etudiantChoix = menuPrincipale.lireChoix();
                    switch (etudiantChoix){
                        case 1:
                            String[] infosEtudiant = menuPrincipale.demanderInformationsEtudiant();
                            Etudiant etudiant = new Etudiant(0,infosEtudiant[0],infosEtudiant[1],infosEtudiant[2],infosEtudiant[3],infosEtudiant[4],infosEtudiant[5], LocalDate.parse(infosEtudiant[6]), LaClasse.getIdClasseByName(infosEtudiant[7]));
                            etudiant.addEtudiant();
                            break;
                        case 2:
                            String[] infosUpdateEtudiant = menuPrincipale.demanderInformationsUpdateEtudiant();
                            Etudiant updateEtudiant = new Etudiant();
                            updateEtudiant.updateEtudiant(Integer.parseInt(infosUpdateEtudiant[0]),infosUpdateEtudiant[1],infosUpdateEtudiant[2],infosUpdateEtudiant[3],infosUpdateEtudiant[4],infosUpdateEtudiant[5],infosUpdateEtudiant[6],LocalDate.parse(infosUpdateEtudiant[7]),LaClasse.getIdClasseByName(infosUpdateEtudiant[8]));
                            break;
                        case 3:
                            System.out.println("OK");
                            break;
                        case 4:
                            System.out.println("OK");
                            break;
                        case 0:
                            menuPrincipale.afficherMenuPrincipale();
                            menuPrincipale.lireChoix();
                            break;
                    }
                case 2:
                    menuPrincipale.classeChoice();
                    int classeChoix = menuPrincipale.lireChoix();
                    switch (classeChoix){
                        case 1:
                            System.out.println("Option 1");
                            break;
                        case 2:
                            System.out.println("Option 2");
                            break;
                        case 3:
                            System.out.println("Option 3");
                            break;
                        case 4:
                            System.out.println("Option 4");
                            break;
                        case 0:
                            menuPrincipale.afficherMenuPrincipale();
                            menuPrincipale.lireChoix();
                            break;
                    }
                    break;
                case 3:
                    menuPrincipale.evaluationsChoice();
                    int evaluationsChoix = menuPrincipale.lireChoix();
                    switch (evaluationsChoix){
                        case 1:
                    }
                    break;
                case 4:
                    menuPrincipale.enseignantsChoice();
                    break;
                case 5:
                    menuPrincipale.notesChoice();
                    break;
                case 6:
                    menuPrincipale.matiereChoice();
                case 7:
                    quitter = true;
                    break;
            }
        }
    }

}
