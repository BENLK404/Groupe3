
import models.Etudiant;
import models.Matiere;
import models.Note;
import views.MenuPrincipale;

import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
//        Etudiant etudiant = new Etudiant("Jean", "Dupont", "M", "123 Rue Exemple", "jean.dupont@example.com", "1234567890", LocalDate.of(2000, 1, 1),1);
//        etudiant.addEtudiant();
//        Etudiant etudiant = new Etudiant();
//
//        Matiere matiere = new Matiere();
        MenuPrincipale menuPrincipale = new MenuPrincipale();
        menuPrincipale.demanderInformationsEtudiant();
//            Note note = new Note(10.59,1,1,"Passable");
//            note.addNote();
//        etudiant.updateEtudiant(1,"Aguem","Espoir","M","Assivito","agenpdmn@gmail.com","8746672874",LocalDate.of(2000,4,12),1);
    }
}