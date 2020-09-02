package com.example.Daddyji;

import com.example.Daddyji.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DaddyjiApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(DaddyjiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       String [] s= {"Dheeraj","Vivek","MummyJi","Daddy Ji","Belgaun"};
        System.out.println(Arrays.toString(s));

        Arrays.sort(s);

        System.out.println(Arrays.toString(s));
        int[][] d={{1,2,3,3,3},{4,5,4,4,4}};
        System.out.println(d[0][2]);
        System.out.println(d[1][4]);
        System.out.println(Arrays.deepToString(d));

    }
}
