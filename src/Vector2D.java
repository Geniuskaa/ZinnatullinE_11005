public class Vector2D {
    double x, y;

    public void add(Vector2D vector) {
        x += vector.x;
        y += vector.y;
    }

    public void sub(Vector2D vector) {
        x -= vector.x;
        y -= vector.y;
    }

    public void mult(double t) {
        x *= t;
        y *= t;
    }


}
