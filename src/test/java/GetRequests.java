import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.restassured.response.Response;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class GetRequests {
    private static ExtentReports extent;
    private static ExtentTest test;


    @BeforeAll
    public static void setup() throws IOException {
        extent = ExtentManager.getInstance();
    }
    @Test
    public void getTradeObjects() {
        test = extent.createTest("getTradeObjects");

        Response response =
                given()

                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0ODAwMDg2LCJleHAiOjE3NDQ4MzYwODZ9.z_yffQ0RC23JxNrVwf-npNctmvFq7GZFgXbwsdmITM6tJvMNeyB3kpxdbtfM1nViB9A_g1gHjRBd8oxD0SZO-g; refreshToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0NzExOTQ3LCJleHAiOjE3NDQ3MTU1NDd9.spMagtPzLPbetCNcSOb7KZMHS7LGL--HnMyDDWCWkBWL5DIaALQyqynYJmVXF6wDomOHACL9cXEao3u1BIDxbg")
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
        test.log(Status.INFO, "Request sent: GET: //https://test-ahik-registry.aist.group/registry-api/trade-union?page=0&size=10&sort=regDate,desc");
        test.log(Status.PASS, "Response recevied: Status Code  " + response.statusCode());
        String collapsibleHTML = "<details><summary> Click to expand responseBody </summary><pre>" + responseBody + "</pre></details>";
        test.log(Status.PASS, "Response status code is"    + response.getStatusCode()   +  "and body:" + collapsibleHTML);

    }

    @Test
    public void getTradeObjectID()
    {
        test = extent.createTest("getTradeObjectID");
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0ODAwMDg2LCJleHAiOjE3NDQ4MzYwODZ9.z_yffQ0RC23JxNrVwf-npNctmvFq7GZFgXbwsdmITM6tJvMNeyB3kpxdbtfM1nViB9A_g1gHjRBd8oxD0SZO-g;")
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
        test.log(Status.INFO, "Request sent: GET: //https://test-ahik-registry.aist.group/registry-api/trade-union/117867");
        test.log(Status.PASS, "Response recevied: Status Code  " + response.statusCode());
        String collapsibleHTML = "<details><summary> Click to expand responseBody </summary><pre>" + responseBody + "</pre></details>";
        test.log(Status.PASS, "Response status code is"    + response.getStatusCode()   +  "and body:" + collapsibleHTML);

    }

    @Test
    public void getEmployerObjects() {
        test = extent.createTest("getEmployerObjects");
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0ODAwMDg2LCJleHAiOjE3NDQ4MzYwODZ9.z_yffQ0RC23JxNrVwf-npNctmvFq7GZFgXbwsdmITM6tJvMNeyB3kpxdbtfM1nViB9A_g1gHjRBd8oxD0SZO-g;")  // Cookie başlığı
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
        test.log(Status.INFO, "Request sent: GET: //https://test-ahik-registry.aist.group/registry-api/employer?page=0&size=10&sort=regDate,desc");
        test.log(Status.PASS, "Response recevied: Status Code  " + response.statusCode());
        String collapsibleHTML = "<details><summary> Click to expand responseBody </summary><pre>" + responseBody + "</pre></details>";
        test.log(Status.PASS, "Response status code is"    + response.getStatusCode()   +  "and body:" + collapsibleHTML);

    }

    @Test
    public void getEmployerObjectID() {
        test = extent.createTest("getEmployerObjectID");
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0ODAwMDg2LCJleHAiOjE3NDQ4MzYwODZ9.z_yffQ0RC23JxNrVwf-npNctmvFq7GZFgXbwsdmITM6tJvMNeyB3kpxdbtfM1nViB9A_g1gHjRBd8oxD0SZO-g;")
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
        test.log(Status.INFO, "Request sent: GET: //https://test-ahik-registry.aist.group/registry-api/employer/349155");
        test.log(Status.PASS, "Response recevied: Status Code  " + response.statusCode());
        String collapsibleHTML = "<details><summary> Click to expand responseBody </summary><pre>" + responseBody + "</pre></details>";
        test.log(Status.PASS, "Response status code is"    + response.getStatusCode()   +  "and body:" + collapsibleHTML);

    }

    @Test
    public void getMemberObjects() {
        test = extent.createTest("getMemberObjects");
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0ODAwMDg2LCJleHAiOjE3NDQ4MzYwODZ9.z_yffQ0RC23JxNrVwf-npNctmvFq7GZFgXbwsdmITM6tJvMNeyB3kpxdbtfM1nViB9A_g1gHjRBd8oxD0SZO-g;")
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
        test.log(Status.INFO, "Request sent: GET: //https://test-ahik-registry.aist.group/registry-api/member?page=0&size=10&sort=regDate,desc");
        test.log(Status.PASS, "Response recevied: Status Code  " + response.statusCode());
        String collapsibleHTML = "<details><summary> Click to expand responseBody </summary><pre>" + responseBody + "</pre></details>";
        test.log(Status.PASS, "Response status code is"    + response.getStatusCode()   +  "and body:" + collapsibleHTML);
    }
    @Test
    public void getTradeID(){
        test = extent.createTest("getObjectIDs");
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0ODAwMDg2LCJleHAiOjE3NDQ4MzYwODZ9.z_yffQ0RC23JxNrVwf-npNctmvFq7GZFgXbwsdmITM6tJvMNeyB3kpxdbtfM1nViB9A_g1gHjRBd8oxD0SZO-g;")
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
        test.log(Status.INFO, "Request sent: GET: //https://test-ahik-registry.aist.group/registry-api/trade-union?page=0&size=10&sort=regDate,desc");
        test.log(Status.PASS, "Response recevied: Status Code  " + response.statusCode());
        String collapsibleHTML = "<details><summary> Click to expand responseBody </summary><pre>" + responseBody + "</pre></details>";
        test.log(Status.PASS, "Response status code is"    + response.getStatusCode()   +  "and body:" + collapsibleHTML);

    }

    @Test
    public void getEmployerID(){
        test = extent.createTest("getObjectIDs");
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0ODAwMDg2LCJleHAiOjE3NDQ4MzYwODZ9.z_yffQ0RC23JxNrVwf-npNctmvFq7GZFgXbwsdmITM6tJvMNeyB3kpxdbtfM1nViB9A_g1gHjRBd8oxD0SZO-g;")
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
        test.log(Status.INFO, "Request sent: GET: //https://test-ahik-registry.aist.group/registry-api/trade-union?page=0&size=10&sort=regDate,desc");
        test.log(Status.PASS, "Response recevied: Status Code  " + response.statusCode());
        String collapsibleHTML = "<details><summary> Click to expand responseBody </summary><pre>" + responseBody + "</pre></details>";
        test.log(Status.PASS, "Response status code is"    + response.getStatusCode()   +  "and body:" + collapsibleHTML);
    }
    @Test
    public void getMemberID(){
        test = extent.createTest("getObjectIDs");
        Response response = given()
                .header("Accept", "application/json, text/plain, */*")
                .header("Accept-Encoding", "gzip, deflate, br, zstd")
                .header("Accept-Language", "tr-TR,tr;q=0.9,ru;q=0.8,az;q=0.7,en;q=0.6")
                .header("Cache-Control", "no-cache, no-store, must-revalidate")
                .header("Connection", "keep-alive")
                .header("Cookie", "_ga_RT0H1D1EP9=GS1.1.1735133735.1.0.1735133735.0.0.0; _ym_uid=1724240319454500842; _ym_d=1735133736; _ga=GA1.2.1169286022.1735133736; accessToken=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJpbXJhbm92ZmFyaWRAZ21haWwuY29tIiwidXNlcklkIjoxLCJyb2xlcyI6WyJVc2VyIl0sImN1cnJlbnRfcm9sZSI6MSwiaWF0IjoxNzQ0ODAwMDg2LCJleHAiOjE3NDQ4MzYwODZ9.z_yffQ0RC23JxNrVwf-npNctmvFq7GZFgXbwsdmITM6tJvMNeyB3kpxdbtfM1nViB9A_g1gHjRBd8oxD0SZO-g;")
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
        test.log(Status.INFO, "Request sent: GET: //https://test-ahik-registry.aist.group/registry-api/trade-union?page=0&size=10&sort=regDate,desc");
        test.log(Status.PASS, "Response recevied: Status Code  " + response.statusCode());
        String collapsibleHTML = "<details><summary> Click to expand responseBody </summary><pre>" + responseBody + "</pre></details>";
        test.log(Status.PASS, "Response status code is"    + response.getStatusCode()   +  "and body:" + collapsibleHTML);

    }

    @AfterAll
    public static void tearDown(){
        extent.flush();
    }

}


