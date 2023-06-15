public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager() {

        this.limit = 3;
    }

    public FilmManager(int limit) {

        this.limit = limit;

    }


    public void save(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        if (film != "") {
            tmp[tmp.length - 1] = film;
        }
        this.films = tmp;
    }

    public String[] findAll() {
        return films;
    }


    public String[] findLast() {
        int resultLength;

        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }

        String[] result = new String[resultLength];
        for (int i = 0; i <= resultLength - 1; i++) {

            result[i] = films[films.length - i - 1];

        }
        return result;
    }


}
