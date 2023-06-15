import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmMenegerTest {
    @Test
    public void testFilmManager() {
        FilmManager repo = new FilmManager();
        repo.save("Бладшот");
        repo.save("Вперед");
        repo.save("Отель Белград");
        repo.save("Джентельмены");


        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены"};
        String[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFilmManagerAddOne() {
        FilmManager repo1 = new FilmManager();
        repo1.save("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = repo1.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFilmManagerAddNull() {
        FilmManager repo1 = new FilmManager();
        repo1.save("");

        String[] expected = {null};
        String[] actual = repo1.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        FilmManager repo = new FilmManager(2);
        repo.save("Бладшот");
        repo.save("Вперед");
        repo.save("Отель Белград");
        repo.save("Джентельмены");

        //

        String[] expected = {"Джентельмены", "Отель Белград"};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastMoreLenght() {
        FilmManager repo = new FilmManager(5);
        repo.save("Бладшот");
        repo.save("Вперед");
        repo.save("Отель Белград");
        repo.save("Джентельмены");

        //

        String[] expected = {"Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithoutParameters() {
        FilmManager repo = new FilmManager();
        repo.save("Бладшот");
        repo.save("Вперед");
        repo.save("Отель Белград");
        repo.save("Джентельмены");

        //

        String[] expected = {"Джентельмены", "Отель Белград", "Вперед"};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastWithoutParametersLessLimit() {
        FilmManager repo = new FilmManager();

        repo.save("Отель Белград");
        repo.save("Джентельмены");

        //

        String[] expected = {"Джентельмены", "Отель Белград"};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
