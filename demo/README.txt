// setup database
1. Download Mysql server
2. Downlaod Mysql Workbench
3. Username:root, password:password1234

//sample postman request CURL
curl --location 'http://localhost:8080/api/v1/employees' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=22C10CC1CF349D3E73DF35183E457EB3' \
--data-raw '{
    "employeeId":"123456",
    "firstName": "Murali1",
    "lastName": "krishna12",
    "email":"krishna@gmail.com",
    "phoneNumbers": ["9000875907","123456789"],
    "doj": "2023-09-03",
    "salary": 10000
}'