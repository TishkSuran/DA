package Home_Pages;

import Home_Pages.Login_System;

public class Main_Screen {
    public Main_Screen() {
        System.out.println("╔═════════════════════════════════╗");
        System.out.println("║  Welcome to the All-in-One Hub  ║");
        System.out.println("╚═════════════════════════════════╝");

        Login_System loginSystem = new Login_System();
        loginSystem.run();
    }
}
