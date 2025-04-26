public class Main {
    public static void main(String[] args) {
        String movieName = "Matrix";

        System.out.println("Welcome to ScreenMatch");
        System.out.println("Movie: " + movieName); // Strings can be concatenated by + operator

        int fechaDeLanzamieto = 1999;
        boolean includedInPlan = true;
        double movieRating = 8.2;

        double averageViewersRating = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(averageViewersRating);

        String synopsis = """
                Matrix is a paradox.
                The best movie of the century
                It was released on: 
                """ + fechaDeLanzamieto; // Textblock example
        System.out.println(synopsis);  /* This is a block comment
                                          it can be done in several lines
                                          this is how it's closed: */
                                       // End of comments block

        int movieClassification = (int) averageViewersRating / 2;    // Explicit casting data types
        System.out.println(movieClassification);

        if (movieName.equals("Matrix")) {    // Strings can be compared by using "equals" method
            // Texts or String can be formated, using printf, .formatted(...) method or String.format(...)
            System.out.printf("You have selected %s successfully%n", movieName);  // Automatically apply movieName in text
            System.out.println("It wasreleased on %d".formatted(fechaDeLanzamieto));
            System.out.println(String.format("Its rating is: %.1f", movieRating));
        } else {
            System.out.println("Please select any film");
        }
    }
}