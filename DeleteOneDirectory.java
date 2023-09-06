package com.programming;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
public class DeleteOneDirectory {

    public static void main(String[] args) throws IOException {

 

        Path p = Paths.get("C:/file/abc1.txt");

        // Files.delete(p);

        // System.out.println("one directory got deleted");

 

        Path p2 = Paths.get("C:/file/abc2.txt");

        BasicFileAttributeView view = Files.getFileAttributeView(p, BasicFileAttributeView.class);

        BasicFileAttributes attr = view.readAttributes();

 

        FileTime creatinTime = attr.creationTime();

        System.out.println("creationTime was" + creatinTime);

 

        FileTime lastAccessedTime = attr.lastAccessTime();

 

        System.out.println("last Time of my files was " + lastAccessedTime);

 

        FileTime modifiedTime = attr.lastModifiedTime();

 

        System.out.println("modify Time of my files was " + modifiedTime);

    }

 

}

 
