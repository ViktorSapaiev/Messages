# Messages
Make application which save messages of the organization. Don't worry about security and authentication at this time. 

#### Application features:

* Receive message and returns messages list;
* Request with empty phone number or message body should be rejected;
* Store message history for each organization;
* App will be used programmatically via its RESTful API (please use JAX-RS API).

## Installing

1. Clone this project on your computer
2. Open project from comand line
3. Run mvn spring-boot:run
4. Install Postman
5. Run Postman and import "Message.postman_collection.json"