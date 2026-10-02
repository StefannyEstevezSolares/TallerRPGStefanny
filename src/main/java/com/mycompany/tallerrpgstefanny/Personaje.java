
package com.mycompany.tallerrpgstefanny;


public class Personaje {
    
    String nombre;
    double puntosVida;
    double puntosVidaMax;
    double puntosAtaque;
    double puntosDefensa;
    int nivel;
    
    static int totalPersonajesCreados;
    
    public Personaje(){
        
        nombre = "Guerrero Novato";
        puntosVidaMax = 100.0;
        puntosVida = 100.0;
        puntosAtaque = 15.0;
        puntosDefensa = 5.0;
        nivel = 1;
        
        totalPersonajesCreados++;
     
    }
    
    
    public Personaje(String nombre, double puntosVidaMax, double puntosAtaque, double puntosDefensa){
        this.nombre = nombre;
        this.puntosVidaMax = puntosVidaMax;
        this.puntosVida = puntosVidaMax;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.nivel = 1;
        
        totalPersonajesCreados++;
}
    
    public void atacar(Personaje objetivo){
    
    System.out.println(nombre + " esta atancando a " + objetivo.nombre);
    
    double dano = Math.max(0, puntosAtaque - objetivo.puntosDefensa);
    objetivo.recibirDano(dano);
    System.out.println("Daño causado: " + dano);
    
    }
    
    public void recibirDano(double cantidad){
    
        puntosVida = Math.max(0, puntosVida - cantidad);
    
    }
    
    public boolean estaVivo(){
    
    return puntosVida > 0;
        
    }
    
    public void curar(){
    
        puntosVida = puntosVidaMax;
    
    }
    
    public void subirNivel(){
    
        nivel++;
    }
    
    public void mostrarEstado(){
    
        System.out.println("Nombre: " + nombre);
        System.out.println("Vida; " + puntosVida + "/" + puntosVidaMax);
        System.out.println("Ataque: " + puntosAtaque);
        System.out.println("Defensa: " + puntosDefensa);
        System.out.println("Nivel: " + nivel);
    
    }
    
    public static int getTotalPersonajesCreados(){
    
        return totalPersonajesCreados;
        
    }
}



