/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Comom.Validation;
import java.util.HashMap;

/**
 *
 * @author Bravo
 */
public class DataAccess {

    private HashMap<String, String> dictionary;
    private static DataAccess instance = null;

    public DataAccess() {
        this.dictionary = new HashMap<>();
    }

    public static DataAccess instance() {
        if (instance == null) {
            synchronized (DataAccess.class) {
                if (instance == null) {
                    instance = new DataAccess();
                }
            }
        }
        return instance;
    }

    public void addNewWord() {
        System.out.print("Enter English: ");
        String english = Validation.checkInputString();
        if (!checkKeywordExist(english)) {
            if (!Validation.checkInputYN()) {
                return;
            }
        }
        System.out.print("Enter Vietnamese: ");
        String vietnameseInput = Validation.checkInputString();
        dictionary.put(english, vietnameseInput);
        System.err.println("Add successful.");
    }

    public void deleteWord() {
        System.out.print("Enter English to delete: ");
        String english = Validation.checkInputString();
        dictionary.remove(english);
        System.err.println("Delete successful.");
    }

    public void translate() {
        System.out.print("Enter English to translate: ");
        String english = Validation.checkInputString();
        String vietnameseTranslation = dictionary.get(english);
        if (vietnameseTranslation != null) {
            System.out.println("Vietnamese: " + vietnameseTranslation);
        } else {
            System.err.println("Not found in the data");
        }
    }

    public boolean checkKeywordExist(String english) {
        return !dictionary.containsKey(english);
    }
}
