import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PutRequests {
    @Test
    public void putMemberID(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Afsana");
        requestBody.put("surname", "Yusifova");
        requestBody.put("patronymic", "Person");
        requestBody.put("pin", "HJK1254");

        Response response = RestAssured
                .given()
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3NDc5NDd9.EYnLjq8aNZn5dFepWUaYuM6gJRpX5QIRGPXVblcvm8CI9gRSgwi-LjGIrVq48rsJGLwQzUzX7EOVF3hqOPSvJw;")
                .contentType("application/json")
                .body(requestBody.toString())
                .when()
                .put("https://test-ahik-registry.aist.group/registry-api/member/9205337");

        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }
    @Test
    public void putEmployerID(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "AİSTGROUP LLC");

        Response response = RestAssured
                .given()
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3NDc5NDd9.EYnLjq8aNZn5dFepWUaYuM6gJRpX5QIRGPXVblcvm8CI9gRSgwi-LjGIrVq48rsJGLwQzUzX7EOVF3hqOPSvJw;")
                .contentType("application/json")
                .body(requestBody.toString())
                .when()
                .put("https://test-ahik-registry.aist.group/registry-api/employer/349156");

        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }
    @Test
    public void putTradeID(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "Kalibrlənmə laboratoriyaları");

        Response response = RestAssured
                .given()
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3NDc5NDd9.EYnLjq8aNZn5dFepWUaYuM6gJRpX5QIRGPXVblcvm8CI9gRSgwi-LjGIrVq48rsJGLwQzUzX7EOVF3hqOPSvJw;")
                .contentType("application/json")
                .body(requestBody.toString())
                .when()
                .put("https://test-ahik-registry.aist.group/registry-api/trade-union/117885");

        response.prettyPrint();
        System.out.println(response.getStatusCode());
    }



}
