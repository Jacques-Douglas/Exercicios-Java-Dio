public class Smartv {
    

    boolean ligada = false;
    int canal = 1;
    int volume = 25;



    public void ligar(){
        System.out.println("Ligando TV...");
        ligada = true;
    }


    public void desligar (){
        System.out.println("Desligando Tv...");
        ligada = false;

    }

    public void aumentarVolume () {

        volume++;
        System.out.println("Aumentando Volume ++ "+volume);
    }

    public void diminuirVolume () {

        volume--;
        System.out.println("Diminuindo Volume -- "+volume);
    }

    public void aumentarCanal () {

        canal ++;
        System.out.println("Aumentando Canal ++ " + canal);

    }

    public void diminuirCanal () {

        canal --;
        System.out.println("Diminuir Canal ++ " + canal);

    }

    public void mudarCanal ( int novoCanal){

        canal = novoCanal;
    }


}   

