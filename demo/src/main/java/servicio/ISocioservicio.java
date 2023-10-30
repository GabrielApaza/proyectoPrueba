package servicio;
import com.example.demo.Entity.Socio;
import java.util.List;
public interface ISocioservicio {
    public default List<Socio> ListarTotaldeSocios() {
        return null;
    }

}
