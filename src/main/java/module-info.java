module ca.georgiancollege.comp1011m2022test {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;


    opens ca.georgiancollege.comp1011m2022test1 to javafx.fxml;
    exports ca.georgiancollege.comp1011m2022test1;
}