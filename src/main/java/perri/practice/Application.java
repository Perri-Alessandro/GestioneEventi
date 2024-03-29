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

//        System.out.println("Hello World!");

//        eventoDao.save(test);

//        Evento trova = null;
//        try {
//            System.out.println("----------------------- INSERISCI 1 ID PER CERCARE 1 EVENTO NEL DATABASE ----------------------------");
//            int id = Integer.parseInt(sc.nextLine());
//            trova = eventoDao.getById(id);
//        } catch (NotFoundException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println(trova.getTitolo());
//        }

        Evento cancella = null;
        try {
            System.out.println("------------------------------ INSERISCI L'ID DI ELEMENTO DA ELIMINARE ----------------------------------");
            int id = Integer.parseInt(sc.nextLine());
            eventoDao.delete(id);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(cancella.getTitolo());
        }

        em.close();
        emFactory.close();
        sc.close();
    }
}
