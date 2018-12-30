package keksdose.keksIrc;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;

import keksdose.keksIrc.Message.Message;

public class Main {

    public static void main(String[] args) {
        ArrayBlockingQueue<Message> list = new ArrayBlockingQueue<>(100);
        var start = new IRCStart(list);
        start.useCapHandler(true);
        start.setNickname("FWKIB|Test");
        try {
            start.start();
        } catch (IOException e) {
            // TODO Auto-generated catch block

            e.printStackTrace();
        }
        System.out.println("fertig");
    }

}
