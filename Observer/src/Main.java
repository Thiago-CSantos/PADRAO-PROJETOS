public class Main {
    public static void main(String[] args) {

        Loja l =  new Loja();

        Cliente c = new Cliente("thia@santo.com");
        Cliente cv = new Cliente("leo@santo.com");

        l.setNovoProduto("Iphone");

        l.removeObserver(c);

    }
}