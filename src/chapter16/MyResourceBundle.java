package chapter16;

import org.jetbrains.annotations.NotNull;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class MyResourceBundle extends ResourceBundle {
    @Override
    protected Object handleGetObject(@NotNull String key) {
        return null;
    }

    @NotNull
    @Override
    public Enumeration<String> getKeys() {
        return null;
    }
}
