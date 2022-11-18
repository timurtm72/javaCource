package homework_lesson_5;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {
    private static int AR_NUM = 30;
    private Contact[] contacts = new Contact[AR_NUM];

    public void addContact(Contact contact) {
        boolean isAddDone = false;
        for (int i = 0; i < AR_NUM; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                isAddDone = true;
                break;
            }
        }
        if(!isAddDone){
            System.out.println("Нет места, список заполнен...");
        }
    }

    public Contact seachContact(Contact contact) {
        boolean isSeachDone = false;
        for (int i = 0; i < AR_NUM; i++) {
            if (contacts[i] != null) {
                if (contacts[i].equals(contact)) {
                    isSeachDone = true;
                    System.out.println("Контакт найден в ячейке " + i + " " + contact.toString());
                    return contact;
                }
            }
        }
        if(!isSeachDone){
            System.out.println("Контакт не найден "  + contact.toString());
        }
        return contact;
    }
    public void renameContact(String originalName, String newName){
        boolean isRenameDone = false;
        for (int i = 0; i < AR_NUM; i++) {
            if (contacts[i] != null) {
                if (contacts[i].getName().equals(originalName)) {
                    contacts[i].setName(newName);
                    isRenameDone = true;
                    break;
                }
            }
        }
        if(!isRenameDone){
            System.out.println("Такого имени не найдено...");
        }
    }
    public void deleteContact(Contact contact) {
        boolean isDeleteDone = false;
        for (int i = 0; i < AR_NUM; i++) {
            if (contacts[i] != null) {
                if (contacts[i].equals(contact)) {
                    System.out.println("Контакт найден в ячейке " + i + " и удален" + contact.toString());
                    contacts[i] = null;
                    isDeleteDone = true;
                }
            }
        }
        if(!isDeleteDone){
            System.out.println("Контакт не найден..." + contact.toString());
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < AR_NUM; i++) {
            if (contacts[i] == null) {
                continue;
            }
            result += contacts[i].toString();
        }
        if (result == "") {
            result = "Список контактов пуст...";
        }
        return result;
    }
}
