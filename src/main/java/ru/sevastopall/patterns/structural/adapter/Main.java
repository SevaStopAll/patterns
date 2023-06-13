package ru.sevastopall.patterns.structural.adapter;
public class Main {
    public static void main(String[]args){
        USASocket socket = new SimpleAmericanSocket();
        Radio radio = new Radio();
        EuroSocket socket1 = new SocketAdapter(socket);
        radio.listenToMusic(socket1);
    }
}

interface EuroSocket {
    void getPower();
}

class SocketAdapter implements EuroSocket {
    USASocket socket;
    public SocketAdapter(USASocket socket) {
        this.socket = socket;
    }

    @Override
    public void getPower() {
        socket.getPower();
    }
}
interface USASocket {
    void getPower();
}

class SimpleAmericanSocket implements USASocket {
    @Override
    public void getPower() {
        System.out.println("Get 110 V");
    }
}

class Radio {
    public void listenToMusic(EuroSocket euroSocket) {
        euroSocket.getPower();
    }
}

