API --- Application programming interface
It allows one app or system to talk to another app or system.

1. payment api ---- Stripe, razorpay
2. Google Maps 
3. weather api

**API in a layman term**

You --- Client
menu --- Documentation
Waiter --- API 
Kitchen --- Server 


**Categories**

- Open/Public --- Publicly available, little to no restriction. 
- Private --- not exposed to outside world, generally consumed with the org.
- Partner --- shared between business partners


**Dialects**

- REST --- Representational state transfer.. built on top of plain HTTP and uses JSON to send req & receive response.
- SOAP --- Simple Object Access protocol uses xml to define req & response and it is a strict messaging protocol.

HTTP --- Hyper text transfer protocol --- set of rules allows browser & server to communicate.

Methods inside the HTTP --- CRUD
- GET
- POST
- PUT
- DEL
- PATCH
- QUERY

REST ---- set of constraints defined by ROY Fielding
1. Client-server --- clients & servers can evolve independently
2. Statelessness --- every req carries all the info needed and server holds nothing between the calls
3. Uniform interface --- consistent way of naming and accessing the resources
4. Layered system --- client cant tell whether it is talking to server or there is a gateway in between.
5. Cacheability --- response can be reused. 
6. Code on demand (Optional)


https://www.ca.kayak.com/flights/YYZ-DEL/2026-12-02/2026-12-12ucs=jctk8o&so?rt=bestflight_a

Every request has 4 parts

- URL --- Base URL, endpoint, query params 
- Method 
- Headers --- metadata about the request
- Body 


API clients 
- Postman
- Bruno
- SOAPUI
- Swagger

