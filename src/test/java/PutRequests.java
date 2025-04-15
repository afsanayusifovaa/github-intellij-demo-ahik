import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

public class PutRequests {
    @Test
    public void putObjectid(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","Apple MacBook Pro 17");
        JSONObject requestData = new JSONObject();
        requestData.put("price",2991);
        requestData.put("CPU Model","Intel core i9");
        requestData.put("Hard Disk size","1 TB");
        // requestData.put("color","silver");
        requestData.put("year",2019);

        Response response = RestAssured
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .when()
                .put("https://api.restful-api.dev/objects/ff808181932badb60195065210682b06");
        response.prettyPrint();

    }

}
