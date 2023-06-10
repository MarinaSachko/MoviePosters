import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmMenegerTest {
    FilmManager film1 = new FilmManager("Бладшот");
    FilmManager film2 = new FilmManager("Вперед");
    FilmManager film3 = new FilmManager("ОтельБелград");
    FilmManager film4 = new FilmManager("Джентельмены");
    FilmManager film5 = new FilmManager("Человек-невидимка");
    FilmManager film6 = new FilmManager("Тролли");
    FilmManager film7 = new FilmManager("Номер один");


    @Test
    public void test() {
        FilmManager repo = new FilmManager();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.save(film4);
        repo.save(film5);
        repo.save(film6);
        repo.save(film7);

        FilmManager[] expected = {film1, film2, film3, film4, film5, film6, film7};
        FilmManager[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

        FilmManager[] expected1 = {film7, film6, film5, film4, film3};
        FilmManager[] actual1 = repo.findLast();
        Assertions.assertArrayEquals(expected1, actual1);

        FilmManager[] expected2 = {film7, film6, film5};
        FilmManager[] actual2 = repo.findLastLimit(3);
        Assertions.assertArrayEquals(expected2, actual2);

        FilmManager[] expected3 = {film7, film6, film5, film4, film3, film2, film1};
        FilmManager[] actual3 = repo.findLastLimit(13);
        Assertions.assertArrayEquals(expected3, actual3);

    }

}
