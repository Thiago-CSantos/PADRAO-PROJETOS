public class Cliente implements Observer {

    private String email;

    public Cliente(String email) {
        this.email = email;
    }

    @Override
    public void update(String nome) {
        System.out.println("Enviando email para o cliente " + email + " sobre o produto " + nome);
    }
}
