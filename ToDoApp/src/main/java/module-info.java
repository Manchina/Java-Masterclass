module com.example.todoapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.manchina.todolist to javafx.fxml;
    exports com.manchina.todolist;
}