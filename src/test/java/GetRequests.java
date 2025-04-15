import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class GetRequests {
    @Test
    public void getObjectIDs() {
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3NDc5NDd9.EYnLjq8aNZn5dFepWUaYuM6gJRpX5QIRGPXVblcvm8CI9gRSgwi-LjGIrVq48rsJGLwQzUzX7EOVF3hqOPSvJw; refreshToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3MTU1NDd9.spMagtPzLPbetCNcSOb7KZMHS7LGL--HnMyDDWCWkBWL5DIaALQyqynYJmVXF6wDomOHACL9cXEao3u1BIDxbg")
                .header("Expires", "0")
                .header("Host", "test-ahik-registry.aist.group")
                .header("Pragma", "no-cache")
                .header("Referer", "https://test-ahik-registry.aist.group/trade-union-registery")
                .header("Sec-CH-UA", "\"Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134\"")
                .header("Sec-CH-UA-Mobile", "?0")
                .header("Sec-CH-UA-Platform", "\"Windows\"")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36")
                .when()
                .get("https://test-ahik-registry.aist.group/registry-api/trade-union?page=0&size=10&sort=regDate,desc");

        response
                .then()
                .log().all()
                .statusCode(200);

        String responseBody = response.getBody().asPrettyString();

    }

    @Test
    public void getSingleObject() {
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3NDc5NDd9.EYnLjq8aNZn5dFepWUaYuM6gJRpX5QIRGPXVblcvm8CI9gRSgwi-LjGIrVq48rsJGLwQzUzX7EOVF3hqOPSvJw;")
                .header("Expires", "0")
                .header("Host", "test-ahik-registry.aist.group")
                .header("Pragma", "no-cache")
                .header("Referer", "https://test-ahik-registry.aist.group/trade-union-registery")
                .header("Sec-CH-UA", "\"Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134\"")
                .header("Sec-CH-UA-Mobile", "?0")
                .header("Sec-CH-UA-Platform", "\"Windows\"")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36")
                .when()
                .get("https://test-ahik-registry.aist.group/registry-api/trade-union/117867");

        response
                .then()
                .log().all()
                .statusCode(200);

        String responseBody = response.getBody().asPrettyString();

    }

    @Test
    public void getEmployerObjects() {
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3NDc5NDd9.EYnLjq8aNZn5dFepWUaYuM6gJRpX5QIRGPXVblcvm8CI9gRSgwi-LjGIrVq48rsJGLwQzUzX7EOVF3hqOPSvJw;")  // Cookie başlığı
                .header("Expires", "0")
                .header("Referer", "https://test-ahik-registry.aist.group/employer-registery")
                .header("Sec-CH-UA", "\"Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134\"")
                .header("Sec-CH-UA-Mobile", "?0")
                .header("Sec-CH-UA-Platform", "\"Windows\"")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36")  // User-Agent başlığı
                .when()
                .get("https://test-ahik-registry.aist.group/registry-api/employer?page=0&size=10&sort=regDate,desc");

        response
                .then().
                log().all()
                .statusCode(200);
        String responseBody = response.getBody().asPrettyString();

    }

    @Test
    public void getSingleEmployer() {
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3NDc5NDd9.EYnLjq8aNZn5dFepWUaYuM6gJRpX5QIRGPXVblcvm8CI9gRSgwi-LjGIrVq48rsJGLwQzUzX7EOVF3hqOPSvJw;")
                .header("Expires", "0")
                .header("Host", "test-ahik-registry.aist.group")
                .header("Pragma", "no-cache")
                .header("Referer", "https://test-ahik-registry.aist.group/trade-union-registery")
                .header("Sec-CH-UA", "\"Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134\"")
                .header("Sec-CH-UA-Mobile", "?0")
                .header("Sec-CH-UA-Platform", "\"Windows\"")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36")
                .when()
                .get("https://test-ahik-registry.aist.group/registry-api/employer/349155");

        response
                .then()
                .log().all()
                .statusCode(200);

        String responseBody = response.getBody().asPrettyString();

    }

    @Test
    public void getMemberObjects() {
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3NDc5NDd9.EYnLjq8aNZn5dFepWUaYuM6gJRpX5QIRGPXVblcvm8CI9gRSgwi-LjGIrVq48rsJGLwQzUzX7EOVF3hqOPSvJw;")
                .header("Expires", "0")
                .header("Host", "test-ahik-registry.aist.group")
                .header("Pragma", "no-cache")
                .header("Referer", "https://test-ahik-registry.aist.group/trade-union-registery")
                .header("Sec-CH-UA", "\"Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134\"")
                .header("Sec-CH-UA-Mobile", "?0")
                .header("Sec-CH-UA-Platform", "\"Windows\"")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36")
                .when()
                .get("https://test-ahik-registry.aist.group/registry-api/member?page=0&size=10&sort=regDate,desc");

        response
                .then()
                .log().all()
                .statusCode(200);

        String responseBody = response.getBody().asPrettyString();
    }
    @Test
    public void getTradeID(){
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3NDc5NDd9.EYnLjq8aNZn5dFepWUaYuM6gJRpX5QIRGPXVblcvm8CI9gRSgwi-LjGIrVq48rsJGLwQzUzX7EOVF3hqOPSvJw;")
                .header("Expires", "0")
                .header("Host", "test-ahik-registry.aist.group")
                .header("Pragma", "no-cache")
                .header("Referer", "https://test-ahik-registry.aist.group/trade-union-registery")
                .header("Sec-CH-UA", "\"Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134\"")
                .header("Sec-CH-UA-Mobile", "?0")
                .header("Sec-CH-UA-Platform", "\"Windows\"")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36")
                .when()
                .get("https://test-ahik-registry.aist.group/registry-api/trade-union/117884");

        response
                .then()
                .log().all()
                .statusCode(200);

        String responseBody = response.getBody().asPrettyString();

    }

    @Test
    public void getEmployerID(){
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3NDc5NDd9.EYnLjq8aNZn5dFepWUaYuM6gJRpX5QIRGPXVblcvm8CI9gRSgwi-LjGIrVq48rsJGLwQzUzX7EOVF3hqOPSvJw;")
                .header("Expires", "0")
                .header("Host", "test-ahik-registry.aist.group")
                .header("Pragma", "no-cache")
                .header("Referer", "https://test-ahik-registry.aist.group/trade-union-registery")
                .header("Sec-CH-UA", "\"Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134\"")
                .header("Sec-CH-UA-Mobile", "?0")
                .header("Sec-CH-UA-Platform", "\"Windows\"")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36")
                .when()
                .get("https://test-ahik-registry.aist.group/registry-api/employer/349156");

        response
                .then()
                .log().all()
                .statusCode(200);

        String responseBody = response.getBody().asPrettyString();

    }
    @Test
    public void getMemberID(){
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3NDc5NDd9.EYnLjq8aNZn5dFepWUaYuM6gJRpX5QIRGPXVblcvm8CI9gRSgwi-LjGIrVq48rsJGLwQzUzX7EOVF3hqOPSvJw;")
                .header("Expires", "0")
                .header("Host", "test-ahik-registry.aist.group")
                .header("Pragma", "no-cache")
                .header("Referer", "https://test-ahik-registry.aist.group/trade-union-registery")
                .header("Sec-CH-UA", "\"Chromium\";v=\"134\", \"Not:A-Brand\";v=\"24\", \"Google Chrome\";v=\"134\"")
                .header("Sec-CH-UA-Mobile", "?0")
                .header("Sec-CH-UA-Platform", "\"Windows\"")
                .header("Sec-Fetch-Dest", "empty")
                .header("Sec-Fetch-Mode", "cors")
                .header("Sec-Fetch-Site", "same-origin")
                .header("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36")
                .when()
                .get("https://test-ahik-registry.aist.group/registry-api/member/9205337");

        response
                .then()
                .log().all()
                .statusCode(200);

        String responseBody = response.getBody().asPrettyString();

    }



}


