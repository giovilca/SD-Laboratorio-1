package lab01n2;

public class Main {

    public static void main(String[] args) {
        CubbyHole cub = new CubbyHole();
        Consumidor cons = new Consumidor(cub, 1);
        Productor prod = new Productor(cub, 1);
      
        prod.start();
        cons.start();
    }   
}

