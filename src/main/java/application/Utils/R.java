package application.Utils;

import java.awt.*;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

public class R {

    public static InputStream getImage(String name) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream("images/" + name);
    }

    public static InputStream getProperties(String name) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration/" + name);
    }

    public static URL getUI(String name) {
        return Thread.currentThread().getContextClassLoader().getResource("ui/" + name);
    }

    // He creado un metodo igualito que el de getUI para coger el recurso de hibernate.cfg
    public static URL getCfg(String name) {
        return Thread.currentThread().getContextClassLoader().getResource("configuration/" + name);
    }
}
