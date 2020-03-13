package com.practise.test.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExistsTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        //Path sourceFilePath = Paths.get("/var/lib/jenkins/jobs/SMS_Send_Tool/workspace/sms_messages_file.csv");
        Path sourceFilePath = Paths.get("/Users/sarat.polavarap/Desktop/Sarath/Oportun/BAT-554/SMS-Messages-File-Test.csv");
        LinkOption[] linkOptions = new LinkOption[1];
        linkOptions[0] = LinkOption.NOFOLLOW_LINKS;
        if(!Files.exists(sourceFilePath, LinkOption.NOFOLLOW_LINKS)){
            System.out.println("Oops! upload file does not exist");
            return;
        }
        else {
            System.out.println(sourceFilePath);
        }
        try {
            BufferedReader br = Files.newBufferedReader(sourceFilePath);
            String st = "";
            while((st = br.readLine()) != null) {
                System.out.println(st);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }

}


