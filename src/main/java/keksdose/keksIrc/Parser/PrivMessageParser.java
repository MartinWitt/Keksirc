package keksdose.keksIrc.Parser;

import java.util.Arrays;

import keksdose.keksIrc.Message.Message;
import keksdose.keksIrc.Message.PrivMessage;
import keksdose.keksIrc.Network.SocketHandler;;

public class PrivMessageParser implements Parser {
    private SocketHandler handler;

    public PrivMessageParser(SocketHandler s) {
        this.handler = s;
    }

    @Override
    public Message parse(String input) {
        String[] result = input.split(" ", 4);
        if (result.length < 4) {
            return null;
        }
        result[3] = result[3].substring(1);
        return new PrivMessage(result[0], result[2], result[3], handler);
        // todo: aufteilen des splits und dann nachricht erstellen.
    }

}
