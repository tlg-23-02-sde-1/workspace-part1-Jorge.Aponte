/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.poetry.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class PoemClient {

    /**
     * To run one method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
        // readPoem();
        writePoem();
    }

    /**
     * TASK: read all the lines in file 'famous-poem.txt' and print them.
     *
     * Avoid the temptation to open the file in the IDE first.
     * You'll see the poem once you get your code working(!)
     *
     * This file is in the module's root directory, which is the current / working
     * directory at runtime.  Therefore, the path to the file is just the filename.
     *
     * Use a BufferedReader wrapped around a FileReader.
     * The try-with-resources below allows you to initialize the stream and auto-close it.
     */
    private static void readPoem() {
        try {
            String poem = Files.readString(Path.of("famous-poem.txt"));
            System.out.println(poem);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        try (BufferedReader reader = new BufferedReader(new FileReader("famous-poem.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    /**
     * TASK: write a Haiku to file 'haiku.txt'.
     *
     * A Haiku is a 3-line poem with the following characteristics:
     * 1st line is 5 syllables "How are you doing?
     * 2nd line is 7 syllables "I am doing great, and you?
     * 3rd line is 5 syllables ""
     *
     * Use a PrintWriter wrapped around a FileWriter.
     * Use a try-with-resources to initialize the stream and auto-close it.
     */
    private static void writePoem() {
        String haiku = "How are you doing \n" +
                "I am doing great, and you? \n" +
                "Thanks for asking me.";

        try {
            Files.writeString(Path.of("haiku.txt"), haiku);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        try (PrintWriter out = new PrintWriter(new BufferedWriter((new FileWriter("haiku.txt"))))) {
            out.println("How are you doing?");
            out.println("I am doing great, and you?");
            out.println("Thanks for asking me.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
}