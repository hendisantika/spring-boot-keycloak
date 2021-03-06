# spring-boot-keycloak

### Things todo list:

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-keycloak.git`
2. Navigate to the folder: `cd spring-boot-keycloak`
3. Run Keycloak Container using Docker Compose `docker compose up`
4. Import keycloak realm file

Get Token for Admin User Role

```shell
curl --location --request POST 'http://localhost:8080/auth/realms/PowerRanger/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'client_id=springboot-keycloak' \
--data-urlencode 'grant_type=password' \
--data-urlencode 'username=admin' \
--data-urlencode 'password=Naruto2022' \
--data-urlencode 'client_secret=yMRo7Pva3gIaXYgYqZESU5c3wcUeorMB'
```

Access URL for Admin Role

```shell
curl --location --request GET 'http://localhost:8888/employees' \
--header 'Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJHdDM5SUl2dUFBOGNXWVdCRG1KRnhROUFuMG9CMjRDMVdXYjM5bGlIS1o4In0.eyJleHAiOjE2NTI4NDUyNjksImlhdCI6MTY1Mjg0NDY2OSwianRpIjoiYzg2NzkyYWEtYzEyMS00YjU3LTliZjgtYjZjMzNjYjUxOTFkIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL2F1dGgvcmVhbG1zL1Bvd2VyUmFuZ2VyIiwiYXVkIjpbImxvZ2luLWFwcCIsImFjY291bnQiXSwic3ViIjoiZmY4ZTgxMjQtMjBiZC00ZDViLThjODYtNTBiODY2ZGJkM2IxIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoic3ByaW5nYm9vdC1rZXljbG9hayIsInNlc3Npb25fc3RhdGUiOiI2NjY4YmRkZS00NWQ0LTQ0ODQtYTA0Zi02NWQ5MjY0NzkwOTMiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbImh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsib2ZmbGluZV9hY2Nlc3MiLCJhZG1pbiIsIkFETUlOIiwidW1hX2F1dGhvcml6YXRpb24iLCJ1c2VyIiwiZGVmYXVsdC1yb2xlcy1wb3dlcnJhbmdlciJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImxvZ2luLWFwcCI6eyJyb2xlcyI6WyJ1c2VyIl19LCJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6InByb2ZpbGUgZW1haWwiLCJzaWQiOiI2NjY4YmRkZS00NWQ0LTQ0ODQtYTA0Zi02NWQ5MjY0NzkwOTMiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIm5hbWUiOiJBZG1pbiBVc2VyIiwicHJlZmVycmVkX3VzZXJuYW1lIjoiYWRtaW4iLCJnaXZlbl9uYW1lIjoiQWRtaW4iLCJmYW1pbHlfbmFtZSI6IlVzZXIiLCJlbWFpbCI6ImFkbWluQHlvcG1haWwuY29tIn0.PCA3aBwgKweZO5wtpuV0MrXn340okhPqyo75L0e8JtyeuFxmYLXotLW9avhB0xX8lD5fnlEdkfO6-8_U-p98jLELWQ35_gx-xKe1Qpq-CBtRCK2kYabR23tP4EOxh3shmeqztQbpW9OYqG0DGwmfr-eLfXgQY2edkmvUy_ayqz-6bQpSl1GNqj56uq3kmaifnLtygzfOmn3w_7k7s9hQe8U_JTer9Hinsyn4sSaaVGr0eEfX-u8eeyRUIEa7ma9Yt0bMtWQjQWEhE50o1xfj-OjnjLFzyaBmt8BTlEtpB6YEA2me94FQns7ogKhX9vEJr-WRAb0gtVrd8AQEfaXEtg' \
--header 'Cookie: JSESSIONID=6C2619B387FAA7B8D4CFF9D820ED7178'
```

Get Token for User Role

```shell
curl --location --request POST 'http://localhost:8080/auth/realms/PowerRanger/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Cookie: JSESSIONID=9251C46CFE32EC52D8A82B91F5A3311C.unknown-host; JSESSIONID=9251C46CFE32EC52D8A82B91F5A3311C' \
--data-urlencode 'client_id=springboot-keycloak' \
--data-urlencode 'grant_type=password' \
--data-urlencode 'username=user' \
--data-urlencode 'password=Naruto2022' \
--data-urlencode 'client_secret=yMRo7Pva3gIaXYgYqZESU5c3wcUeorMB'
```

Response

```shell
{
    "id": 1,
    "name": "naruto",
    "salary": 20000.0
}
```

Access URL for Admin Role

```shell
curl --location --request GET 'http://localhost:8888/employees/1' \
--header 'Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJHdDM5SUl2dUFBOGNXWVdCRG1KRnhROUFuMG9CMjRDMVdXYjM5bGlIS1o4In0.eyJleHAiOjE2NTI4NDQ4ODMsImlhdCI6MTY1Mjg0NDI4MywianRpIjoiZjk5OGU2ZjMtOWY2NS00ZjA5LWIwNTMtOGYzNjZkZjNhNTFlIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL2F1dGgvcmVhbG1zL1Bvd2VyUmFuZ2VyIiwiYXVkIjpbImxvZ2luLWFwcCIsImFjY291bnQiXSwic3ViIjoiYTFkMTQ1NDYtZWJmZi00NDg2LTljM2YtNGEzNjNiYWU0NTlkIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoic3ByaW5nYm9vdC1rZXljbG9hayIsInNlc3Npb25fc3RhdGUiOiIyYTZlZDkxMy00N2RiLTRmZDMtYmM5Yy1iMTUxY2RkYWJkYzAiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbImh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCJdLCJyZWFsbV9hY2Nlc3MiOnsicm9sZXMiOlsib2ZmbGluZV9hY2Nlc3MiLCJ1bWFfYXV0aG9yaXphdGlvbiIsIlVTRVIiLCJ1c2VyIiwiZGVmYXVsdC1yb2xlcy1wb3dlcnJhbmdlciJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImxvZ2luLWFwcCI6eyJyb2xlcyI6WyJ1c2VyIl19LCJhY2NvdW50Ijp7InJvbGVzIjpbIm1hbmFnZS1hY2NvdW50IiwibWFuYWdlLWFjY291bnQtbGlua3MiLCJ2aWV3LXByb2ZpbGUiXX19LCJzY29wZSI6InByb2ZpbGUgZW1haWwiLCJzaWQiOiIyYTZlZDkxMy00N2RiLTRmZDMtYmM5Yy1iMTUxY2RkYWJkYzAiLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsIm5hbWUiOiJVc2VyIFJvbGUiLCJwcmVmZXJyZWRfdXNlcm5hbWUiOiJ1c2VyIiwiZ2l2ZW5fbmFtZSI6IlVzZXIiLCJmYW1pbHlfbmFtZSI6IlJvbGUiLCJlbWFpbCI6InVzZXJAeW9wbWFpbC5jb20ifQ.fBEjBtroyQYuL5B59jZSYPS-bMIoe7wBBya7jIqpvLqLt_hbdaEIEv2anWq0O2mmp5tOCY51rpJRVQnc_0E4JlcEUzcE1LxaMVhTfAIVAk66YQzJShjzvCjyWuC3XD0AdEpQ0WS_Y4P3Ihswe5kC0AAd7dl8JAPFH81c7LMfvKeVxWIJ1CGWxZF7EYZr77WXpnZ6r5BvISnumon0FHC5XCKa22Jsd2HKBkRxlmNcRfDt9sRERxtljTM6W4iL34gx-IfLhO3Q7dpMXMAR17N628NLPmReor6d9aajSLkVdWkBgy5omW3qjrdK-lOohVcE_PeTI8Hs2WSbkJ63xMKnwA' \
--header 'Cookie: JSESSIONID=6C2619B387FAA7B8D4CFF9D820ED7178'
```

```shell
[
    {
        "id": 1,
        "name": "naruto",
        "salary": 20000.0
    },
    {
        "id": 2,
        "name": "sasuke",
        "salary": 55000.0
    },
    {
        "id": 3,
        "name": "sakura",
        "salary": 120000.0
    },
    {
        "id": 4,
        "name": "kakashi",
        "salary": 120000.0
    },
    {
        "id": 5,
        "name": "hinata",
        "salary": 120000.0
    },
    {
        "id": 6,
        "name": "kiba",
        "salary": 120000.0
    },
    {
        "id": 7,
        "name": "shino",
        "salary": 120000.0
    },
    {
        "id": 8,
        "name": "asuma",
        "salary": 120000.0
    },
    {
        "id": 9,
        "name": "shikamaru",
        "salary": 120000.0
    },
    {
        "id": 10,
        "name": "choji",
        "salary": 120000.0
    },
    {
        "id": 11,
        "name": "ino",
        "salary": 120000.0
    }
]
```