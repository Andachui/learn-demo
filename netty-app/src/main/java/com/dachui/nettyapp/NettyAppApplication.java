package com.dachui.nettyapp;

import com.dachui.nettyapp.danmu.WebsocketDanmuServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NettyAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NettyAppApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        int port;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        } else {
            port = 8080;
        }
        new WebsocketDanmuServer(port).run();
    }

}
