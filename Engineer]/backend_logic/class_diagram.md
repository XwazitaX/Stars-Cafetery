classDiagram
    class User {
        +int userId
        +string fullName
        +string role
    }
    class Product {
        +string productId
        +string name
        +float price
        +int stock
    }
    class Order {
        +int orderId
        +string status
        +float totalAmount
        +placeOrder()
    }
    User "1" --> "many" Order : places
    Order "1" --> "many" Product : contains