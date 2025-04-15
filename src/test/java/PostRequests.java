import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

public class PostRequests {
    @Test
    public void postObject(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "string");
        requestBody.put("regNumber", "string");
        requestBody.put("tpn", "2455740742");
        requestBody.put("memberUnionTpn", "9917478951");
        requestBody.put("totalEmployeeCount", 1);
        requestBody.put("representedOrganizationCount", 1);
        requestBody.put("memberCount", 1);
        requestBody.put("totalPayrollFund", 1);
        requestBody.put("monthlyMembershipFee", 1);
        requestBody.put("membershipFeeInterest", 0);
        requestBody.put("registrationDate", "2025-04-14");
        requestBody.put("tradeUnionType", "YHI");

        JSONObject legalAdress = new JSONObject();
        legalAdress.put("city", 0);
        legalAdress.put("house", "string");
        legalAdress.put("street", "string");
        legalAdress.put("apartment", "string");

        requestBody.put("legalAddress", legalAdress);
        JSONObject currentAddress = new JSONObject();
        currentAddress.put("city", 0);
        currentAddress.put("house", "string");
        currentAddress.put("street", "string");
        currentAddress.put("apartment", "string");

        requestBody.put("currentAddress", currentAddress);
        JSONArray contactInformations = new JSONArray();
        JSONObject contactInfo = new JSONObject();
        contactInfo.put("website", "string");
        contactInfo.put("personInCharge", "string");
        JSONObject position = new JSONObject();
        position.put("id", 0);
        position.put("name", "H/Ct>wr/*n'XQr$;&U|)pzv,Jz,K!&}EGGAtrzrsNG#Zymvgdm=_{fX#N}OkhF,T)T-~%gaLJFV)a_U[|fe");
        position.put("positionType", "TRADE_UNION_POSITION");

        contactInfo.put("position", position);

        JSONArray phoneNumbers = new JSONArray();
        phoneNumbers.put("string");
        contactInfo.put("phoneNumbers", phoneNumbers);

        JSONArray mails = new JSONArray();
        mails.put("string");
        contactInfo.put("mails", mails);

        contactInformations.put(contactInfo);
        requestBody.put("contactInformations", contactInformations);

        JSONArray managements = new JSONArray();
        JSONObject management = new JSONObject();
        management.put("fullName", "string");
        management.put("pin", "RG8H1O2");
        management.put("mainPhoneNumber", "string");
        management.put("additionalPhoneNumber", "string");
        management.put("mail", "string");
        management.put("selectionDate", "2025-04-14");

        managements.put(management);
        requestBody.put("managements", managements);
        JSONArray documents = new JSONArray();
        JSONObject document = new JSONObject();
        //document
        JSONArray fileIds = new JSONArray();
        fileIds.put("3fa85f64-5717-4562-b3fc-2c963f66afa6");

        document.put("fileIds", fileIds);
        document.put("name", "string");
        document.put("documentDate", "2025-04-14");

        documents.put(document);
        requestBody.put("documents", documents);


        Response response = RestAssured
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .when()
                .post("https://test-ahik-registry.aist.group/registry-api/trade-union");
        response.prettyPrint();
    }
    @Test
    public void postMembers(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "string");
        requestBody.put("surname", "string");
        requestBody.put("patronymic", "string");
        requestBody.put("pin", "qUcayc2");
        requestBody.put("monthlySalary", 1);
        requestBody.put("birthDate", "2025-04-14");
        requestBody.put("gender", "MALE");
        requestBody.put("maritalStatus", "SINGLE");
        requestBody.put("employerId", 0);

        JSONArray socialStatusIds = new JSONArray();
        socialStatusIds.put(0);
        requestBody.put("socialStatusIds", socialStatusIds);
        Response response = RestAssured
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .when()
                .post("https://test-ahik-registry.aist.group/registry-api/member");
        response.prettyPrint();
    }
    @Test
    public void postEmployer(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name", "string");
        requestBody.put("tpn", "1111625242");
        requestBody.put("collectiveAgreementNumber", "string");
        requestBody.put("previousYearsLaborDisputesResolutionInfo", "string");
        requestBody.put("laborSafetyAndProtectionMeasures", "string");
        requestBody.put("totalEmployeeCount", 1);
        requestBody.put("totalPayrollFund", 1);
        requestBody.put("monthlyMembershipFee", 1);
        requestBody.put("membershipFeeInterest", 0);
        requestBody.put("memberCount", 1);
        requestBody.put("tradeUnionRegDate", "2025-04-14");
        requestBody.put("collectiveAgreementDate", "2025-04-14");
        requestBody.put("legalForm", 0);
        requestBody.put("tradeUnionId", 0);

// Current Address
        JSONObject currentAddress = new JSONObject();
        currentAddress.put("city", 0);
        currentAddress.put("house", "string");
        currentAddress.put("street", "string");
        currentAddress.put("apartment", "string");
        requestBody.put("currentAddress", currentAddress);


        JSONObject legalAddress = new JSONObject();
        legalAddress.put("city", 0);
        legalAddress.put("house", "string");
        legalAddress.put("street", "string");
        legalAddress.put("apartment", "string");
        requestBody.put("legalAddress", legalAddress);

        JSONArray activityAreas = new JSONArray();
        activityAreas.put(0);
        requestBody.put("activityAreas", activityAreas);

        JSONArray contactInformations = new JSONArray();
        JSONObject contactInfo = new JSONObject();
        contactInfo.put("website", "string");
        contactInfo.put("personInCharge", "string");


        JSONObject position = new JSONObject();
        position.put("id", 0);
        position.put("name", "],:Fs,Kr+;Up*o(_d^vyij&#");
        position.put("positionType", "TRADE_UNION_POSITION");
        contactInfo.put("position", position);


        JSONArray phoneNumbers = new JSONArray();
        phoneNumbers.put("string");
        contactInfo.put("phoneNumbers", phoneNumbers);


        JSONArray mails = new JSONArray();
        mails.put("string");
        contactInfo.put("mails", mails);


        contactInformations.put(contactInfo);
        requestBody.put("contactInformations", contactInformations);

        System.out.println(requestBody.toString(4));

        Response response = RestAssured
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .when()
                .post("https://test-ahik-registry.aist.group/registry-api/employer");
        response.prettyPrint();

    }
}
