package object;

public class Calculo {
    private Usuario valores;

    public Calculo(Usuario valores) {
        this.valores = valores;
    }

    public Float CalculoIMC () {
        return valores.getPeso() / (valores.getAltura() * valores.getAltura());
    }

}
