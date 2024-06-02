package controllers;

import models.Etudiant;
import models.LaClasse;
import views.*;

import java.sql.SQLException;
import java.time.LocalDate;

public class MyController {
    private MenuPrincipale menuPrincipale;
    private EtudiantView etudiantView;
    private LaClasseView laClasseView;
    private EnseignentView enseignentView;
    private NoteView noteView;
    private EvaluationView evaluationView;
    private MatiereView matiereView;


    public MyController() {
        menuPrincipale = new MenuPrincipale();
        etudiantView = new EtudiantView();
        laClasseView = new LaClasseView();
        noteView = new NoteView();
        evaluationView = new EvaluationView();

    }
    public void run() throws SQLException {
        boolean quitter = false;
        menuPrincipale.afficherMenuPrincipale();
        while (!quitter) {
            int choix = menuPrincipale.lireChoix();
            switch (choix) {
                case 1:
                    etudiantView.etudiantChoice();
                    int etudiantChoix = menuPrincipale.lireChoix();
                    switch (etudiantChoix){
                        case 1:
                            String[] infosEtudiant = etudiantView.demanderInformationsEtudiant();
                            Etudiant etudiant = new Etudiant(0,infosEtudiant[0],infosEtudiant[1],infosEtudiant[2],infosEtudiant[3],infosEtudiant[4],infosEtudiant[5], LocalDate.parse(infosEtudiant[6]), LaClasse.getIdClasseByName(infosEtudiant[7]));
                            etudiant.addEtudiant();
                            break;
                        case 2:
                            String[] infosUpdateEtudiant = etudiantView.demanderInformationsUpdateEtudiant();
                            Etudiant updateEtudiant = new Etudiant();
                            updateEtudiant.updateEtudiant(Integer.parseInt(infosUpdateEtudiant[0]),infosUpdateEtudiant[1],infosUpdateEtudiant[2],infosUpdateEtudiant[3],infosUpdateEtudiant[4],infosUpdateEtudiant[5],infosUpdateEtudiant[6],LocalDate.parse(infosUpdateEtudiant[7]),LaClasse.getIdClasseByName(infosUpdateEtudiant[8]));
                            break;
                        case 3:
                            String[] infosDeleteEtudiant = etudiantView.demanderInformationsDeleteEtudiant();
                            Etudiant deleteEtudiant = new Etudiant();
                            deleteEtudiant.deleteEtudiant(infosDeleteEtudiant[0],infosDeleteEtudiant[1]);
                            break;
                        case 4:
                            System.out.print("OK");
                            break;
                        case 0:
                            menuPrincipale.afficherMenuPrincipale();
                            menuPrincipale.lireChoix();
                            break;
                    }
                case 2:
                    laClasseView.classeChoice();
                    int classeChoix = menuPrincipale.lireChoix();
                    switch (classeChoix){
                        case 1:
                            String[] infosClass = laClasseView.demanderInformationsClasse();
                            LaClasse laClasse = new LaClasse();
                            break;
                        case 2:
                            System.out.print("Option 2");
                            break;
                        case 3:
                            System.out.print("Option 3");
                            break;
                        case 4:
                            System.out.print("Option 4");
                            break;
                        case 0:
                            menuPrincipale.afficherMenuPrincipale();
                            menuPrincipale.lireChoix();
                            break;
                    }
                    break;
                case 3:
                    evaluationView.evaluationsChoice();
                    int evaluationsChoix = menuPrincipale.lireChoix();
                    switch (evaluationsChoix){
                        case 1:
                            System.out.print("Option 1");
                            break;
                        case 2:
                            System.out.print("Option 2");
                            break;
                        case 3:
                            System.out.print("Option 3");
                            break;
                        case 4:
                            System.out.print("Option 4");
                            break;
                        case 0:
                            menuPrincipale.afficherMenuPrincipale();
                            menuPrincipale.lireChoix();

                    }
                    break;
                case 4:
                    enseignentView.enseignantsChoice();
                    break;
                case 5:
                    noteView.notesChoice();
                    break;
                case 6:
                    matiereView.matiereChoice();

                    break;
                case 7:
                    quitter = true;
                    break;
            }
        }
    }

}
