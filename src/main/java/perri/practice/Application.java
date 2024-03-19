package perri.practice;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import perri.practice.dao.EventoDAO;
import perri.practice.entities.Evento;
import perri.practice.entities.EventoType;

import java.time.LocalDate;
import java.util.Scanner;

public class Application {

    private static final EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("U4w3D2");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EntityManager em = emFactory.createEntityManager();
        EventoDAO eventoDao = new EventoDAO(em);

        Evento test = new Evento("concerto di capodanno"
                , LocalDate.of(2024, 04, 26)
                , "concerto di fine anno in onore di Albano", 80000, EventoType.PUBBLICO);

        System.out.println("Hello World!");

        eventoDao.save(test);
        em.close();
        emFactory.close();
        sc.close();
    }
}
