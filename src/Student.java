public class Student {

    private String naam;  //instance variabele
    private int studentnummer;

    public Student(int studentnummer){  //Constructor een

        this.studentnummer = studentnummer;
    }

    public Student(String naam, int studentnummer){
        this.naam = naam;
        this.studentnummer = studentnummer;
    }

    public void info(){
        System.out.println("Dit is student "+getNaam());
        System.out.println("Met studentnummer "+getStudentnummer());
    }


    public int getStudentnummer() {
        return studentnummer;
    }

    /**
     * @return the naam
     */
    public String getNaam() {
        return naam;
    }

    /**
     * @param naam the naam to set
     */
    public void setNaam(String naam) {
        this.naam = naam;
    }
}