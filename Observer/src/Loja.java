import java.util.ArrayList;

public class Loja implements Subject {

    private ArrayList<Observer> observers;
    private String nome;

    public Loja(String nome) {
        this.observers =  new ArrayList<>();
        this.nome = nome;
    }

    public Loja() {

    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);

        if (i>=0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        System.out.println(" Item: "+nome+" agora está  disponivel na loja");

        for (Observer o : observers){
            o.update(nome);
        }
    }

    public void setNovoProduto(String nome){

        this.nome = nome;
        notifyObserver();
    }
}
