module com.todo {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.todo to javafx.fxml;

    exports com.todo;
}
