package pl.sda;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 1. Dodaj enum kategoryzujacy ksiazki, nazwij go BookGenre, powinien miec 3 wartosci opisujace nastepujace typy ksiazek:
              * dla dzieci
              * fantasy
              * techniczne
              Pamiętaj, że nazwy wartości w enumie powinny być napisane dużymi literami i po angielsku
           2. Dodaj do Book pole typu BookGenre, nazwij je genre. Dodaj argument do konstruktora i dodaj gettery, settery jesli potrzebujesz.
           3. Zauważ, że w klasie Main podkreśla teraz miejsca w których tworzone są nowe książki, gdyż nie przekazujesz tam ich gatunku, napraw to:)
           4. Dodaj do klasy Book implementację toString(), która będzie zwracała tekst w postaci: autor tytul gatunek
           5. Dodaj implementacje punktu 3 - Wyswietl wszystkie ksiazki - ma wyświetlać wszystkie książki :)
           6. Gatunek książek jest wyświetlany dosyć brzydko (np. FANTASY zamiast fantasy), naprawmy to:
             * dodaj do BookGenre pole typu String w którym będziemy przechowywali informację o tym jak powinien zostać wyświetlony tytuł książki
             * dodaj konstruktor, który będzie przypisywał wartość argumentu do przed chwilą utworzonego pola
             * dodaj implementację toString(), która będzie zwracała wartość displayName - a więc np. dla wartości FOR_CHILDREN toString powinno zwrócić Dla dzieci
           7. Sprawdź czy książki są już "ładnie wyświetlane"
           8. Dodaj implementację 5 - powinno to skutkować wyświetleniem wartości enuma i zawartości pola displayName, np:
              FOR_CHILDREN Dla dzieci
              FANTASY fantasy
              TECHNICAL techniczne
           9. Dodaj implementacje 2 - wyszukaj książki danego gatunku. Użytkownik powinien wprowadzić wartość enuma, np. "FOR_CHILDREN", a aplikacja
              powinna zwrócić wszystkie książki o takim gatunku.
           10. Dodaj implementacje punktu 4 - dodawanie książek, tutaj użytkownik powinien wprowadzić autora, tytuł i tym razem nie wartość
               enuma, a zawartość pola displayName, np.:
               Grey. Piecdziesiat twarzy Greya.
               E L James
               fantasy // zwróć uwagę, że to displayName, a nie wartość enuma!
           * *
*/
        List<Book> books = new LinkedList<>();
        System.out.println("Witaj w wirtualnej ksiegarni!\n"
                + "Oto co możesz zrobić:\n"
                + "1. Wyszukaj książkę po tytule\n"
                + "2. Wyszukaj książki danego gatunku\n"
                + "3. Wyświetl wszystkie książki\n"
                + "4. Dodaj nowa ksiazke\n"
                + "5. Wyświetl dostępne gatunki\n"
                + "q. Wyjscie");

        books.add(new Book("Ania z zielonego wzgorza", "Lucy Maud Montgomery"));
        books.add(new Book("Harry Potter", "J.K. Rowling"));
        books.add(new Book("Java. Kompendium programisty.", "Herbert Schildt"));
        books.add(new Book("Symfonia C++ Standard", "Jerzy Grębosz")); //to ma ponad 1000 stron

        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();
        while (!userChoice.equals("q")) {
            if (userChoice.equals("1")) {
                System.out.println("Wprowadz tytul:");
                String title = scanner.nextLine();
                for (Book book : books) {
                    if (book.getTitle().equals(title)) {
                        System.out.println("Oto Twoja książka! " + book.toString());
                        break;
                    }
                }
            } else if (userChoice.equals("2")) {
                System.out.println("Wprowadz szukany gatunek");
            } else if (userChoice.equals("3")) {
                System.out.println("Wszystkie ksiazki");
            }
            //logika do wyszukiwania ksiazek danego gatunku
        }

    }
}
