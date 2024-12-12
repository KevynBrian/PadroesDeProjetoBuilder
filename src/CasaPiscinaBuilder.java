public class CasaPiscinaBuilder implements CasaBuilder{

    private Casa casa = new Casa();

    @Override
    public void builderParede() {

        System.out.println("Construindo Paredes");

    }

    @Override
    public void builderPortas() {

        System.out.println("Construindo Portas");

    }

    @Override
    public void builderJanelas() {

        System.out.println("Construindo Janelas");

    }

    @Override
    public void builderTelhado() {

        System.out.println("Construindo Telhado");

    }

    @Override
    public void builderGaragem() {

        System.out.println("Construindo Garagem");

    }

    @Override
    public void builderPiscina() {

        System.out.println("Construindo Piscina");

    }

    @Override
    public Casa getResultado() {
        return casa;
    }
}
