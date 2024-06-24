# Spring_Boot_CRUD_API
A simple RESTful API built with Spring Boot application that performs Create, Read, Update, and Delete (CRUD) operation on a "Product" table in MySQL database using JDBC Driver.
## API Endpoint
1. `GET http://localhost:8000/api/product`  

Retrieve all product data from database   

Respond:
```
[
    {
        "id": 1,
        "name": "Almond",
        "price": 24000
    },
    {
        "id": 2,
        "name": "Chocolate",
        "price": 8000
    }
]
```
2. `GET http://localhost:8000/api/product/2`

Retrieve a single product data identified by id 2

Respond:
```
[
    {
        "id": 2,
        "name": "Chocolate",
        "price": 8000
    }
]
```
3. `POST http://localhost:8000/api/product`

Create a new product and store it on database

Request:
```
{
    "name":"Blueberry",
    "price":6000
}
```
Respond:
```
{
    "message": "Product Created Sucessfully"
}
```
4. `PUT http://localhost:8000/api/product/2`

Make a update to specified product that identified by id 2

Request:
```
{
    "name":"Gummy Bear",
    "price":11000
}
```

Respond:
```
{
    "message": "Product Updated Sucessfully"
}
```
5. `DELETE http://localhost:8000/api/product/2`

Delete a certain product on database identified by id 2

Respond:
```
{
    "message": "Product Deleted Sucessfully"
}
```
## DOCKER USAGE
1. Pull image
```
docker pull wisnup001binus/spring-boot-crudapi:1.0
```
2. Run following command, change the environment variable `PORT`,`URL`,`USERNAME`,`PASSWORD`
```
docker run -d -p PORT:PORT --name example-name -e PORT=PORT -e URL=URL -e USERNAME=USERNAME -e PASSWORD=PASSWORD wisnup001binus/spring-boot-crudapi:1.0
```