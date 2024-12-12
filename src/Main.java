public class Main {

    public static void main(String[] args) {

        CasaPiscinaBuilder builderPiscina = new CasaPiscinaBuilder();

        Diretor diretor = new Diretor(builderPiscina);

        diretor.constroiCasaPiscina(10,6,8);

        Casa casa = builderPiscina.getResultado();

        System.out.println(casa);

    }
}
