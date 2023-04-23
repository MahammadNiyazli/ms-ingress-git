package az.ingress.patterns.singleton;

import az.ingress.patterns.singleton.Path;

public class Main {
    public static void main(String[] args) {
        Path path1 = Path.getInstance();
        Path path2 = Path.getInstance();
        System.err.println(path1.hashCode() == path2.hashCode());
    }
}
