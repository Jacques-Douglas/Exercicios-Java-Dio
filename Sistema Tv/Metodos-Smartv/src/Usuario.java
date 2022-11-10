public class Usuario {
    public static void main(String[] args) throws Exception {

        Smartv smarTv = new Smartv();


        System.out.println("Tv Ligada ? " + smarTv.ligada);
        System.out.println("Volume Atual? " + smarTv.volume);
        System.out.println("Canal Atual? " + smarTv.canal);

        System.out.println("---------------------- COMANDOS -----------------------------");

        smarTv.ligar();
        System.out.println("Tv Ligada ? " + smarTv.ligada);
        
        smarTv.desligar();
        System.out.println("Tv Ligada ? " + smarTv.ligada);

        smarTv.ligar();
        System.out.println("Tv Ligada ? " + smarTv.ligada);
        
        smarTv.aumentarVolume();
        System.out.println("Volume Atual? " + smarTv.volume);

        smarTv.diminuirVolume();
        System.out.println("Volume Atual? " + smarTv.volume);

        smarTv.aumentarCanal();
        smarTv.aumentarCanal();
        smarTv.aumentarCanal();
        System.out.println("Canal Atual? " + smarTv.canal);

        smarTv.diminuirCanal();
        System.out.println("Canal Atual? " + smarTv.canal);

        smarTv.mudarCanal(50);
        System.out.println("Canal Atual? " + smarTv.canal);


        



        


    }
} 
