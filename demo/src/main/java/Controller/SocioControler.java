package Controller;
import java.util.List;

/*import DataServices.SocioDataServices;
import com.example.demo.Entity.Socio;
import com.example.demo.Enum.Sector;
import com.example.demo.Enum.TipoSocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;**/


/*@RestController
@RequestMapping("/socio/v1")

public class SocioControler {
        @Autowired
        private SocioDataServices sds; //servicio
        @GetMapping()
        public String info(){

            return "Servicio Socio Activo";
        }**/

    /*
    @GetMapping("/sumar")
    public String sumar(@RequestParam("nro1") int nro1,@RequestParam("nro2") int nro2){
        int resultado=nro1+nro2;
        return resultado+"";
    }
    */

    /*
    Método alta:
    url: /alta
    Descripción: ..................
    Parámetros de entrada:
            Método: POST
            String cuit
            String nombreSocio
            String telefono
            String email
            String paginaWeb
            String perfilSocio
            Date   fechaAlta
            Date   fechaModificacion
            Date   fechaBaja
            String tipoSocio            CAMARA, EMPRESA
            String Sectorizacion        SECTOR1, SECTOR2, SECTOR3
            String Activo               SI,NO

    Párametro de salida: int id     Id generado por la base.
    */

       /* @PostMapping("/alta")
        public RedirectView save(
                @RequestParam("nombreSocio")           String nombreSocio,
                @RequestParam("cuit")                  String cuit,
                @RequestParam("telefono")              String telefono,
                @RequestParam("email")                 String email,
                @RequestParam("paginaWeb")             String paginaWeb,
                @RequestParam("perfilSocio")           String perfilSocio,
                @RequestParam("tipoSocio")             String tipoSocio,
                @RequestParam("Sector")                String sector

        ){
            try{
                Socio socio;
                socio = new Socio();
                socio.setNombreSocio(nombreSocio);
                socio.setCuit(cuit);
                socio.setEmail(email);
                socio.setPaginaWeb(paginaWeb);
                socio.setTipoSocio(TipoSocio.valueOf(tipoSocio));
                socio.setSector(Sector.valueOf(sector));


                sds.save(socio);

                return new RedirectView();
            }catch(Exception e){
                // return "0"; Verificar cambio sugerido por Eze. RedirectView
            }
        }

       @PostMapping(value="/baja")
        public String baja(@RequestParam("idSocio") Long idSocio) {
            try{
                sds.remove(idSocio);
                return "true";
            }catch(Exception e){
                return "false";
            }
         }

        @GetMapping(value="/all")
        public List<Socio>getAll(){

            return sds.getAll();
        }


        @GetMapping(value="/byId")
        public Socio getById(Long idSocio){

            return sds.getById(idSocio);
        }

        @GetMapping(value="/byCuit")
        public Socio getByCuit(String cuit){

            return sds.getByCuit(cuit);
        }

    }**/
