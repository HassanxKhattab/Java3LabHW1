/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.io.IOException;

/**
 *
 * @author Hassan
 */
public class ViewManager {

    public static LoginPage logPage;
    public static ConversionPage conPage;

    private ViewManager() {
    }

    public static void openLoginPage() {
        if (logPage == null) {
            logPage = new LoginPage();
            logPage.show();
        } else {
            logPage.show();
        }

    }

    public static void closeLoginPage() {
        if (logPage != null) {
            logPage.close();
        }
    }

    public static void openConvertionPage() throws IOException {
        if (conPage == null) {
            conPage = new ConversionPage();
            conPage.show();
        } else {
            conPage.show();
        }

    }

    public static void closeConvertionPage() {
        if (conPage != null) {
            conPage.close();
        }
    }
}
