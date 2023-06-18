public class Main {
    public static void main(String[] args) {
        //Estructura if
        int numeroif = 5;
        if(numeroif > 0){
            System.out.println("Es positivo");
        }else if(numeroif < 0){
            System.out.println("Es negativo");
        }else{
            System.out.println("Es cero");
        }
        //Estructura While
        int numerowhile = -5;
        while(numerowhile < 3){
            numerowhile++;
            System.out.println("NumeroWhile = " + numerowhile);
        }
        //Estructura DoWhile
        do{
            numerowhile++;
            System.out.println("NumeroDoWhile = " + numerowhile);
        }while(numerowhile < 3);
        //Estructura For
        int numeroFor;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("NumeroFor = "+numeroFor);
        }
        String estacion = "verano";
        switch (estacion){
            case "invierno":
                System.out.println("Actualmente la estación es "+estacion);
                break;
            case "verano":
                System.out.println("Actualmente la estación es "+estacion);
                break;
            case "otoño":
                System.out.println("Actualmente la estación es "+estacion);
                break;
            case "primavera":
                System.out.println("Actualmente la estación es "+estacion);
                break;
            default:
                System.out.println("El dato recibido no es una estación");
                break;
        }

    }
}