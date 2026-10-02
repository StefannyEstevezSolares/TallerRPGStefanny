package com.mycompany.tallerrpgstefanny;

public class Batalla {
    
    public static void ejecutarAtaqueCritico(Personaje atacante, Personaje objetivo){
    
        System.out.println(atacante.nombre + " realiza un ataque crítico contra " + objetivo.nombre);
        double dano = (atacante.puntosAtaque * 2) - objetivo.puntosDefensa;
        objetivo.recibirDano(dano);
        System.out.println("Danio crítico: " + dano);
        
    }
    
    public static void iniciarPeleaAutomatica(Personaje p1, Personaje p2){
    
        while(p1.estaVivo() && p2.estaVivo()){
            
            p1.atacar(p2);
            p2.atacar(p1);
            
        }
        System.out.println("La pelea ha terminado.");
        
        if(p1.estaVivo()){
        
            System.out.println(p1.nombre + " es el ganador");
        }else{
            System.out.println(p2.nombre + " es el ganador");
        }
    }
}
