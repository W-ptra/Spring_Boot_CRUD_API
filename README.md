# Spring_Boot_CRUD_API
A simple RESTful API built with Spring Boot application that performs Create, Read, Update, and Delete (CRUD) operation on a "Product" table in MySQL database using JDBC Driver.
## API Endpoint
1. `GET http://localhost:8000/api/product`  

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
2. Run following command, change the environment variable
```
docker run -d -p 8000:8000 --name example-name -e PORT=PORT -e URL=URL -e USERNAME=USERNAME -e PASSWORD=PASSWORD wisnup001binus/spring-boot-crudapi:1.0
```