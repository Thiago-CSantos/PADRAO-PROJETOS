public class ImpressoraSingleton {

    private static ImpressoraSingleton instance;
    private final String fabricante;

    private ImpressoraSingleton(String fabricante) {
        this.fabricante = fabricante;
    }

    public static ImpressoraSingleton getInstance(String fabricante) {
        if (instance == null){
            instance = new ImpressoraSingleton(fabricante);
        }
        return instance;
    }

    public String exibirImpressora(){
        return fabricante;
    }

}
