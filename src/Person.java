import java.util.ListResourceBundle;

public class Person extends ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][]{
                { "name", "Jeanne" }
        };

    }
}