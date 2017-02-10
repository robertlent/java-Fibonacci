package com.lentcoding.fibonacci;

import java.awt.*;
import java.io.Console;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String OS = System.getProperty("os.name").toLowerCase();
        Console console = System.console();

        if (OS.contains("win")) {
            if (console == null && !GraphicsEnvironment.isHeadless()) {
                String filename = Main.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
                Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start", "cmd", "/k", "java -jar \"" + filename + "\""});
            } else {
                Fibonacci.main(new String[0]);
                System.out.println("\n");
            }
        } else if (OS.contains("mac")) {
            if (console == null && !GraphicsEnvironment.isHeadless()) {
                String filename = Main.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
                Runtime.getRuntime().exec(new String[] {"/usr/bin/open -a Terminal /usr/bin/java -jar ", filename});
            } else {
                Fibonacci.main(new String[0]);
                System.out.println("\n");
            }
        } else if (OS.contains("linux")) {
            if (console == null && !GraphicsEnvironment.isHeadless()) {
                String filename = "/" + Main.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
                Runtime.getRuntime().exec(new String[]{"/usr/bin/xterm", "-e", "java -jar \"" + filename + "\"" + "; bash"});
            } else {
                Fibonacci.main(new String[0]);
                System.out.println("\n");
            }
        }
    }
}