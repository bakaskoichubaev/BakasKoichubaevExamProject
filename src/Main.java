import enums.Gender;
import enums.Genre;
import enums.Language;
import model.Book;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book = new Book(1,"Shine", Genre.DETECTIVE,new BigDecimal(1200),"Alimov", Language.ENGLISH, LocalDate.of(2020,12,6));
        Book book1 = new Book(2,"Almaznyi", Genre.FANTASY,new BigDecimal(1200),"Asanov", Language.KYRGYZ, LocalDate.of(2011,2,4));
        Book book2= new Book(3,"Bumer", Genre.ROMANCE,new BigDecimal(1200),"Kurmanov", Language.ENGLISH, LocalDate.of(2009,5,15));
        Book book3 = new Book(4,"Rembo", Genre.HISTORICAL,new BigDecimal(1200),"Ruslanov", Language.RUSSIAN, LocalDate.of(2008,11,17));
        Book book4 = new Book(5,"Voina", Genre.DETECTIVE,new BigDecimal(1200),"Davlatov", Language.ENGLISH, LocalDate.of(2005,2,23));
        Book book5 = new Book(6,"Titanic", Genre.ROMANCE,new BigDecimal(1200),"Gogol", Language.KYRGYZ, LocalDate.of(2011,3,30));
        Book book6 = new Book(7,"Britanic", Genre.FANTASY,new BigDecimal(1200),"Pushkin", Language.ENGLISH, LocalDate.of(2013,8,19));
        Book book7 = new Book(8,"Atlantic", Genre.HISTORICAL,new BigDecimal(1200),"Lermontov", Language.RUSSIAN, LocalDate.of(2019,9,13));
        Book book8 = new Book(9,"Guns", Genre.FANTASY,new BigDecimal(1200),"Aitmatov", Language.ENGLISH, LocalDate.of(2021,7,4));
        Book book9 = new Book(10,"Shmans", Genre.ROMANCE,new BigDecimal(1200),"Peshkov", Language.KYRGYZ, LocalDate.of(2000,1,9));



        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.


        

    }
}