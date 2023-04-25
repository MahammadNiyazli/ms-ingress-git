package az.ingress.patterns.singleton;

public final class Path {
    private static Path instance;

    private Path() {
    }

    public static Path getInstance() {
        if (instance == null) instance = new Path();
        return instance;
    }
}
