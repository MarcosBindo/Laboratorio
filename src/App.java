import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Productor laboratorioSA = new Productor("LaboratorioSA","Valdez", "21/02/2810", "19-49559989-8", "123");
        laboratorioSA.renovarDatos("44159989");

        Auditor rodrigo = new Auditor("Alvarez", "20/08/2002", "20-023467891-8", "456");

        Consumidor marcos = new Consumidor("Bindo", "19/10/2021", "20-44159989-9", "contrase├▒aUltraSegura");

        Sustancia sust1 = new Simple("Agua", "H2O", 89.9, 200, 50);
        Sustancia sust2 = new Simple("Azufre", "S", 100.0, 50, 72);

        rodrigo.subirSustancia(laboratorioSA, sust1);
        rodrigo.subirSustancia(laboratorioSA, sust2);

        Date dia = new Date(2021019);

        marcos.iniciarTramite(dia, sust1, 20, laboratorioSA);
        marcos.cerrarTramite(Tramite.getCount());

        marcos.iniciarTramite(dia, sust1, 30, laboratorioSA);
        marcos.cerrarTramite(Tramite.getCount());

        marcos.iniciarTramite(dia, sust2, 40, laboratorioSA);
        marcos.cerrarTramite(Tramite.getCount());



    }  
}
