public class Main {
    public static void main(String[] args) {

        PerfilDotero j = new PerfilDotero();

        System.out.println("\n\tPerfil del jugador de Dota 2:");
        System.out.println("Nick Name: " + j.getNickname());
        System.out.println("Medalla: " + j.getMedalla());
        System.out.println("ID del jugador: " + j.getId());
        System.out.println("Año de Inicio: " + j.getAnioInicio());
        System.out.println("Edad: " + j.getEdad());
        System.out.println("Partidas Jugadas: " + j.getNumjuegos());
        System.out.println("Ganó: " + j.getPartidasGan());
        System.out.println("Perdió: " + j.getPartidasPer());

        System.out.println("Commit 1");

        PerfilDotero u = new PerfilDotero();

        System.out.println("\n\tPerfil del jugador de Dota 2:");
        u.setNickname("Rotsen 2002");
        System.out.println("Nick Name: " + u.getNickname());
        System.out.println("Medalla: " + u.getMedalla());
        System.out.println("ID del jugador: " + u.getId());
        System.out.println("Año de Inicio: " + u.getAnioInicio());
        System.out.println("Edad: " + u.getEdad());
        System.out.println("Partidas Jugadas: " + u.getNumjuegos());
        System.out.println("Ganó: " + u.getPartidasGan());
        System.out.println("Perdió: " + u.getPartidasPer());
    }
}