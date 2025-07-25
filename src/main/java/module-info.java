module br.com.udemyjava.gestao.notavel.mvp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens br.com.udemyjava.gestao.notavel.mvp to javafx.fxml;
    exports br.com.udemyjava.gestao.notavel.mvp;
    requires jakarta.persistence;
}
