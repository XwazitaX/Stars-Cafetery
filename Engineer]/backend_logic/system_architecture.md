graph TD

Student[Student App] --> Login[Authentication System]

Login --> Menu[Browse Menu]
Menu --> Cart[Shopping Cart]
Cart --> Order[Create Order]

Order --> Backend[Order Management System]

Backend --> Inventory[Inventory System]
Backend --> Kitchen[Kitchen Dashboard]

Kitchen --> Staff[Kitchen Staff]
Staff --> Ready[Order Ready]

Ready --> Pickup[Student Pickup]
