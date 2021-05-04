import com.paye.model.PayeModel;
import com.paye.service.PayeServiceImpl;

public class PayeTestClient {

    public static final String REST_SERVICE_URI = "<a class="vglnk" href="http://localhost:8080/Spring4MVCCRUDRestService" rel="nofollow"><span>http</span><span>://</span><span>localhost</span><span>:</span><span>8080</span><span>/</span><span>Spring4MVCCRUDRestService</span></a>";

    /* GET */
    @SuppressWarnings("unchecked")
    private static void calculateTax() {
        System.out.println("Testing listAllUsers API-----------");

        RestTemplate restTemplate = new RestTemplate();

        PayeModel payeModel = restTemplate.getForObject(REST_SERVICE_URI+"/paye/1", PayeModel.class);

        PayeServiceImpl payeService=

        System.out.println(payeModel);

    }
}
