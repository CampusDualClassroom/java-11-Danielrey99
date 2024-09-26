package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        //Encender la TV
        redRemote.turnOn();
        System.out.println(redRemote.on);
        //Subir un canal
        redRemote.channelUp();
        System.out.println(redRemote.channel);
        //Bajar un canal
        redRemote.channelDown();
        System.out.println(redRemote.channel);
        //Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
        redRemote.channel = 0;
        redRemote.channelDown();
        System.out.println(redRemote.channel);
        //Subir el volumen
        redRemote.volumeUp();
        System.out.println(redRemote.volume);
        //Bajar el volumen
        redRemote.volumeDown();
        System.out.println(redRemote.volume);
        //Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
        redRemote.volume = 0;
        redRemote.volumeDown();
        System.out.println(redRemote.volume);
        //Obtener el color del mando a distancia y mostrarlo por pantalla
        System.out.println(redRemote.getColor());
        //Apagar la TV
        redRemote.turnOff();
        System.out.println(redRemote.on);

    }

}