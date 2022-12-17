/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.idioma_do_sistema;

import java.util.Locale;

/**
 *
 * @author geremias
 */
public class Idioma_do_sistema {

    public static void main(String[] args) {
        Locale loc=Locale.getDefault();
        String idioma=loc.getDisplayLanguage();
        System.out.println("Seu sistema está em " + idioma);
    }
}
