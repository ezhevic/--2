import java.awt.*;

public class Vector
{
    double x;
    double y;
    double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
        // Длина вектора. Корень из суммы квадратов
    double length(){
        return Math.sqrt(x * x + y*y + z*z);
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        return (x*vector.x + y*vector.y + z*vector.z);
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        return new Vector(y*vector.z - z*vector.y, z*vector.x - x*vector.z, x*vector.y - y*vector.x);
    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return (scalarProduct(vector) / (length() *vector.length() ))
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        return new Vector (x + vector.x, y + vector.y, z + vector.z);
    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        return new Vector (x - vector.x, y - vector.y, z - vector.z);
    }
}

