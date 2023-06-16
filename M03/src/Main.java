public class Main {
    public static void main(String [] args){
        int r = sumaTres(3,4,5);
        System.out.println(r);
        Coche pichirilo = new Coche();
        pichirilo.sumapuerta(2);
        System.out.println(pichirilo.n_puertas);
    }

    public static int sumaTres(int a, int b, int c){
        int r = a + b + c;
        return r;
    }
}
class Coche{
    public int n_puertas = 0;
    public void sumapuerta(int n){
        n_puertas += n;
    }
}