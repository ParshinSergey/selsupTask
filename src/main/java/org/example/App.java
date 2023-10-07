package org.example;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

public class App
{
    public static void main( String[] args ) throws InterruptedException {

        CrptApi crptApi = new CrptApi(TimeUnit.SECONDS, 4);
        for (int i = 0; i < 9; i++){
            var document = new CrptApi.Document();
            document.setProduction_date(LocalDate.now());
            document.setDoc_id("12345");
            System.out.println(crptApi.createDocument(document, "token"));
            Thread.sleep(600);
        }
    }
}
