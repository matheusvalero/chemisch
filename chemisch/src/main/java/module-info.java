module br.com.chemi.chemisch {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens br.com.chemi.chemisch to javafx.fxml;
    exports br.com.chemi.chemisch;
}