package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyCqT8jZ_FJRnEfwOOBkVWLDZ_IEOhXOFUA";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

//        c.addRegId("APA91bGPE-2yJSM_7RKCTDsJKnBm1qIE8_esGlXq_E3A16T3-XK0Shw9XBqjgZN8OL75KOmvPaokIPFy-6XpxbEeDnwfGuPPQ8oIab7BJEe3uRuhbziZlue6XRrAGN-fwbfZcaiXmwZv");//my phone
        c.addRegId("APA91bEaaA6d32krFFL0Il9JgoPa-oKdihYXwPIXJrHwoRQW2lJvNSknzCdHKRdlA115mIVHU-vm85biD5W0Omf8syjNAxkciDNRub_XdGscltTP6mJWj7h22ViKsoPuogyr8bXxvixR");//5.0 elmu
        c.addRegId("APA91bEq8awffaGpO36ikSqGtSagtotajn85wUdPpQSQD3LXqd0RIN7j4ITRmrFcKaVgp6lJUUnDU9g5FaHaq34VqcqQwr4bnjoMULkTT7hdKxBrfxVS-WbleXU3dGhX6wo27BkZLXCM");//5.1
        c.createData("Working!!", "Test message");

        return c;
    }
}

