public class PerfilDotero {
    String nickname, medalla;
    int id, edad, numjuegos, anioInicio, partidasGan, partidasPer;

    public PerfilDotero() {
        nickname = "RotsenGG";
        medalla = "Ancestral";
        id = 1781665;
        edad = 20;
        partidasGan = 1000;
        partidasPer = 230;
        numjuegos = partidasGan + partidasPer;
        anioInicio = 2015;

    }

    public void asistir (){

    }

    public void tepear() {

    }

    public void killear(){

    }

    public void supportear(){

    }

    public void morir(){

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMedalla() {
        return medalla;
    }

    public void setMedalla(String medalla) {
        this.medalla = medalla;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumjuegos() {
        return numjuegos;
    }

    public void setNumjuegos(int numjuegos) {
        this.numjuegos = numjuegos;
    }

    public int getAnioInicio() {
        return anioInicio;
    }

    public void setAnioInicio(int anioInicio) {
        this.anioInicio = anioInicio;
    }

    public int getPartidasGan() {
        return partidasGan;
    }

    public void setPartidasGan(int partidasGan) {
        this.partidasGan = partidasGan;
    }

    public int getPartidasPer() {
        return partidasPer;
    }

    public void setPartidasPer(int partidasPer) {
        this.partidasPer = partidasPer;
    }
}
