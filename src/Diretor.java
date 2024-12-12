public class Diretor {

    private CasaBuilder casaBuilder;

    public Diretor(CasaBuilder casaBuilder) {
        this.casaBuilder = casaBuilder;
    }

    public void constroiCasaPiscina(int paredes, int portas, int janelas){

        casaBuilder.builderParede();
        casaBuilder.builderJanelas();
        casaBuilder.builderPortas();
        casaBuilder.builderTelhado();
        casaBuilder.builderPiscina();


    }
}
