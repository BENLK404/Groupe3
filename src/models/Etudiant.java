package models;

import database.Connectivity;

import java.sql.*;
import java.time.LocalDate;

public class Etudiant {
    private int idEtudiant;
    private String nomEtudiant;
    private String prenomEtudiant;
    private String sexeEtudiant;
    private String adresseEtudiant;
    private String emailEtudiant;
    private String telephoneEtudiant;
    private LocalDate dateNaissanceEtudiant;
    private int idClasse;

    public Etudiant(int idEtudiant, String nomEtudiant, String prenomEtudiant, String sexeEtudiant, String adresseEtudiant, String emailEtudiant, String telephoneEtudiant, LocalDate dateNaissanceEtudiant, int idClasse) {
        this.idEtudiant = idEtudiant;
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.sexeEtudiant = sexeEtudiant;
        this.adresseEtudiant = adresseEtudiant;
        this.emailEtudiant = emailEtudiant;
        this.telephoneEtudiant = telephoneEtudiant;
        this.dateNaissanceEtudiant = dateNaissanceEtudiant;
        this.idClasse = idClasse;
    }

    public Etudiant(int idEtudiant, String nomEtudiant, String prenomEtudiant, String sexeEtudiant, String adresseEtudiant, String emailEtudiant, String telephoneEtudiant, LocalDate dateNaissanceEtudiant) {
        this.idEtudiant = idEtudiant;
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.sexeEtudiant = sexeEtudiant;
        this.adresseEtudiant = adresseEtudiant;
        this.emailEtudiant = emailEtudiant;
        this.telephoneEtudiant = telephoneEtudiant;
        this.dateNaissanceEtudiant = dateNaissanceEtudiant;
    }

    public Etudiant(String nomEtudiant, String prenomEtudiant, String sexeEtudiant, String adresseEtudiant, String emailEtudiant, String telephoneEtudiant, LocalDate dateNaissanceEtudiant) {
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.sexeEtudiant = sexeEtudiant;
        this.adresseEtudiant = adresseEtudiant;
        this.emailEtudiant = emailEtudiant;
        this.telephoneEtudiant = telephoneEtudiant;
        this.dateNaissanceEtudiant = dateNaissanceEtudiant;
    }

    public Etudiant(String nomEtudiant, String prenomEtudiant, String sexeEtudiant, String adresseEtudiant, String emailEtudiant, String telephoneEtudiant, LocalDate dateNaissanceEtudiant, int idClasse) {
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.sexeEtudiant = sexeEtudiant;
        this.adresseEtudiant = adresseEtudiant;
        this.emailEtudiant = emailEtudiant;
        this.telephoneEtudiant = telephoneEtudiant;
        this.dateNaissanceEtudiant = dateNaissanceEtudiant;
        this.idClasse = idClasse;
    }

    public Etudiant() {

    }

    public void addEtudiant() throws SQLException {
        if (nomEtudiant == null || prenomEtudiant == null || sexeEtudiant == null || adresseEtudiant == null || emailEtudiant == null || telephoneEtudiant == null || dateNaissanceEtudiant == null) {
            throw new IllegalArgumentException("Tous les champs doivent être remplis avant d'ajouter un étudiant.");
        }
        Connection connection = Connectivity.getDbConnection();
        String sql = "INSERT INTO etudiants (nom, prenom, date_naissance, sexe, adresse, telephone, email, id_classe) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            assert connection != null;
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, nomEtudiant);
                preparedStatement.setString(2, prenomEtudiant);
                preparedStatement.setDate(3, Date.valueOf(dateNaissanceEtudiant));
                preparedStatement.setString(4, sexeEtudiant);
                preparedStatement.setString(5, adresseEtudiant);
                preparedStatement.setString(6, telephoneEtudiant);
                preparedStatement.setString(7, emailEtudiant);
                if (idClasse != 0) {
                    preparedStatement.setInt(8, idClasse);
                } else {
                    preparedStatement.setNull(8, Types.INTEGER);
                }
                preparedStatement.executeUpdate();
                System.out.println("Étudiant ajouté avec succès!");
            }
        } catch (NullPointerException | SQLException nullPointerException){
            nullPointerException.printStackTrace();
        }
    }
    public void updateEtudiant(int idEtudiant, String nomEtudiant, String prenomEtudiant, String sexeEtudiant, String adresseEtudiant, String emailEtudiant, String telephoneEtudiant, LocalDate dateNaissanceEtudiant,int idClasse) throws SQLException {
        Connection connection = Connectivity.getDbConnection();
        String sql = "update etudiants SET nom =?, prenom=?, date_naissance=?, sexe=?, adresse=?, telephone=?, email=?, id_classe=? where id_etudiant = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, nomEtudiant);
            preparedStatement.setString(2, prenomEtudiant);
            preparedStatement.setDate(3, Date.valueOf(dateNaissanceEtudiant));
            preparedStatement.setString(4, sexeEtudiant);
            preparedStatement.setString(5, adresseEtudiant);
            preparedStatement.setString(6, emailEtudiant);
            preparedStatement.setString(7, telephoneEtudiant);
            preparedStatement.setInt(8, idClasse);
//            if (idClasse != 0) {
//                preparedStatement.setInt(8, idClasse);
//            } else {
//                preparedStatement.setNull(8, Types.INTEGER);
//            }
            preparedStatement.setInt(9, idEtudiant);
            preparedStatement.executeUpdate();
            System.out.println("Modification reussi ");
        }catch (NullPointerException | SQLException nullPointerException){
            nullPointerException.printStackTrace();
            }
    }
//    public void deleteEtudiant(int idEtudiant) throws SQLException {
//        Connection connection = Connectivity.getDbConnection();
//        String sql = "delete from etudiants where id_etudiant = ?";
//        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
//            preparedStatement.setInt(1, idEtudiant);
//            preparedStatement.executeUpdate();
//            System.out.println("Suppression reussi ");
//        }
//    }
    public void deleteEtudiant(String nomEtudiant, String prenomEtudiant) throws SQLException {
        Connection connection = Connectivity.getDbConnection();
        String sql = "delete from etudiants where nom = ? and  prenom =?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setString(1, nomEtudiant);
            preparedStatement.setString(2, prenomEtudiant);
            preparedStatement.executeUpdate();
            System.out.println("Suppression Effectuer ");
        }
    }
    public void getEtudiantById(int idEtudiant) throws SQLException {
        Connection connection = Connectivity.getDbConnection();
        String sql = "select * from etudiants where id_etudiant = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            preparedStatement.setInt(1, idEtudiant);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                this.idEtudiant = idEtudiant;
               idClasse = resultSet.getInt("id_classe");
               nomEtudiant = resultSet.getString("nom");
               prenomEtudiant = resultSet.getString("prenom");
               sexeEtudiant = resultSet.getString("sexe");
               adresseEtudiant = resultSet.getString("adresse");
               emailEtudiant = resultSet.getString("email");
               telephoneEtudiant = resultSet.getString("telephone");
               dateNaissanceEtudiant = resultSet.getDate("date_naissance").toLocalDate();
            System.out.println(toString());
            }
        }
    }


    public int getIdEtudiant() {
        return idEtudiant;
    }


    public void setIdEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    public String getSexeEtudiant() {
        return sexeEtudiant;
    }

    public void setSexeEtudiant(String sexeEtudiant) {
        this.sexeEtudiant = sexeEtudiant;
    }

    public String getAdresseEtudiant() {
        return adresseEtudiant;
    }

    public void setAdresseEtudiant(String adresseEtudiant) {
        this.adresseEtudiant = adresseEtudiant;
    }

    public String getEmailEtudiant() {
        return emailEtudiant;
    }

    public void setEmailEtudiant(String emailEtudiant) {
        this.emailEtudiant = emailEtudiant;
    }

    public String getTelephoneEtudiant() {
        return telephoneEtudiant;
    }

    public void setTelephoneEtudiant(String telephoneEtudiant) {
        this.telephoneEtudiant = telephoneEtudiant;
    }

    public LocalDate getDateNaissanceEtudiant() {
        return dateNaissanceEtudiant;
    }

    public void setDateNaissanceEtudiant(LocalDate dateNaissanceEtudiant) {
        this.dateNaissanceEtudiant = dateNaissanceEtudiant;
    }

    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }


    @Override
    public String toString() {
        return "Étudiant" +
                " id : " + idEtudiant +
                ", nom : '" + nomEtudiant + '\'' +
                ", prenom : '" + prenomEtudiant + '\'' +
                ", sexe : '" + sexeEtudiant + '\'' +
                ", adresse : '" + adresseEtudiant + '\'' +
                ", email : '" + emailEtudiant + '\'' +
                ", telephone : '" + telephoneEtudiant + '\'' +
                ", date Naissance : " + dateNaissanceEtudiant +
                ", id Classe : " + idClasse;
    }

}

