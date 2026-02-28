package ex_25_ENUM;

public enum Env {

    DEV("https://dev.myapp.com"),
    QA("https://qa.myapp.com"),
    STAGING("https://staging.myapp.com"),
    PREPROD("https://preprod.myapp.com"),
    UAT("https://uat.myapp.com"),
    PROD("https://www.myapp.com");

    private String baseURL;

    Env(String baseUrl)
    {
        this.baseURL = baseUrl;
    }
    public String getBaseURL()
    {
        return this.baseURL;
    }
}
