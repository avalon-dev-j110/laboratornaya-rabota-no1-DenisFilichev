package ru.avalon.java.dev.j10.labs.models;

class Passport {
    private String passportID;
    private String dateOfissue;
    private String government;

    public Passport(String passportID, String dateOfissue, String government){
        this.passportID = passportID;
        this.dateOfissue = dateOfissue;
        this.government = government;
    }

    @Override
    public String toString() {
        return "Passport " + "№" + passportID + ", дата выдачи= " + dateOfissue + ", кем выдан= " + government;
    }
    
    // Ниже приведенные сетеры переменных добавлены для большей эластичности программы.
    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }

    public void setDateOfissue(String dateOfissue) {
        this.dateOfissue = dateOfissue;
    }

    public void setGovernment(String government) {
        this.government = government;
    }
    
    
}