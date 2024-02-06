import com.shapes.Area;
import com.shapes.AreaOfShapes;

public class FactoryMain{
    public static void main(String[] args) {
        AreaOfShapes osf = new AreaOfShapes();
        Area obj = osf.getInstance("Triangle");
        obj.spec();
    }
}