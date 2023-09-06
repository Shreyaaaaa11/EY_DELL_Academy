package com.programming;
import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

 

public class CharacterData {

 

    public static void main(String[] args) {

        try {

            File f = new File("C:/file/Abc.txt");

            System.out.println(f.exists());

            FileWriter fw = new FileWriter(f);

            BufferedWriter bw = new BufferedWriter(fw);

 

            BufferedWriter bw2 = new BufferedWriter(new FileWriter(new File("C:/file/Abc.txt")));

            bw.write("ABCD");

            bw.newLine();

            bw.write("Shreya Pandey");

            bw.newLine();

            bw.write(97);

            bw.flush();

            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(new File("C:/file/Abc.txt")));

            String str;

            while ((str = br.readLine()) != null) {

                System.out.println(str);

 

            }

            br.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    // TODO Auto-generated method stub

 

}