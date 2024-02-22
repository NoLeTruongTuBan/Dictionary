/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Bravo
 */
public class DictionaryRes {
    private  DataAccess choice = DataAccess.instance();

  
    public void addNewWord() {
        choice.addNewWord();
    }

    public void deleteWord() {
        choice.deleteWord();
    }

    public void translate() {
        choice.translate();
    }
    
}
