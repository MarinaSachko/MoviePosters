public class FilmManager {
    private FilmManager[] films = new FilmManager[0];
    private String FilmName;


    public FilmManager(String FilmName) {

        this.FilmName = FilmName;

    }

    public FilmManager() {

    }

    public void save(FilmManager film) {
        FilmManager[] tmp = new FilmManager[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmManager[] findAll() {
        return films;
    }


    public FilmManager[] findLast() {
        FilmManager[] result = new FilmManager[5];
        for (int i = 0; i <= 4; i++) {
            result[i] = films[films.length - i - 1];
            //System.out.println(films[films.length-i-1].FilmName);
        }
        return result;
    }


    public FilmManager[] findLastLimit(int Count) {
        if (Count > films.length) {
            Count = films.length;
        }
        FilmManager[] result1 = new FilmManager[Count];
        for (int i = 0; i < Count; i++) {
            result1[i] = films[films.length - i - 1];
        }
        return result1;

    }
}
