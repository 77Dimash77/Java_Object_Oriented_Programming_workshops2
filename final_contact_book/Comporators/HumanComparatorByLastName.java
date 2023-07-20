package ru.gb.FINAL.final_contact_book.Comporators;

import ru.gb.FINAL.final_contact_book.M.Model.Contact;

import java.util.Comparator;

public class HumanComparatorByLastName<T extends Contact> implements Comparator<T> {
    @Override
    public int compare(T c1, T c2) {
        return c1.getLastName().compareTo(c2.getLastName());
    }
}