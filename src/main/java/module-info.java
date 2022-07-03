module ca.georgiancollege.comp1011m2022test {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.comp1011m2022test1 to javafx.fxml;
    exports ca.georgiancollege.comp1011m2022test1;
}