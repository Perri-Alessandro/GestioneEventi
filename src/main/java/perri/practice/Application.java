package perri.practice;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import perri.practice.dao.EventoDAO;
import perri.practice.entities.Evento;
import perri.practice.exceptions.NotFoundException;

import java.util.Scanner;

public class Application {

    private static final EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("U4w3D2");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EntityManager em = emFactory.createEntityManager();
        EventoDAO eventoDao = new EventoDAO(em);
//
//        Evento test = new Evento("stadio"
//                , LocalDate.of(2024, 7, 18)
//                , "ffknknknnkn", 10, EventoType.PRIVATO);

        System.out.println("Hello World!");

//        eventoDao.save(test);

        Evento trova = null;
        try {
            trova = eventoDao.getById(11);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(trova.getTitolo());
        }

        em.close();
        emFactory.close();
        sc.close();
    }
}
