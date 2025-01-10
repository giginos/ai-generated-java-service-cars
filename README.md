# Test Your API
You can test your API using Postman or any other API testing tool. Here are the endpoints based on your requirements:

## Get Car by ID:
Method: GET
URL: http://localhost:8080/cars/v1/detail/651aa91509beb3613027667e
Get All Cars:


## Get list of all cars
Method: GET
URL: http://localhost:8080/cars/v1/list
Create Car:

## Add car
Method: POST
URL: http://localhost:8080/cars/v1/detail
Body (json):
```
{
    "manufacturer": "Volkswagen",
    "modelname": "Käfer",
    "modeltype": "Typ 11",
    "licenseplate": "D-VW 1",
    "productiondate": "1964-03-17"
}
```

## Update Car:
Method: PUT
URL: http://localhost:8080/cars/v1/detail/663499c3e4b2eb445818120b
Body (json):
```
{
    "manufacturer": "Volkswagen",
    "modelname": "Käfer",
    "modeltype": "Typ 11",
    "licenseplate": "D-VW 1",
    "productiondate": "1964-03-17"
}
```
